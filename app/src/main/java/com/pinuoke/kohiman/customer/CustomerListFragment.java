package com.pinuoke.kohiman.customer;

import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.CustomerListAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.MyCustomerListModel;
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

public class CustomerListFragment extends BaseFragment implements OnRefreshLoadMoreListener {
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private String is_followed;
    private String status_id;
    private int i;
    private DataRepository dataRepository;
    private CustomerListAdapter customerListAdapter;
    private int page = 1;
    private List<MyCustomerListModel.DataBeanX.ListBean.DataBean> dataBeanList = new ArrayList<>();

    public CustomerListFragment(int i, String is_followed, String status_id) {
        this.status_id = status_id;
        this.is_followed = is_followed;
        this.i = i;
    }

    @Override
    protected int LayoutId() {
        return R.layout.customer_list;
    }

    @Override
    protected void initView() {
        dataRepository = Injection.dataRepository(getActivity());
        recycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        customerListAdapter = new CustomerListAdapter(getActivity(), i);
        recycleView.setAdapter(customerListAdapter);
        refresh.setOnRefreshLoadMoreListener(this);

        if (i == 0 || i == 1) {
            myCustomerList(page, is_followed);
        } else {
            myCustomerList1(page, status_id);
        }
    }


    private void myCustomerList(int page, String s) {
        ViewLoading.show(getActivity());
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/my");
        map.put("is_followed", s);
        map.put("page", page + "");
        map.put("token", FastData.getToken());
        dataRepository.myCustomerList(map, new RemotDataSource.getCallback() {
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
                MyCustomerListModel myCustomerListModel = (MyCustomerListModel) data;
                if (myCustomerListModel.getCode() == 1) {
                    if (myCustomerListModel.getData().getList().getCurrent_page() == myCustomerListModel.getData().getList().getLast_page()) {
                        refresh.finishLoadMoreWithNoMoreData();
                    } else {
                        refresh.finishLoadMore();
                    }
                    dataBeanList.addAll(myCustomerListModel.getData().getList().getData());
                    customerListAdapter.setData(dataBeanList);
                }
            }
        });
    }

    private void myCustomerList1(int page, String s) {
        ViewLoading.show(getActivity());
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/my");
        map.put("status_id", s);
        map.put("page", page + "");
        map.put("token", FastData.getToken());
        dataRepository.myCustomerList(map, new RemotDataSource.getCallback() {
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
                MyCustomerListModel myCustomerListModel = (MyCustomerListModel) data;
                if (myCustomerListModel.getCode() == 1) {
                    if (myCustomerListModel.getData().getList().getCurrent_page() == myCustomerListModel.getData().getList().getLast_page()) {
                        refresh.finishLoadMoreWithNoMoreData();
                    } else {
                        refresh.finishLoadMore();
                    }

                    dataBeanList.addAll(myCustomerListModel.getData().getList().getData());
                    customerListAdapter.setData(dataBeanList);
                }
            }
        });
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        if (i == 0 || i == 1) {
            myCustomerList(page, is_followed);
        } else {
            myCustomerList1(page, status_id);
        }
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        dataBeanList.clear();
        if (i == 0 || i == 1) {
            myCustomerList(page, is_followed);
        } else {
            myCustomerList1(page, status_id);
        }
    }
}
