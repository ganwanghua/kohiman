package com.pinuoke.kohiman.project;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dd.ShadowLayout;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.ProjectAdapter;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.customer.MyCustomerListFragment;
import com.pinuoke.kohiman.model.MyProjectListModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

public class ProjectFragment extends BaseFragment implements OnRefreshLoadMoreListener {

    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    @BindView(R.id.upload_event)
    ImageView uploadEvent;
    @BindView(R.id.fab_plus)
    ShadowLayout fabPlus;
    private DataRepository dataRepository;
    private ProjectAdapter adapter;
    private List<MyProjectListModel.DataBeanX.ListBean.DataBean> dataBeanList = new ArrayList<>();

    private int page = 1;


    @Override
    protected int LayoutId() {
        return R.layout.fragment_project;
    }

    @Override
    protected void initView() {
        adapter = new ProjectAdapter(mContext);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapter);
        refresh.setOnRefreshLoadMoreListener(this);
        adapter.setOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<MyProjectListModel.DataBeanX.ListBean.DataBean>() {
            @Override
            public void onItemViewClick(View view, int position, MyProjectListModel.DataBeanX.ListBean.DataBean o) {
                switch (view.getId()) {
                    case R.id.tv_edit:
                        Intent intent1 = new Intent(mContext, EditProjectActivity.class);
                        intent1.putExtra("project_id", o.getProject_id() + "");
                        intent1.putExtra("DataBean", o);
                        startActivity(intent1);
                        break;
                    case R.id.tv_follow_up:
                        Intent intent = new Intent(mContext, FollowUpProjectActivity.class);
                        intent.putExtra("project_name", o.getName());
                        intent.putExtra("contacts", o.getClient().get(0).getClient().getLink_name());
                        intent.putExtra("project_id", o.getProject_id() + "");
                        startActivity(intent);
                        break;

                    default:
                        Intent intent2 = new Intent(mContext, ProjectDetailsActivity.class);
                        intent2.putExtra("project_id", o.getProject_id() + "");
                        intent2.putExtra("DataBean", o);
                        startActivity(intent2);
                        break;

                }
            }
        });
    }

    @Override
    protected void initData() {
        dataRepository = Injection.dataRepository(mContext);
        myProjectList();
    }

    private void myProjectList() {
        ViewLoading.show(getActivity());
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/project.index/my");
        map.put("page", page + "");
        map.put("token", FastData.getToken());
        dataRepository.myProjectList(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                refresh.finishRefresh();
                refresh.finishLoadMore();
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                refresh.finishRefresh();
                ViewLoading.dismiss(mContext);
                MyProjectListModel myProjectListModel = (MyProjectListModel) data;
                if (myProjectListModel.getCode() == 1) {
                    if (myProjectListModel.getData().getList().getCurrent_page() == myProjectListModel.getData().getList().getLast_page()) {
                        refresh.finishLoadMoreWithNoMoreData();
                    } else {
                        refresh.finishLoadMore();
                    }
                    dataBeanList.addAll(myProjectListModel.getData().getList().getData());
                    adapter.setData(dataBeanList);
                }
            }
        });
    }


    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        myProjectList();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        dataBeanList.clear();
        myProjectList();
    }

    @OnClick(R.id.fab_plus)
    public void onViewClicked() {
        startActivity(new Intent(mContext, CreateProjectActivity.class));
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String event) {
        if (event.equals("4")) {
            page = 1;
            dataBeanList.clear();
            myProjectList();
        }
    }
}
