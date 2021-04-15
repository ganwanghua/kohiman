package com.pinuoke.kohiman.customer;

import android.widget.ListView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.TraceListAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.CustomerDetailsModel;

import java.util.List;

import butterknife.BindView;

public class FollowUpRecordFragment extends BaseFragment {
    @BindView(R.id.lvTrace)
    ListView lvTrace;
    private List<CustomerDetailsModel.DataBean.FollowLogBean> followLog;
    private TraceListAdapter adapter;

    public FollowUpRecordFragment(List<CustomerDetailsModel.DataBean.FollowLogBean> followLog) {
        this.followLog = followLog;
    }

    @Override
    protected void initView() {
        adapter = new TraceListAdapter(getActivity());
        lvTrace.setAdapter(adapter);
        adapter.setData(followLog);
    }

    @Override
    protected int LayoutId() {
        return R.layout.follow_up_record;
    }
}
