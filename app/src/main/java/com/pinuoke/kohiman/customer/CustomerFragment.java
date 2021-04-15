package com.pinuoke.kohiman.customer;

import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.weight.SwitchView;

import butterknife.BindView;
import butterknife.OnClick;

public class CustomerFragment extends BaseFragment {
    @BindView(R.id.switchView)
    SwitchView switchView;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.fl_banner)
    FrameLayout flBanner;
    @BindView(R.id.upload_event)
    ImageView uploadEvent;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_customer;
    }

    @Override
    protected void initView() {
        switchFragment(new MyCustomerListFragment());

        switchView.setOnClickCheckedListener(new SwitchView.onClickCheckedListener() {
            @Override
            public void onClick() {
                if (switchView.isChecked()) {
                    switchFragment(new HighSeasCustomersFragment());
                } else {
                    switchFragment(new MyCustomerListFragment());
                }
            }
        });
    }

    private void switchFragment(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.fl_banner, fragment).commitAllowingStateLoss();
    }

    @OnClick(R.id.upload_event)
    public void onViewClicked() {
        startActivity(new Intent(getContext(), NewCustomersActivity.class));
    }
}
