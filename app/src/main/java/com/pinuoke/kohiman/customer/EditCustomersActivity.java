package com.pinuoke.kohiman.customer;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.model.BatchToSeasModel;
import com.pinuoke.kohiman.model.ConfigModel;
import com.pinuoke.kohiman.model.MyCustomerListModel;
import com.pinuoke.kohiman.model.StatusModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;
import com.pinuoke.kohiman.utils.Util;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.qqtheme.framework.entity.City;
import cn.qqtheme.framework.entity.County;
import cn.qqtheme.framework.entity.Province;
import cn.qqtheme.framework.picker.AddressPicker;
import cn.qqtheme.framework.picker.OptionPicker;
import cn.qqtheme.framework.widget.WheelView;

public class EditCustomersActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.ed_user_name)
    EditText edUserName;
    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.iv_1)
    ImageView iv1;
    @BindView(R.id.ll_unKnow)
    LinearLayout llUnKnow;
    @BindView(R.id.iv_2)
    ImageView iv2;
    @BindView(R.id.ll_man)
    LinearLayout llMan;
    @BindView(R.id.iv_3)
    ImageView iv3;
    @BindView(R.id.ll_woman)
    LinearLayout llWoman;
    @BindView(R.id.ed_age)
    EditText edAge;
    @BindView(R.id.tv_role)
    TextView tvRole;
    @BindView(R.id.tv_customer_source)
    TextView tvCustomerSource;
    @BindView(R.id.tv_status)
    TextView tvStatus;
    @BindView(R.id.ed_email)
    EditText edEmail;
    @BindView(R.id.ed_wx)
    EditText edWx;
    @BindView(R.id.ed_qq)
    EditText edQq;
    @BindView(R.id.tv_area)
    TextView tvArea;
    @BindView(R.id.ed_address)
    EditText edAddress;
    @BindView(R.id.tv_sure)
    TextView tvSure;
    private int pos;
    private List<MyCustomerListModel.DataBeanX.ListBean.DataBean> dataBeanList = new ArrayList<>();
    private DataRepository dataRepository;
    private String sex = "0";
    private int position, position1, position2;
    private List<String> roleList = new ArrayList<>();
    private List<String> sourceList = new ArrayList<>();
    private List<String> statusList = new ArrayList<>();
    private ConfigModel configModel;
    private String roleId, sourceId, statusId;
    private String provinces = "";
    private String citys = "";
    private String countys = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_customers);
        ButterKnife.bind(this);

        dataBeanList = (List<MyCustomerListModel.DataBeanX.ListBean.DataBean>) getIntent().getSerializableExtra("data");
        pos = getIntent().getIntExtra("pos", -1);
        edName.setText(dataBeanList.get(pos).getName());
        edUserName.setText(dataBeanList.get(pos).getLink_name());
        edPhone.setText(dataBeanList.get(pos).getPhone());
        if (dataBeanList.get(pos).getGender().getValue() == 0) {
            iv1.setImageResource(R.mipmap.select);
            iv2.setImageResource(R.mipmap.unselect);
            iv3.setImageResource(R.mipmap.unselect);
        } else if (dataBeanList.get(pos).getGender().getValue() == 1) {
            iv2.setImageResource(R.mipmap.select);
            iv1.setImageResource(R.mipmap.unselect);
            iv3.setImageResource(R.mipmap.unselect);
        } else if (dataBeanList.get(pos).getGender().getValue() == 2) {
            iv3.setImageResource(R.mipmap.select);
            iv1.setImageResource(R.mipmap.unselect);
            iv2.setImageResource(R.mipmap.unselect);
        }
        if (dataBeanList.get(pos).getAge() > 0) {
            edAge.setText(dataBeanList.get(pos).getAge() + "");
        } else {
            edAge.setHint("请输入");
        }
        if (dataBeanList.get(pos).getRole() == null) {
            tvRole.setHint("未知");
            roleId = "";
        } else {
            tvRole.setText(dataBeanList.get(pos).getRole().getName());
            roleId = configModel.getData().getRoleList().get(position).getClue_role_id() + "";
        }
        if (dataBeanList.get(pos).getSource() == null) {
            tvCustomerSource.setHint("未知");
            sourceId = "";
        } else {
            tvCustomerSource.setText(dataBeanList.get(pos).getSource().getName());
            sourceId = configModel.getData().getSourceList().get(position).getClue_source_id() + "";
        }
        if (dataBeanList.get(pos).getStatus() == null) {
            tvStatus.setHint("未知");
            statusId = "";
        } else {
            tvStatus.setText(dataBeanList.get(pos).getStatus().getName());
            statusId = configModel.getData().getStatusList().get(position).getClue_status_id() + "";
        }
        if (dataBeanList.get(pos).getEmail() == null) {
            edEmail.setHint("请输入邮箱");
        } else {
            edEmail.setText(dataBeanList.get(pos).getEmail());
        }
        if (dataBeanList.get(pos).getWechat() == null) {
            edWx.setHint("请输入微信");
        } else {
            edWx.setText(dataBeanList.get(pos).getWechat());
        }
        if (dataBeanList.get(pos).getQq() == null) {
            edQq.setHint("请输入QQ");
        } else {
            edQq.setText(dataBeanList.get(pos).getQq());
        }
        if (dataBeanList.get(pos).getRegion() == null) {
            tvArea.setHint("请选择省市区");
        } else {
            tvArea.setText(dataBeanList.get(pos).getRegion().getProvince() + dataBeanList.get(pos).getRegion().getCity() + dataBeanList.get(pos).getRegion().getRegion());
        }
        if (dataBeanList.get(pos).getDetail() == null) {
            edAddress.setHint("请输入详细地址");
        } else {
            edAddress.setText(dataBeanList.get(pos).getDetail());
        }

        dataRepository = Injection.dataRepository(this);
        config();
    }

    private void config() {
        ViewLoading.show(mContext);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/config");
        map.put("token", FastData.getToken());
        dataRepository.config(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                configModel = (ConfigModel) data;
                if (configModel.getCode() == 1) {
                    for (int i = 0; i < configModel.getData().getRoleList().size(); i++) {
                        roleList.add(configModel.getData().getRoleList().get(i).getName());
                    }
                    for (int i = 0; i < configModel.getData().getSourceList().size(); i++) {
                        sourceList.add(configModel.getData().getSourceList().get(i).getName());
                    }
                    for (int i = 0; i < configModel.getData().getStatusList().size(); i++) {
                        statusList.add(configModel.getData().getStatusList().get(i).getName());
                    }
                }
            }
        });
    }


    private void editCustomer(String name, String user, String phone, String sex) {
        ViewLoading.show(mContext);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/client.index/add");
        map.put("token", FastData.getToken());
        map.put("name", name);
        map.put("link_name", user);
        map.put("phone", phone);
        map.put("gender", sex);
        map.put("age", edAge.getText().toString());
        map.put("role_id", roleId);
        map.put("source_id", sourceId);
        map.put("status_id", statusId);
        map.put("email", edEmail.getText().toString());
        map.put("wechat", edWx.getText().toString());
        map.put("qq", edQq.getText().toString());
        map.put("region", provinces + "," + citys + "," + countys);
        map.put("details", edAddress.getText().toString());
        dataRepository.editCustomer(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                StatusModel batchToSeasModel = (StatusModel) data;
                if (batchToSeasModel.getCode() == 1) {
                    ToastUtils.showToast("更新成功");
                    EventBus.getDefault().post("2");
                    finish();
                } else {
                    ToastUtils.showToast(batchToSeasModel.getMsg());
                }
            }
        });
    }

    private ArrayList<Province> getArea() {
        ArrayList<Province> data = new ArrayList<>();
        String json = Util.getTextFromAssets(this, "city.json");
        data.addAll(JSON.parseArray(json, Province.class));
        return data;
    }

    @OnClick({R.id.iv_back, R.id.ll_unKnow, R.id.ll_man, R.id.ll_woman, R.id.tv_role, R.id.tv_customer_source, R.id.tv_status, R.id.tv_area, R.id.tv_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.ll_unKnow:
                sex = "0";
                iv1.setImageResource(R.mipmap.select);
                iv2.setImageResource(R.mipmap.unselect);
                iv3.setImageResource(R.mipmap.unselect);
                break;
            case R.id.ll_man:
                sex = "1";
                iv2.setImageResource(R.mipmap.select);
                iv1.setImageResource(R.mipmap.unselect);
                iv3.setImageResource(R.mipmap.unselect);
                break;
            case R.id.ll_woman:
                sex = "2";
                iv3.setImageResource(R.mipmap.select);
                iv1.setImageResource(R.mipmap.unselect);
                iv2.setImageResource(R.mipmap.unselect);
                break;
            case R.id.tv_role:
                OptionPicker picker = new OptionPicker(this, roleList);
                picker.setDividerRatio(WheelView.DividerConfig.FILL);
                picker.setSubmitText("确定");
                picker.setSubmitTextColor(0xff00A9A9);
                picker.setSubmitTextSize(16);
                picker.setCancelText("取消");
                picker.setCancelTextColor(0xff666666);
                picker.setCancelTextSize(16);
                picker.setTextColor(0xff00A9A9);
                picker.setDividerColor(0xffE6EAF0);
                picker.setTopLineColor(0xffE6EAF0);
                picker.setCycleDisable(true);
                picker.setSelectedIndex(position);
                picker.setAnimationStyle(R.style.main_menu_anim_style);
                picker.setOnOptionPickListener(new OptionPicker.OnOptionPickListener() {
                    @Override
                    public void onOptionPicked(int index, String item) {
                        tvRole.setText(item);
                        position = index;
                        roleId = configModel.getData().getRoleList().get(position).getClue_role_id() + "";
                    }
                });
                picker.show();
                break;
            case R.id.tv_customer_source:
                OptionPicker picker1 = new OptionPicker(this, sourceList);
                picker1.setDividerRatio(WheelView.DividerConfig.FILL);
                picker1.setSubmitText("确定");
                picker1.setSubmitTextColor(0xff00A9A9);
                picker1.setSubmitTextSize(16);
                picker1.setCancelText("取消");
                picker1.setCancelTextColor(0xff666666);
                picker1.setCancelTextSize(16);
                picker1.setTextColor(0xff00A9A9);
                picker1.setDividerColor(0xffE6EAF0);
                picker1.setTopLineColor(0xffE6EAF0);
                picker1.setCycleDisable(true);
                picker1.setSelectedIndex(position1);
                picker1.setAnimationStyle(R.style.main_menu_anim_style);
                picker1.setOnOptionPickListener(new OptionPicker.OnOptionPickListener() {
                    @Override
                    public void onOptionPicked(int index, String item) {
                        tvCustomerSource.setText(item);
                        position1 = index;
                        sourceId = configModel.getData().getSourceList().get(position1).getClue_source_id() + "";
                    }
                });
                picker1.show();
                break;
            case R.id.tv_status:
                OptionPicker picker2 = new OptionPicker(this, statusList);
                picker2.setDividerRatio(WheelView.DividerConfig.FILL);
                picker2.setSubmitText("确定");
                picker2.setSubmitTextColor(0xff00A9A9);
                picker2.setSubmitTextSize(16);
                picker2.setCancelText("取消");
                picker2.setCancelTextColor(0xff666666);
                picker2.setCancelTextSize(16);
                picker2.setTextColor(0xff00A9A9);
                picker2.setDividerColor(0xffE6EAF0);
                picker2.setTopLineColor(0xffE6EAF0);
                picker2.setCycleDisable(true);
                picker2.setSelectedIndex(position2);
                picker2.setAnimationStyle(R.style.main_menu_anim_style);
                picker2.setOnOptionPickListener(new OptionPicker.OnOptionPickListener() {
                    @Override
                    public void onOptionPicked(int index, String item) {
                        tvStatus.setText(item);
                        position2 = index;
                        statusId = configModel.getData().getStatusList().get(position2).getClue_status_id() + "";
                    }
                });
                picker2.show();
                break;
            case R.id.tv_area:
                AddressPicker picker3 = new AddressPicker(this, getArea());
                picker3.setHideProvince(false);
                picker3.setHideCounty(false);
                picker3.setSubmitTextColor(0xff00A9A9);
                picker3.setCancelTextColor(0xff666666);
                picker3.setTextColor(0xff00A9A9);
                picker3.setDividerColor(0xffE6EAF0);
                picker3.setTopLineColor(0xffE6EAF0);
                picker3.setCancelable(false);
                picker3.setCanceledOnTouchOutside(false);
                picker3.setCycleDisable(true);
                picker3.setColumnWeight(2 / 8.0f, 3 / 8.0f, 3 / 8.0f);//省级、地级和县级的比例为2:3:3

                picker3.setSelectedItem(provinces, citys, countys);
                picker3.setOnAddressPickListener(new AddressPicker.OnAddressPickListener() {
                    @Override
                    public void onAddressPicked(Province province, City city, County county) {
                        provinces = province.getAreaName();
                        citys = city.getAreaName();
                        countys = county.getAreaName();
                        tvArea.setText(provinces + citys + countys);
                    }
                });
                picker3.show();
                break;
            case R.id.tv_sure:
                if (TextUtils.isEmpty(edName.getText().toString())) {
                    ToastUtils.showToast("请输入客户名称");
                    return;
                }
                if (TextUtils.isEmpty(edUserName.getText().toString())) {
                    ToastUtils.showToast("请输入联系人姓名");
                    return;
                }
                if (TextUtils.isEmpty(edPhone.getText().toString())) {
                    ToastUtils.showToast("请输入联系人手机号码");
                    return;
                }
                if (TextUtils.isEmpty(tvArea.getText().toString())) {
                    ToastUtils.showToast("请选择省市区");
                    return;
                }
                if (TextUtils.isEmpty(edAge.getText().toString())) {
                    edAge.setText("");
                }
                if (TextUtils.isEmpty(edEmail.getText().toString())) {
                    edEmail.setText("");
                }
                if (TextUtils.isEmpty(edWx.getText().toString())) {
                    edWx.setText("");
                }
                if (TextUtils.isEmpty(edQq.getText().toString())) {
                    edQq.setText("");
                }
                if (TextUtils.isEmpty(edAddress.getText().toString())) {
                    edAddress.setText("");
                }
                editCustomer(edName.getText().toString(), edUserName.getText().toString(), edPhone.getText().toString(), sex);
                break;
        }
    }
}