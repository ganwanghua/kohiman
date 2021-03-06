package com.pinuoke.kohiman.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.FragmentAdapter;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.customer.EditCustomersActivity;
import com.pinuoke.kohiman.customer.FollowUpRecordFragment;
import com.pinuoke.kohiman.customer.OrderRecordsFragment;
import com.pinuoke.kohiman.model.MyCustomerListModel;
import com.pinuoke.kohiman.model.MyProjectListModel;
import com.pinuoke.kohiman.model.ProjectDetailModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProjectDetailsActivity extends BaseActivity {


    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.iv_edit)
    ImageView ivEdit;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_name)
    TextView tvName;

    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_person)
    TextView tvPerson;
    @BindView(R.id.tv_phone_1)
    TextView tvPhone1;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private DataRepository dataRepository;
    private int pos;
    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);
        ButterKnife.bind(this);

        dataRepository = Injection.dataRepository(this);
        pos = getIntent().getIntExtra("pos", -1);
        projectDetail();
    }

    private void projectDetail() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/project.index/detail");
        map.put("project_id", getIntent().getStringExtra("project_id"));
        map.put("token", FastData.getToken());
        dataRepository.projectDetail(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                ProjectDetailModel projectDetailModel = (ProjectDetailModel) data;
                if (projectDetailModel.getCode() == 1) {
                    tvName.setText(projectDetailModel.getData().getDetail().getName());
                    tvPhone.setText(projectDetailModel.getData().getDetail().getCategory().getName());
                    if (TextUtils.isEmpty(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getPhone())) {
                        tvPhone1.setText("??????");
                    } else {

                        tvPhone1.setText(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getPhone());
                    }
                    if (TextUtils.isEmpty(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getName())) {
                        tvPerson.setText("??????");
                    } else {
                        tvPerson.setText(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getName());
                    }
                    if (TextUtils.isEmpty(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getEmail())) {
                        tvEmail.setText("??????");
                    } else {
                        tvEmail.setText(projectDetailModel.getData().getDetail().getClient().get(0).getClient().getEmail());
                    }
                    tvAddress.setText(
                            projectDetailModel.getData().getDetail().getClient().get(0).getClient().getRegion().getProvince() +
                                    projectDetailModel.getData().getDetail().getClient().get(0).getClient().getRegion().getCity() +
                                    projectDetailModel.getData().getDetail().getClient().get(0).getClient().getRegion().getRegion() +
                                    projectDetailModel.getData().getDetail().getClient().get(0).getClient().getDetail()

                    );
                    if (TextUtils.isEmpty(tvAddress.getText().toString())) {
                        tvAddress.setText("??????");
                    }
                    titles.add("????????????");
                    titles.add("????????????");
                    titles.add("????????????");
                    titles.add("????????????");
                    fragments.add(new BasicInformationFragment(projectDetailModel));
                    fragments.add(new ClientInformationFragment(projectDetailModel));
                    fragments.add(new UserInformationFragment(projectDetailModel));
                    fragments.add(new RecordInformationFragment(projectDetailModel));
                    FragmentAdapter adatper = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
                    viewPager.setAdapter(adatper);
                    viewPager.setOffscreenPageLimit(fragments.size());
                    //???TabLayout???ViewPager???????????????
                    xTablayout.setupWithViewPager(viewPager);
                }
            }
        });
    }

    @OnClick({R.id.iv_back, R.id.iv_edit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_edit:
                Intent intent2 = new Intent(this, EditProjectActivity.class);
                intent2.putExtra("project_id", getIntent().getStringExtra("project_id"));
                startActivity(intent2);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //???ui???????????????????????????100
    public void onEvent(String event) {
        if (event.equals("4")) {
            titles.clear();
            fragments.clear();
            projectDetail();
        }
    }
}