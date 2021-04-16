package com.pinuoke.kohiman.customer;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.model.BatchToSeasModel;
import com.pinuoke.kohiman.model.ConfigModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.qqtheme.framework.picker.DatePicker;
import cn.qqtheme.framework.picker.OptionPicker;
import cn.qqtheme.framework.widget.WheelView;

public class FollowUpActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_user_name)
    TextView tvUserName;
    @BindView(R.id.tv_status)
    TextView tvStatus;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.ed_content)
    EditText edContent;
    @BindView(R.id.tv_sure)
    TextView tvSure;
    private DataRepository dataRepository;
    private List<String> followTypeList = new ArrayList<>();
    private List<String> statusList = new ArrayList<>();
    private int position, position1;
    private String status_id;
    private ConfigModel configModel;
    private String typeId;
    private int mYear, mMonth, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_up);
        ButterKnife.bind(this);
        dataRepository = Injection.dataRepository(this);

        Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH) + 1;
        mDay = c.get(Calendar.DAY_OF_MONTH);

        status_id = getIntent().getStringExtra("status_id");
        tvName.setText(getIntent().getStringExtra("name"));
        tvUserName.setText(getIntent().getStringExtra("userName"));
        tvStatus.setText(getIntent().getStringExtra("status"));
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
                    for (int i = 0; i < configModel.getData().getFollowTypeList().size(); i++) {
                        followTypeList.add(configModel.getData().getFollowTypeList().get(i).getName());
                    }
                    for (int i = 0; i < configModel.getData().getStatusList().size(); i++) {
                        statusList.add(configModel.getData().getStatusList().get(i).getName());
                    }
                }
            }
        });
    }

    private void follow() {
        ViewLoading.show(mContext);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/follow.index/add");
        map.put("token", FastData.getToken());
        map.put("follow_type_id", typeId);
        map.put("plan_follow_time", tvTime.getText().toString());
        map.put("content", edContent.getText().toString());
        map.put("clue_id", getIntent().getStringExtra("clue_id"));
        map.put("status_id", status_id);
        dataRepository.follow(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                BatchToSeasModel batchToSeasModel = (BatchToSeasModel) data;
                if (batchToSeasModel.getCode() == 1) {
                    ToastUtils.showToast("跟进成功");
                    EventBus.getDefault().post("2");
                    finish();
                } else {
                    ToastUtils.showToast("跟进失败");
                }
            }
        });
    }

    @OnClick({R.id.iv_back, R.id.tv_status, R.id.tv_type, R.id.tv_time, R.id.tv_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_status:
                OptionPicker picker = new OptionPicker(this, statusList);
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
                        tvStatus.setText(item);
                        position = index;
                        status_id = configModel.getData().getStatusList().get(index).getClue_status_id() + "";
                    }
                });
                picker.show();
                break;
            case R.id.tv_type:
                OptionPicker picker1 = new OptionPicker(this, followTypeList);
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
                        tvType.setText(item);
                        position1 = index;
                        typeId = configModel.getData().getFollowTypeList().get(index).getFollow_type_id() + "";
                    }
                });
                picker1.show();
                break;
            case R.id.tv_time:
                DatePicker picker2 = new DatePicker(this, DatePicker.YEAR_MONTH_DAY);
                picker2.setRange(1990, 2100);//年份范围
                picker2.setSelectedItem(mYear, mMonth, mDay);//年份范围
                picker2.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
                    @Override
                    public void onDatePicked(String year, String month, String day) {
                        mYear = Integer.parseInt(year);
                        mMonth = Integer.parseInt(month);
                        mDay = Integer.parseInt(day);
                        tvTime.setText(year + "-" + month + "-" + day);
                    }
                });
                picker2.show();
                break;
            case R.id.tv_sure:
                if (TextUtils.isEmpty(tvType.getText().toString())) {
                    ToastUtils.showToast("请选择跟进类型");
                    return;
                }
                if (TextUtils.isEmpty(tvTime.getText().toString())) {
                    ToastUtils.showToast("选择下次跟进时间");
                    return;
                }
                if (TextUtils.isEmpty(edContent.getText().toString())) {
                    ToastUtils.showToast("请输入跟进内容");
                    return;
                }
                follow();
                break;
        }
    }
}