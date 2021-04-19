package com.pinuoke.kohiman.project;

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
import com.pinuoke.kohiman.model.ProjectConfigModel;
import com.pinuoke.kohiman.model.StatusModel;
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

public class FollowUpProjectActivity extends BaseActivity {


    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_contacts)
    TextView tvContacts;
    @BindView(R.id.tv_status)
    TextView tvStatus;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_plan)
    TextView tvPlan;
    @BindView(R.id.ed_content)
    EditText edContent;
    @BindView(R.id.tv_sure)
    TextView tvSure;
    private DataRepository dataRepository;
    private List<ProjectConfigModel.DataBean.StatusListBean> statusList;
    private List<String> statusName = new ArrayList<>();
    private List<ProjectConfigModel.DataBean.FollowTypeListBean> followTypeList;
    private List<String> followTypeName = new ArrayList<>();

    int mYear, mMonth, mDay;
    private String status_id;
    private String follow_type_id;
    private String plan_follow_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_up_project);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initView() {
        String project_name = getIntent().getStringExtra("project_name");
        String contacts = getIntent().getStringExtra("contacts");
        tvName.setText(project_name);
        tvContacts.setText(contacts);
        Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH) + 1;
        mDay = c.get(Calendar.DAY_OF_MONTH);

    }

    private void initData() {
        dataRepository = Injection.dataRepository(mContext);
        projectConfig();
    }

    private void projectConfig() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/project.index/config");
        map.put("token", FastData.getToken());
        dataRepository.projectConfig(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                ProjectConfigModel configModel = (ProjectConfigModel) data;
                if (configModel.getCode() == 1) {
                    statusList = configModel.getData().getStatusList();
                    for (int i = 0; i < statusList.size(); i++) {
                        statusName.add(statusList.get(i).getName());
                    }

                    followTypeList = configModel.getData().getFollowTypeList();
                    for (int i = 0; i < followTypeList.size(); i++) {
                        followTypeName.add(followTypeList.get(i).getName());
                    }
                }

            }
        });
    }

    private void projectFollowAdd() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/project.follow.index/add");
        map.put("token", FastData.getToken());
        map.put("status_id", status_id);
        map.put("follow_type_id", follow_type_id);
        map.put("plan_follow_time", plan_follow_time);
        map.put("content", edContent.getText().toString());
        map.put("project_id", getIntent().getStringExtra("project_id"));
        dataRepository.projectFollowAdd(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                StatusModel statusModel = (StatusModel) data;
                if (statusModel.getCode() == 1) {
                    EventBus.getDefault().post("4");
                    finish();
                }
                ToastUtils.showToast(statusModel.getMsg());


            }
        });
    }

    @OnClick({R.id.iv_back, R.id.tv_status, R.id.tv_type, R.id.tv_plan, R.id.tv_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_status:
                if (statusName != null && statusName.size() > 0)
                    showOption(statusName, tvStatus, new CallBack() {
                        @Override
                        public void callBack(int postion) {
                            status_id = statusList.get(postion).getProject_status_id() + "";
                        }
                    });
                break;
            case R.id.tv_type:
                if (followTypeName != null && followTypeName.size() > 0)
                    showOption(followTypeName, tvType, new CallBack() {
                        @Override
                        public void callBack(int postion) {
                            follow_type_id = followTypeList.get(postion).getFollow_type_id() + "";
                        }
                    });
                break;
            case R.id.tv_plan:
                showTimeOption(tvPlan, new CallBackTime() {
                    @Override
                    public void callBackTime(String time) {
                        plan_follow_time = time;
                    }
                });
                break;
            case R.id.tv_sure:
                if (TextUtils.isEmpty(tvStatus.getText().toString())) {
                    ToastUtils.showToast("请输入项目阶段状态");
                    return;
                }
                if (TextUtils.isEmpty(tvType.getText().toString())) {
                    ToastUtils.showToast("请输入跟进类型");
                    return;
                }
                if (TextUtils.isEmpty(tvPlan.getText().toString())) {
                    ToastUtils.showToast("请输入下次跟进时间");
                    return;
                }
                if (TextUtils.isEmpty(edContent.getText().toString())) {
                    ToastUtils.showToast("请输入跟进内容");
                    return;
                }
                projectFollowAdd();
                break;
        }
    }

    private void showOption(List<String> sourceList, TextView textView, CallBack callBack) {
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

        picker1.setAnimationStyle(R.style.main_menu_anim_style);
        picker1.setOnOptionPickListener(new OptionPicker.OnOptionPickListener() {
            @Override
            public void onOptionPicked(int index, String item) {
                textView.setText(item);
                picker1.setSelectedIndex(index);
                callBack.callBack(index);
            }
        });
        picker1.show();
    }

    private void showTimeOption(TextView textView, CallBackTime backTime) {
        DatePicker picker1 = new DatePicker(this);
        picker1.setDividerRatio(WheelView.DividerConfig.FILL);
        picker1.setRangeEnd(2050, 10, 14);//控件最大所能显示的时间，即结束时间
        picker1.setRangeStart(1997, 1, 1);//控件最小所能显示的时间
        picker1.setSelectedItem(mYear, mMonth, mDay);//默认选择时间
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

        picker1.setAnimationStyle(R.style.main_menu_anim_style);
        picker1.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
            @Override
            public void onDatePicked(String year, String month, String day) {
                textView.setText(year + "-" + month + "-" + day);
                backTime.callBackTime(year + "-" + month + "-" + day);
            }
        });
        picker1.show();
    }

    private interface CallBack {
        void callBack(int position);
    }

    private interface CallBackTime {
        void callBackTime(String time);
    }

}
