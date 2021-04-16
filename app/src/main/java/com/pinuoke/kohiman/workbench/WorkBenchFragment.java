package com.pinuoke.kohiman.workbench;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;

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

    @Override
    protected int LayoutId() {
        return R.layout.fragment_work_bench;
    }

    @OnClick({R.id.iv_log, R.id.iv_new_project, R.id.iv_project_manager})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_log:
                break;
            case R.id.iv_new_project:
                break;
            case R.id.iv_project_manager:
                break;
        }
    }
}
