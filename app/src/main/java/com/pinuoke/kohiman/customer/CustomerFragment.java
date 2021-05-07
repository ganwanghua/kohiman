package com.pinuoke.kohiman.customer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.FragmentAdapter;
import com.pinuoke.kohiman.common.BaseFragment;
import com.pinuoke.kohiman.weight.SwitchView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class CustomerFragment extends BaseFragment {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.upload_event)
    ImageView uploadEvent;
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();

    @Override
    protected int LayoutId() {
        return R.layout.fragment_customer;
    }

    @Override
    protected void initView() {
//        switchFragment(new MyCustomerListFragment());
//
//        switchView.setOnClickCheckedListener(new SwitchView.onClickCheckedListener() {
//            @Override
//            public void onClick() {
//                if (switchView.isChecked()) {
//                    switchFragment(new HighSeasCustomersFragment());
//                } else {
//                    switchFragment(new MyCustomerListFragment());
//                }
//            }
//        });
        titles.add("我的客户");
        titles.add("团队客户");
        titles.add("公海客户");
        for (int i = 0; i < titles.size(); i++) {
            if (i == 0) {
                fragments.add(new MyCustomerListFragment());
            } else if (i == 1) {
                fragments.add(new GroupCustomerListFragment());
            } else if (i == 2) {
                fragments.add(new HighSeasCustomersFragment());            }
        }
        FragmentAdapter adatper = new FragmentAdapter(getFragmentManager(), fragments, titles);
        viewPager.setAdapter(adatper);
        viewPager.setOffscreenPageLimit(fragments.size());
        //将TabLayout和ViewPager关联起来。
        xTablayout.setupWithViewPager(viewPager);


    }

    private void switchFragment(Fragment fragment) {
//        getFragmentManager().beginTransaction().replace(R.id.fl_banner, fragment).commitAllowingStateLoss();
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
        if (event.equals("2")) {
//            getFragmentManager().beginTransaction().replace(R.id.fl_banner, new MyCustomerListFragment()).commitAllowingStateLoss();
            viewPager.setCurrentItem(0);
        }
    }
}
