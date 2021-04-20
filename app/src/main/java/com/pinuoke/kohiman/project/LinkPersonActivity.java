package com.pinuoke.kohiman.project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.ProjectClientAdapter;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.model.ProjectClientListModel;
import com.pinuoke.kohiman.model.ProjectConfigModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;
import com.pinuoke.kohiman.weight.CommItemDecoration;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LinkPersonActivity extends BaseActivity implements OnRefreshLoadMoreListener {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    @BindView(R.id.ed_search)
    EditText edSearch;
    private DataRepository dataRepository;
    private int page = 1;
    private String keyword = "";
    List<ProjectClientListModel.DataBean> dataBeanList = new ArrayList<>();
    private ProjectClientAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_person);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initView() {
        recycleView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        recycleView.addItemDecoration(new CommItemDecoration(mContext, DividerItemDecoration.VERTICAL, getResources().getColor(R.color.white1), 15));
        adapter = new ProjectClientAdapter(mContext);
        recycleView.setAdapter(adapter);
        refresh.setOnRefreshLoadMoreListener(this);
        adapter.setOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<ProjectClientListModel.DataBean>() {
            @Override
            public void onItemViewClick(View view, int position, ProjectClientListModel.DataBean o) {
                Intent intent = new Intent();
                intent.putExtra("client",o);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        edSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    ((InputMethodManager) edSearch.getContext().getSystemService(Context.INPUT_METHOD_SERVICE))
                            .hideSoftInputFromWindow(
                                   getWindow().getDecorView().getWindowToken(),
                                    InputMethodManager.HIDE_NOT_ALWAYS);
                    keyword = edSearch.getText().toString();
                    page=1;
                    dataBeanList.clear();
                    projectClientList();
                    return true;
                }
                return false;
            }
        });

    }

    private void initData() {
        dataRepository = Injection.dataRepository(mContext);
        projectClientList();
    }

    private void projectClientList() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/project.index/clientList");
        map.put("keyword", keyword);
        map.put("page",page+"");
        dataRepository.projectClientList(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
                refresh.finishLoadMore(false);
                refresh.finishRefresh();
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                refresh.finishRefresh();
                refresh.finishLoadMore();
                ProjectClientListModel clientListModel = (ProjectClientListModel) data;
                if (clientListModel.getCode() == 1) {
                    dataBeanList.addAll(clientListModel.getData());
                    adapter.setData(dataBeanList);

                }

            }
        });
    }




    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        projectClientList();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        keyword = "";
        page=1;
        dataBeanList.clear();
        projectClientList();
    }
}
