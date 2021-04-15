package com.pinuoke.kohiman.customer;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.FragmentAdapter;
import com.pinuoke.kohiman.common.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MyCustomerListFragment extends BaseFragment {

    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();

    @Override
    protected int LayoutId() {
        return R.layout.my_customer_list;
    }

    @Override
    protected void initView() {
        titles.clear();
        fragments.clear();
        titles.add("待处理");
        titles.add("跟进中");
        titles.add("已完成");
        for (int i = 0; i < titles.size(); i++) {
            if (i == 0) {
                fragments.add(new CustomerListFragment(i, "10", ""));
            } else if (i == 1) {
                fragments.add(new CustomerListFragment(i, "20", ""));
            } else if (i == 2) {
                fragments.add(new CustomerListFragment(i, "", "10023"));
            }
        }
        FragmentAdapter adatper = new FragmentAdapter(getFragmentManager(), fragments, titles);
        viewPager.setAdapter(adatper);
//        viewPager.setOffscreenPageLimit(fragments.size());
        //将TabLayout和ViewPager关联起来。
        xTablayout.setupWithViewPager(viewPager);
    }
}
