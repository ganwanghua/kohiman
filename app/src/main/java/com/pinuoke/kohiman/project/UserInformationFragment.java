package com.pinuoke.kohiman.project;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.UserInfoAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.ProjectDetailModel;

import java.util.List;

import butterknife.BindView;

public class UserInformationFragment extends BaseFragment {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private ProjectDetailModel projectDetailModel;

    public UserInformationFragment(ProjectDetailModel projectDetailModel) {
        this.projectDetailModel = projectDetailModel;
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_user_information;
    }

    @Override
    protected void initData() {
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        UserInfoAdapter adapter = new UserInfoAdapter(mContext);
        adapter.setData(projectDetailModel.getData().getDetail().getUser());
        recyclerView.setAdapter(adapter);

    }
}
