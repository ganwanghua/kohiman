package com.pinuoke.kohiman.workbench;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.project.CreateProjectActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.OnClick;

public class WorkBenchFragment extends BaseFragment {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_log)
    ImageView ivLog;
    @BindView(R.id.iv_new_project)
    ImageView ivNewProject;
    @BindView(R.id.iv_project_manager)
    ImageView ivProjectManager;
    @BindView(R.id.iv_team)
    ImageView ivTeam;
    @BindView(R.id.iv_organization)
    ImageView ivOrganization;
    @BindView(R.id.iv_submit)
    ImageView ivSubmit;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_work_bench;
    }

    @OnClick({R.id.iv_log, R.id.iv_new_project, R.id.iv_project_manager, R.id.iv_team, R.id.iv_organization, R.id.iv_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_log:
                startActivity(new Intent(getContext(), LogActivity.class));
                break;
            case R.id.iv_new_project:
                startActivity(new Intent(getContext(), CreateProjectActivity.class));
                break;
            case R.id.iv_project_manager:
                EventBus.getDefault().post("3");
                break;
            case R.id.iv_submit:
            case R.id.iv_team:
            case R.id.iv_organization:
                ToastUtils.showToast("暂未开放");
                break;
        }
    }
}
