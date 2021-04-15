package com.pinuoke.kohiman.customer;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.CustomerListAdapter;
import com.pinuoke.kohiman.adapter.SeasListAdapter;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.BatchToSeasModel;
import com.pinuoke.kohiman.model.MyCustomerListModel;
import com.pinuoke.kohiman.model.SeasListModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class HighSeasCustomersFragment extends BaseFragment implements OnRefreshLoadMoreListener {
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private DataRepository dataRepository;
    private SeasListAdapter seasListAdapter;
    private int page = 1;
    private List<SeasListModel.DataBeanX.ListBean.DataBean> dataBeanList = new ArrayList<>();

    @Override
    protected int LayoutId() {
        return R.layout.high_seas_customers;
    }

    @Override
    protected void initView() {
        dataRepository = Injection.dataRepository(getActivity());
        recycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        seasListAdapter = new SeasListAdapter(getActivity());
        recycleView.setAdapter(seasListAdapter);
        refresh.setOnRefreshLoadMoreListener(this);
        seasListAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                batchGetClue(dataBeanList.get(position).getClue_id());
            }
        });
        seasList(page);
    }

    private void batchGetClue(int clue_id) {
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/batchGetClue");
        map.put("clue_ids[]", clue_id + "");
        map.put("token", FastData.getToken());
        dataRepository.batchGetClue(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
            }

            @Override
            public void onSuccess(Object data) {
                BatchToSeasModel batchToSeasModel = (BatchToSeasModel) data;
                if (batchToSeasModel.getCode() == 1) {
                    ToastUtils.showToast("领取成功");
                    page = 1;
                    dataBeanList.clear();
                    seasList(page);
                }
            }
        });
    }

    private void seasList(int page) {
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/seas");
        map.put("page", page + "");
        map.put("token", FastData.getToken());
        dataRepository.seasList(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                refresh.finishRefresh();
                refresh.finishLoadMore();
            }

            @Override
            public void onSuccess(Object data) {
                refresh.finishRefresh();
                SeasListModel seasListModel = (SeasListModel) data;
                if (seasListModel.getCode() == 1) {
                    if (seasListModel.getData().getList().getCurrent_page() == seasListModel.getData().getList().getLast_page()) {
                        refresh.finishLoadMoreWithNoMoreData();
                    } else {
                        refresh.finishLoadMore();
                    }
                    dataBeanList.addAll(seasListModel.getData().getList().getData());
                    seasListAdapter.setData(dataBeanList);
                }
            }
        });
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        seasList(page);
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        dataBeanList.clear();
        seasList(page);
    }
}
