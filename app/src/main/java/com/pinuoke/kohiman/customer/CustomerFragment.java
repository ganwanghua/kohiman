package com.pinuoke.kohiman.customer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.weight.SwitchView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String event) {
       if (event.equals("2")){
           getFragmentManager().beginTransaction().replace(R.id.fl_banner, new MyCustomerListFragment()).commitAllowingStateLoss();
        }
    }
}
