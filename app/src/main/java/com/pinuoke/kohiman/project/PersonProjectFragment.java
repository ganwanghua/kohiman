package com.pinuoke.kohiman.project;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.FragmentAdapter;
import com.pinuoke.kohiman.common.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class PersonProjectFragment extends BaseFragment {

    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;


    @Override
    protected int LayoutId() {
        return R.layout.fragment_person_project;
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
                fragments.add(new PersonProjectListFragment(i, "10", ""));
            } else if (i == 1) {
                fragments.add(new PersonProjectListFragment(i, "20", ""));
            } else if (i == 2) {
                fragments.add(new PersonProjectListFragment(i, "", "10023"));
            }
        }
        FragmentAdapter adatper = new FragmentAdapter(getChildFragmentManager(), fragments, titles);
        viewPager.setAdapter(adatper);
        viewPager.setOffscreenPageLimit(fragments.size());
        //将TabLayout和ViewPager关联起来。
        xTablayout.setupWithViewPager(viewPager);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}
