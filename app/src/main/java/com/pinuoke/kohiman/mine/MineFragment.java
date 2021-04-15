package com.pinuoke.kohiman.mine;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.login.LoginActivity;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.utils.DataCleanManager;
import com.pinuoke.kohiman.utils.FastData;
import com.pinuoke.kohiman.weight.RoundImageView;
import com.timmy.tdialog.TDialog;
import com.timmy.tdialog.base.BindViewHolder;
import com.timmy.tdialog.listener.OnBindViewListener;
import com.timmy.tdialog.listener.OnViewClickListener;

import butterknife.BindView;
import butterknife.OnClick;

public class MineFragment extends BaseFragment {

    @BindView(R.id.iv_setting)
    ImageView ivSetting;
    @BindView(R.id.iv_community)
    ImageView ivCommunity;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.iv_avatar)
    RoundImageView ivAvatar;
    @BindView(R.id.rl_code)
    RelativeLayout rlCode;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.iv_data)
    ImageView ivData;
    @BindView(R.id.rl_data)
    RelativeLayout rlData;
    @BindView(R.id.iv_customer)
    ImageView ivCustomer;
    @BindView(R.id.rl_customer)
    RelativeLayout rlCustomer;
    @BindView(R.id.iv_project)
    ImageView ivProject;
    @BindView(R.id.rl_project)
    RelativeLayout rlProject;
    @BindView(R.id.iv_advise)
    ImageView ivAdvise;
    @BindView(R.id.rl_advise)
    RelativeLayout rlAdvise;
    @BindView(R.id.iv_clear)
    ImageView ivClear;
    @BindView(R.id.rl_clear)
    RelativeLayout rlClear;
    @BindView(R.id.iv_exit)
    ImageView ivExit;
    @BindView(R.id.rl_exit)
    RelativeLayout rlExit;
    @BindView(R.id.tv_clean)
    TextView tvClean;
    private DataRepository dataRepository;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initData() {
        try {
            tvClean.setText(DataCleanManager.getTotalCacheSize(mContext));
        } catch (Exception e) {
            e.printStackTrace();
        }
        dataRepository = Injection.dataRepository(mContext);
    }

    @OnClick({R.id.rl_data, R.id.rl_customer, R.id.rl_project, R.id.rl_advise, R.id.rl_clear, R.id.rl_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_data:
                break;
            case R.id.rl_customer:
                break;
            case R.id.rl_project:
                break;
            case R.id.rl_advise:
                break;
            case R.id.rl_clear:
                DataCleanManager.clearAllCache(mContext);
                try {
                    tvClean.setText(DataCleanManager.getTotalCacheSize(mContext));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ToastUtils.showToast("清除缓存成功");
                break;
            case R.id.rl_exit:
                showExitDialog();
                break;
        }
    }

    private void exit() {
        FastData.setToken("");
        Intent intent = new Intent(mContext, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        getActivity().finish();

    }

    private void showExitDialog() {
        new TDialog.Builder(getActivity().getSupportFragmentManager())
                .setLayoutRes(R.layout.exit_dialog)
                .setScreenWidthAspect(getContext(), 0.7f)
                .setGravity(Gravity.CENTER)
                .setCancelableOutside(false)
                .addOnClickListener(R.id.tv_cancel, R.id.tv_sure)
                .setOnBindViewListener(new OnBindViewListener() {
                    @Override
                    public void bindView(BindViewHolder viewHolder) {
                    }
                })
                .setOnViewClickListener(new OnViewClickListener() {
                    @Override
                    public void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog) {
                        switch (view.getId()) {
                            case R.id.tv_cancel:
                                tDialog.dismiss();
                                break;
                            case R.id.tv_sure:
                                exit();
                                tDialog.dismiss();

                                break;
                        }
                    }
                })
                .create()
                .show();
    }


}
