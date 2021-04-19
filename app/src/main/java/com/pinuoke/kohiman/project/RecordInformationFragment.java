package com.pinuoke.kohiman.project;

import android.text.TextUtils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.RecordAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.ProjectDetailModel;

import java.util.List;

import butterknife.BindView;

public class RecordInformationFragment extends BaseFragment {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private ProjectDetailModel projectDetailModel;

    public RecordInformationFragment(ProjectDetailModel projectDetailModel) {
        this.projectDetailModel = projectDetailModel;
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_record_information;
    }

    @Override
    protected void initData() {
        RecordAdapter adapter = new RecordAdapter(mContext);
        List<ProjectDetailModel.DataBean.FollowLogBean> followLog = projectDetailModel.getData().getFollowLog();
        adapter.setData(followLog);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(adapter);

    }
}
