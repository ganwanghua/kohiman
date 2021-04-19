package com.pinuoke.kohiman.project;

import android.text.TextUtils;
import android.widget.TextView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.ProjectDetailModel;

import butterknife.BindView;

public class ClientInformationFragment extends BaseFragment {

    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_role)
    TextView tvRole;
    @BindView(R.id.tv_link_person)
    TextView tvLinkPerson;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    private ProjectDetailModel projectDetailModel;

    public ClientInformationFragment(ProjectDetailModel projectDetailModel) {
        this.projectDetailModel = projectDetailModel;
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_client_information;
    }

    @Override
    protected void initData() {
        tvName.setText(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getName());
        tvRole.setText(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getRole_id()+"");
        tvLinkPerson.setText(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getLink_name());
        tvLinkPerson.setText(projectDetailModel.getData().getDetail().getClient().get(0).getPhone());

    }
}
