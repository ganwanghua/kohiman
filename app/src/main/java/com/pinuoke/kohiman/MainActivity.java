package com.pinuoke.kohiman;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import com.next.easynavigation.view.EasyNavigationBar;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.adapter.FragmentTabAdapter;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.customer.CustomerFragment;
import com.pinuoke.kohiman.mine.MineFragment;
import com.pinuoke.kohiman.project.ProjectFragment;
import com.pinuoke.kohiman.utils.StatusBarUtil;
import com.pinuoke.kohiman.workbench.WorkBenchFragment;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {


    @BindView(R.id.easy_bars)
    EasyNavigationBar easyBars;
    private List<Fragment> fragments = new ArrayList<>();

    private String[] strings = {"客户管理", "项目管理", "工作台", "个人中心"};
    private int[] selectList = {R.mipmap.customer_management_1, R.mipmap.project_management_1, R.mipmap.workbench_1, R.mipmap.mine_1};
    private int[] unSelectList = {R.mipmap.customer_management, R.mipmap.project_management, R.mipmap.workbench, R.mipmap.mine};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        initBottomNavigationBar();

    }

    private void initBottomNavigationBar() {
        fragments.add(new CustomerFragment());
        fragments.add(new ProjectFragment());
        fragments.add(new WorkBenchFragment());
        fragments.add(new MineFragment());

        easyBars.titleItems(strings)//导航栏文字
                .fragmentList(fragments)//存放fragment的集合
                .fragmentManager(getSupportFragmentManager())//fragment管理器
                .selectIconItems(selectList)//选中的图片
                .normalIconItems(unSelectList)//未选中的图片
                .canScroll(false)//可以滑动
                .mode(EasyNavigationBar.NavigationMode.MODE_NORMAL)
                .selectTextColor(getResources().getColor(R.color.green))//选中的文字颜色
                .normalTextColor(getResources().getColor(R.color.light_black))//未选中的文字颜色
                .build();
        easyBars.getViewPager().setOffscreenPageLimit(3);
        easyBars.setOnTabClickListener(new EasyNavigationBar.OnTabClickListener() {
            @Override
            public boolean onTabSelectEvent(View view, int position) {
//                easyBars.selectTab(position,false);
                if (position == 0) {
                    initWhite();
                } else if (position == 1) {
                    initWhite();
                } else if (position == 2) {
                    initWhite();
                } else if (position == 3) {
                    initWhite();
                }
                return false;
            }

            @Override
            public boolean onTabReSelectEvent(View view, int position) {
                return false;
            }
        });

    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String event) {
        if (event.equals("3")) {
            easyBars.selectTab(1, false);
        } else if (event.equals("6")) {
            easyBars.selectTab(0, false);
        }
    }

    /**
     * 手机返回键监听
     */
    long firstTime = 0;

    @Override
    public void onBackPressed() {
        long secondTime = System.currentTimeMillis();
        if (secondTime - firstTime > 800) { // 两次点击间隔大于800毫秒，不退出
            ToastUtils.showToast("再按一次退出程序");
            firstTime = secondTime; // 更新firstTime
        } else {
            finish();
        }
    }
}