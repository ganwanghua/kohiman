package com.pinuoke.kohiman.customer;

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
import com.pinuoke.kohiman.model.CustomerDetailsModel;
import com.pinuoke.kohiman.model.MyCustomerListModel;
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

public class CustomerDetailsActivity extends BaseActivity {

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
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    @BindView(R.id.tv_wx)
    TextView tvWx;
    @BindView(R.id.tv_qq)
    TextView tvQq;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.tv_tag)
    TextView tvTag;
    @BindView(R.id.tv_tag1)
    TextView tvTag1;
    private DataRepository dataRepository;
    private CustomerDetailsModel customerDetailsModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);
        ButterKnife.bind(this);
        dataRepository = Injection.dataRepository(this);
        customerDetails();
    }

    private void customerDetails() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/detail");
        map.put("clue_id", getIntent().getStringExtra("clue_id"));
        map.put("token", FastData.getToken());
        dataRepository.customerDetails(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                customerDetailsModel = (CustomerDetailsModel) data;
                if (customerDetailsModel.getCode() == 1) {
                    tvName.setText(customerDetailsModel.getData().getDetail().getName());
                    tvPhone.setText(customerDetailsModel.getData().getDetail().getPhone());
                    if(TextUtils.isEmpty(customerDetailsModel.getData().getDetail().getWechat())){
                        tvWx.setText("??????");
                    }else {
                        tvWx.setText(customerDetailsModel.getData().getDetail().getWechat());
                    }
                    if(TextUtils.isEmpty(customerDetailsModel.getData().getDetail().getQq())){
                        tvQq.setText("??????");
                    }else {
                        tvQq.setText(customerDetailsModel.getData().getDetail().getQq());
                    }
                    if(TextUtils.isEmpty(customerDetailsModel.getData().getDetail().getEmail())){
                        tvEmail.setText("??????");
                    }else {
                        tvEmail.setText(customerDetailsModel.getData().getDetail().getEmail());
                    }
                    if(TextUtils.isEmpty(customerDetailsModel.getData().getDetail().getAddress())){
                        tvAddress.setText("??????");
                    }else {
                        tvAddress.setText(customerDetailsModel.getData().getDetail().getAddress());
                    }

                    if (customerDetailsModel.getData().getDetail().getSource() != null) {
                        tvTag.setVisibility(View.VISIBLE);
                        tvTag.setText(customerDetailsModel.getData().getDetail().getSource().getName());
                    } else {
                        tvTag.setVisibility(View.GONE);
                    }
                    if (customerDetailsModel.getData().getDetail().getStatus() != null) {
                        tvTag1.setVisibility(View.VISIBLE);
                        tvTag1.setText(customerDetailsModel.getData().getDetail().getStatus().getName());
                    } else {
                        tvTag1.setVisibility(View.GONE);
                    }

                    titles.add("????????????");
                    titles.add("????????????");
                    for (int i = 0; i < titles.size(); i++) {
                        if (i == 0) {
                            fragments.add(new FollowUpRecordFragment(customerDetailsModel.getData().getFollowLog()));
                        } else if (i == 1) {
                            fragments.add(new OrderRecordsFragment());
                        }
                    }
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
                Intent intent2 = new Intent(this, EditCustomersActivity.class);
                intent2.putExtra("clue_id", customerDetailsModel.getData().getDetail().getClue_id() + "");
                startActivity(intent2);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //???ui???????????????????????????100
    public void onEvent(String event) {
        if (event.equals("2")) {
            titles.clear();
            fragments.clear();
            customerDetails();
        }
    }
}