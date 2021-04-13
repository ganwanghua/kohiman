package com.pinuoke.kohiman.customer;

import androidx.fragment.app.Fragment;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.weight.SwitchView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CustomerFragment extends BaseFragment {
    @BindView(R.id.switchView)
    SwitchView switchView;

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
}
