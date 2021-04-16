package com.pinuoke.kohiman.customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.CustomerListAdapter;
import com.pinuoke.kohiman.common.BaseAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.BatchToSeasModel;
import com.pinuoke.kohiman.model.MyCustomerListModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.timmy.tdialog.TDialog;
import com.timmy.tdialog.base.BindViewHolder;
import com.timmy.tdialog.listener.OnBindViewListener;
import com.timmy.tdialog.listener.OnViewClickListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.Serializable;
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
    private EditText ed_mark;

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

        customerListAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                switch (view.getId()) {
                    case R.id.ll_delete:
                        cancel(dataBeanList.get(position).getClue_id(), dataBeanList.get(position).getName());
                        break;
                    case R.id.rl_user:
                        Intent intent = new Intent(getContext(), CustomerDetailsActivity.class);
                        intent.putExtra("pos", position);
                        intent.putExtra("data", (Serializable) dataBeanList);
                        intent.putExtra("clue_id", dataBeanList.get(position).getClue_id() + "");
                        startActivity(intent);
                        break;
                    case R.id.tv_follow_up:
                        Intent intent1 = new Intent(getContext(), FollowUpActivity.class);
                        intent1.putExtra("clue_id", dataBeanList.get(position).getClue_id() + "");
                        intent1.putExtra("name", dataBeanList.get(position).getName());
                        intent1.putExtra("userName", dataBeanList.get(position).getLink_name());
                        intent1.putExtra("status", dataBeanList.get(position).getStatus() == null ? "" : dataBeanList.get(position).getStatus().getName());
                        intent1.putExtra("status_id", dataBeanList.get(position).getStatus_id() + "");
                        startActivity(intent1);
                        break;
                    case R.id.tv_edit:
                        Intent intent2 = new Intent(getContext(), EditCustomersActivity.class);
                        intent2.putExtra("data", (Serializable) dataBeanList);
                        intent2.putExtra("pos", position);
                        startActivity(intent2);
                        break;
                }
            }
        });
        if (i == 0 || i == 1) {
            myCustomerList(page, is_followed);
        } else {
            myCustomerList1(page, status_id);
        }
    }

    private void cancel(int id, String name1) {
        new TDialog.Builder(getFragmentManager())
                .setLayoutRes(R.layout.order_cancel_dialog)
                .setScreenWidthAspect(mContext, 0.7f)
                .setGravity(Gravity.CENTER)
                .setCancelableOutside(false)
                .addOnClickListener(R.id.iv_cancel, R.id.tv_cancel, R.id.tv_sure)
                .setOnBindViewListener(new OnBindViewListener() {
                    @Override
                    public void bindView(BindViewHolder viewHolder) {
                        TextView name = viewHolder.getView(R.id.tv_name);
                        ed_mark = viewHolder.getView(R.id.ed_mark);
                        name.setText("确定将客户" + name1 + "移入公海吗？");
                    }
                })
                .setOnViewClickListener(new OnViewClickListener() {
                    @Override
                    public void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog) {
                        switch (view.getId()) {
                            case R.id.tv_cancel:
                            case R.id.iv_cancel:
                                tDialog.dismiss();
                                break;
                            case R.id.tv_sure:
                                if (ed_mark.getText().toString().length() > 0) {
                                    batchToSeas(id, ed_mark.getText().toString());
                                    tDialog.dismiss();
                                } else {
                                    ToastUtils.showToast("请输入备注信息");
                                }
                                break;
                        }
                    }
                })
                .create()
                .show();
    }

    private void batchToSeas(int id, String mark) {
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/batchtoseas");
        map.put("clue_ids[]", id + "");
        map.put("remark", mark);
        map.put("token", FastData.getToken());
        dataRepository.batchToSeas(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
            }

            @Override
            public void onSuccess(Object data) {
                BatchToSeasModel batchToSeasModel = (BatchToSeasModel) data;
                if (batchToSeasModel.getCode() == 1) {
                    ToastUtils.showToast("移除成功");
                    page = 1;
                    dataBeanList.clear();
                    if (i == 0 || i == 1) {
                        myCustomerList(page, is_followed);
                    } else {
                        myCustomerList1(page, status_id);
                    }
                }
            }
        });
    }

    private void myCustomerList(int page, String s) {
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
            }

            @Override
            public void onSuccess(Object data) {
                refresh.finishRefresh();
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
            }

            @Override
            public void onSuccess(Object data) {
                refresh.finishRefresh();
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String event) {
        if (event.equals("1")) {
            page = 1;
            dataBeanList.clear();
            if (i == 0) {
                myCustomerList(page, is_followed);
            }
        }
    }
}
