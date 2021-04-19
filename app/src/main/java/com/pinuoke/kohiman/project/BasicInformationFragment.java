package com.pinuoke.kohiman.project;

import android.text.TextUtils;
import android.widget.TextView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.model.ProjectDetailModel;

import butterknife.BindView;

public class BasicInformationFragment extends BaseFragment {
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_stage)
    TextView tvStage;
    @BindView(R.id.tv_start_time)
    TextView tvStartTime;
    @BindView(R.id.tv_end_time)
    TextView tvEndTime;
    @BindView(R.id.tv_important)
    TextView tvImportant;
    @BindView(R.id.tv_create_time)
    TextView tvCreateTime;
    @BindView(R.id.tv_detail)
    TextView tvDetail;
    private ProjectDetailModel projectDetailModel;

    public BasicInformationFragment(ProjectDetailModel projectDetailModel) {
        this.projectDetailModel = projectDetailModel;
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_basic_information;
    }

    @Override
    protected void initData() {
        tvName.setText(projectDetailModel.getData().getDetail().getName());
        tvType.setText(projectDetailModel.getData().getDetail().getCategory().getName());
        tvStage.setText(projectDetailModel.getData().getDetail().getStatus().getName());
        tvStartTime.setText(projectDetailModel.getData().getDetail().getStart_time());
        if(!TextUtils.isEmpty(projectDetailModel.getData().getDetail().getEnd_time()))
        {
        tvEndTime.setText(projectDetailModel.getData().getDetail().getEnd_time());
        }else {
            tvEndTime.setText("--");
        }
        if(projectDetailModel.getData().getDetail().getIs_emphasis()==1){
            tvImportant.setText("是");
        }else {
            tvImportant.setText("否");
        }
        tvCreateTime.setText(projectDetailModel.getData().getDetail().getCreate_time());
        tvDetail.setText(projectDetailModel.getData().getDetail().getDetail());

    }
}
