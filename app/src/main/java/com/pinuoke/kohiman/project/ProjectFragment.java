package com.pinuoke.kohiman.project;

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
import com.pinuoke.kohiman.customer.MyCustomerListFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ProjectFragment extends BaseFragment {


    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.upload_event)
    ImageView uploadEvent;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_project;
    }

    @Override
    protected void initView() {
        titles.add("我的项目");
        titles.add("团队项目");
        for (int i = 0; i < titles.size(); i++) {
            if (i == 0) {
                fragments.add(new PersonProjectFragment());
            } else if (i == 1) {
                fragments.add(new PersonProjectFragment());
            }
        }
        FragmentAdapter adatper = new FragmentAdapter(getChildFragmentManager(), fragments, titles);
        viewPager.setAdapter(adatper);
        viewPager.setOffscreenPageLimit(fragments.size());
        //将TabLayout和ViewPager关联起来。
        xTablayout.setupWithViewPager(viewPager);
    }


    @OnClick(R.id.upload_event)
    public void onViewClicked() {
        startActivity(new Intent(mContext, CreateProjectActivity.class));
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
