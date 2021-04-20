package com.pinuoke.kohiman.project;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;

import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.GridViewAdapter;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.model.MyProjectListModel;
import com.pinuoke.kohiman.model.ProjectClientListModel;
import com.pinuoke.kohiman.model.ProjectConfigModel;
import com.pinuoke.kohiman.model.StatusModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;
import com.pinuoke.kohiman.weight.GlideEngine;
import com.pinuoke.kohiman.weight.GridViewInScrollView;
import com.tbruyelle.rxpermissions3.RxPermissions;

import org.greenrobot.eventbus.EventBus;

import java.io.Serializable;
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

public class EditProjectActivity extends BaseActivity {


    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.iv_1)
    ImageView iv1;
    @BindView(R.id.ll_is)
    LinearLayout llIs;
    @BindView(R.id.iv_2)
    ImageView iv2;
    @BindView(R.id.ll_no)
    LinearLayout llNo;
    @BindView(R.id.ll_woman)
    Space llWoman;
    @BindView(R.id.ed_content)
    EditText edContent;
    @BindView(R.id.gridView)
    GridViewInScrollView gridView;
    @BindView(R.id.tv_sure)
    TextView tvSure;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_link_person)
    TextView tvLinkPerson;
    @BindView(R.id.tv_start_time)
    TextView tvStartTime;
    @BindView(R.id.tv_end_time)
    TextView tvEndTime;
    @BindView(R.id.tv_stage)
    TextView tvStage;
    @BindView(R.id.tv_role)
    TextView tvRole;
    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.tv_link_client)
    TextView tvLinkClient;
    @BindView(R.id.cb_follow_up)
    CheckBox cbFollowUp;
    @BindView(R.id.cb_contact_info)
    CheckBox cbContactInfo;

    private int mYear, mMonth, mDay;
    private ArrayList<String> mList = new ArrayList<>();
    private List<LocalMedia> selectList = new ArrayList<>();
    private DataRepository dataRepository;

    /*
    name	是	string	项目名称
category_id	是	string	项目分类
status_id	是	string	项目阶段
client[client_id][]	是	string	关联客户联系人
client[role_id][]	是	string	关联客户联系人角色
client[phone][]	是	string	关联客户联系人手机号
user[user_id][]	是	string	关联人员
user[look_follow][]	是	string	查看我的跟进记录 1是 0否
user[look_phone][]	是	string	查看项目客户联系方式 1是 0否
start_time	是	string	开始时间
end_time	否	string	截止时间
plan_follow_time	否	string	预跟进时间
is_emphasis	是	string	是否重点项目 1是 0否
detail	否	string	项目详情
     */
    private String category_id;
    private String status_id;
    private String client_id;
    private String role_id;
    private String phone;
    private String user_id;
    private String start_time = "";
    private String end_time = "";

    private String is_emphasis = "1";


    private List<ProjectConfigModel.DataBean.StatusListBean> statusList;
    private List<String> statusName = new ArrayList<>();
    private List<String> categoryName = new ArrayList<>();
    private List<ProjectConfigModel.DataBean.CategoryListBean> categoryList;
    private List<String> clientRoleName = new ArrayList<>();
    private List<ProjectConfigModel.DataBean.ClientRoleListBean> clientRoleList;
    private List<ProjectConfigModel.DataBean.UserListBean> userList;
    private List<String> userName = new ArrayList<>();
    private String look_follow = "0";
    private String look_phone = "0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_project);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
        Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH) + 1;
        mDay = c.get(Calendar.DAY_OF_MONTH);
        grid(mList);
        cbFollowUp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    look_follow = "1";
                } else {
                    look_follow = "0";
                }
            }
        });
        cbContactInfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    look_phone = "1";
                } else {
                    look_phone = "0";
                }
            }
        });
    }

    private void initData() {
        dataRepository = Injection.dataRepository(mContext);
        projectConfig();
        MyProjectListModel.DataBeanX.ListBean.DataBean dataBean = (MyProjectListModel.DataBeanX.ListBean.DataBean) getIntent().getSerializableExtra("DataBean");
        if (dataBean.getIs_emphasis() == 0) {
            iv1.setImageResource(R.mipmap.select);
            iv2.setImageResource(R.mipmap.unselect);
        } else {
            iv2.setImageResource(R.mipmap.select);
            iv1.setImageResource(R.mipmap.unselect);
        }
        edName.setText(dataBean.getName());
        tvType.setText(dataBean.getCategory().getName());
        category_id = dataBean.getCategory().getCategory_id() + "";
        tvStage.setText(dataBean.getStatus().getName());
        status_id = dataBean.getStatus().getProject_status_id() + "";
        tvLinkPerson.setText(dataBean.getClient().get(0).getClient().getName());
        client_id = dataBean.getClient().get(0).getClient().getClue_id() + "";
        if (dataBean.getClient().get(0).getRole() != null) {
            tvRole.setText(dataBean.getClient().get(0).getRole().getName());
            role_id = dataBean.getClient().get(0).getRole().getClue_role_id() + "";
        }
        phone = dataBean.getClient().get(0).getPhone();
        edPhone.setText(phone);
        tvLinkClient.setText(dataBean.getUser().get(0).getUser().getUser_name());
        user_id = dataBean.getUser().get(0).getUser().getUser_id() + "";
        if (dataBean.getUser().get(0).getLook_follow() == 1) {
            cbFollowUp.setChecked(true);
        } else {
            cbFollowUp.setChecked(false);
        }
        if (dataBean.getUser().get(0).getLook_phone() == 1) {
            cbContactInfo.setChecked(true);
        } else {
            cbContactInfo.setChecked(false);
        }
        tvStartTime.setText(dataBean.getStart_time());
        start_time = dataBean.getStart_time();
        if (!TextUtils.isEmpty(dataBean.getEnd_time())) {
            tvEndTime.setText(dataBean.getEnd_time());
            end_time = dataBean.getEnd_time();
        }
        edContent.setText(dataBean.getDetail());
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
                    categoryList = configModel.getData().getCategoryList();
                    for (int i = 0; i < categoryList.size(); i++) {
                        categoryName.add(categoryList.get(i).getName());
                    }
                    statusList = configModel.getData().getStatusList();
                    for (int i = 0; i < statusList.size(); i++) {
                        statusName.add(statusList.get(i).getName());
                    }
                    clientRoleList = configModel.getData().getClientRoleList();
                    for (int i = 0; i < clientRoleList.size(); i++) {
                        clientRoleName.add(clientRoleList.get(i).getName());
                    }
                    userList = configModel.getData().getUserList();
                    for (int i = 0; i < userList.size(); i++) {
                        userName.add(userList.get(i).getUser_name());
                    }
                }

            }
        });
    }


    private void editProject() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/project.index/edit/project_id/" + getIntent().getStringExtra("project_id"));
        map.put("token", FastData.getToken());
        map.put("name", edName.getText().toString());
        map.put("category_id", category_id);
        map.put("status_id", status_id);
        map.put("client[client_id][]", client_id);
        map.put("client[role_id][]", role_id);
        map.put("client[phone][]", phone);
        map.put("user[user_id][]", user_id);
        map.put("user[look_follow][]", look_follow);
        map.put("user[look_phone][]", look_phone);
        map.put("start_time", start_time);
        map.put("end_time", end_time);
        map.put("is_emphasis", is_emphasis);
        if (!TextUtils.isEmpty(edContent.getText().toString())) {
            map.put("detail", edContent.getText().toString());
        }
        dataRepository.editProject(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                StatusModel statusModel = (StatusModel) data;
                if (statusModel.getCode() == 1) {
                    ToastUtils.showToast("更新成功");
                    EventBus.getDefault().post("4");
                    finish();
                }else {
                    ToastUtils.showToast(statusModel.getMsg());
                }

            }
        });
    }


    private void grid(ArrayList<String> mList) {
        GridViewAdapter mGridViewAddImgAdapter = new GridViewAdapter(this, mList);

        gridView.setAdapter(mGridViewAddImgAdapter);
        mGridViewAddImgAdapter.setOnItemClickListener(new GridViewAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                mList.remove(position);
                mGridViewAddImgAdapter.notifyDataSetChanged();
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                rxPermissionTest();
            }
        });

    }

    private void rxPermissionTest() {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(granted -> {
                    if (granted) {
                        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view,
                                                    int position, long id) {
                                if (position == parent.getChildCount() - 1) {
                                    //如果“增加按钮形状的”图片的位置是最后一张，且添加了的图片的数量不超过5张，才能点击
                                    if (mList.size() == 3) {
                                        viewPluImg(mList, position);
                                    } else {
                                        //添加凭证图片
//                        selectPic();
                                        PictureSelector.create(EditProjectActivity.this)
                                                .openGallery(PictureMimeType.ofImage())
                                                .selectionMode(PictureConfig.MULTIPLE)
                                                .maxSelectNum(3)
                                                .compress(true)
                                                .loadImageEngine(GlideEngine.createGlideEngine())
                                                .enableCrop(false)
                                                .forResult(PictureConfig.CHOOSE_REQUEST);
                                    }
                                } else {
                                    viewPluImg(mList, position);
                                }
                            }
                        });

//                        PictureSelector
//                                .create(AdviseActivity.this, PictureSelector.SELECT_REQUEST_CODE)
//                                .selectPicture(true);

                    } else {
                        // Oups permission denied
                    }
                });
    }

    private void viewPluImg(ArrayList<String> list, int index) {
        Intent imgIntent = new Intent(this, TaskBigImgActivity.class);
        imgIntent.putStringArrayListExtra("paths", list);
        imgIntent.putExtra("position", index);
        startActivity(imgIntent);
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        selectList = PictureSelector.obtainMultipleResult(data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case PictureConfig.CHOOSE_REQUEST:
                    for (LocalMedia localMedia : selectList) {
                        String compressPath = localMedia.getCompressPath();
                        mList.add(compressPath);
                    }
                    grid(mList);
                    break;
                case 1001:
                    Serializable data1 = data.getSerializableExtra("client");
                    ProjectClientListModel.DataBean client = (ProjectClientListModel.DataBean) data1;
                    tvLinkPerson.setText(client.getName());
                    client_id = client.getClue_id() + "";
                    phone = client.getPhone();

                default:
                    break;
            }
        }
    }


    @OnClick({R.id.iv_back, R.id.tv_type, R.id.tv_link_person, R.id.tv_start_time, R.id.tv_end_time, R.id.ll_is, R.id.ll_no, R.id.tv_sure
            , R.id.tv_stage, R.id.tv_role, R.id.tv_link_client
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_type:
                if (categoryName != null && categoryName.size() > 0)
                    showOption(categoryName, tvType, new CallBack() {
                        @Override
                        public void callBack(int postion) {
                            category_id = categoryList.get(postion).getCategory_id() + "";
                        }
                    });
                break;
            case R.id.tv_stage:
                if (statusName != null && statusName.size() > 0)
                    showOption(statusName, tvStage, new CallBack() {
                        @Override
                        public void callBack(int postion) {
                            status_id = statusList.get(postion).getProject_status_id() + "";
                        }
                    });
                break;
            case R.id.tv_role:
                if (clientRoleName != null && clientRoleName.size() > 0)
                    showOption(clientRoleName, tvRole, new CallBack() {
                        @Override
                        public void callBack(int postion) {
                            role_id = statusList.get(postion).getProject_status_id() + "";
                        }
                    });
                break;
            case R.id.tv_link_client:
                if (userName != null && userName.size() > 0)
                    showOption(userName, tvLinkClient, new CallBack() {
                        @Override
                        public void callBack(int postion) {
                            user_id = userList.get(postion).getUser_id() + "";
                        }
                    });
                break;
            case R.id.tv_link_person:
                startActivityForResult(new Intent(mContext, LinkPersonActivity.class), 1001);
                break;
            case R.id.tv_start_time:
                showTimeOption(tvStartTime, new CallBackTime() {
                    @Override
                    public void callBackTime(String time) {
                        start_time = time;
                    }
                });
                break;
            case R.id.tv_end_time:
                showTimeOption(tvEndTime, new CallBackTime() {
                    @Override
                    public void callBackTime(String time) {
                        end_time = time;
                    }
                });
                break;
            case R.id.ll_is:
                iv1.setImageResource(R.mipmap.select);
                iv2.setImageResource(R.mipmap.unselect);
                is_emphasis = "1";
                break;
            case R.id.ll_no:
                iv1.setImageResource(R.mipmap.unselect);
                iv2.setImageResource(R.mipmap.select);
                is_emphasis = "0";
                break;
            case R.id.tv_sure:
                if (TextUtils.isEmpty(edName.getText().toString())) {
                    ToastUtils.showToast("请输入项目名称");
                    return;
                }
                if (TextUtils.isEmpty(tvType.getText().toString())) {
                    ToastUtils.showToast("请输入项目分类");
                    return;
                }
                if (TextUtils.isEmpty(tvStage.getText().toString())) {
                    ToastUtils.showToast("请输入项目阶段");
                    return;
                }
                if (TextUtils.isEmpty(tvLinkPerson.getText().toString())) {
                    ToastUtils.showToast("请选择客户联系人");
                    return;
                }
                if (TextUtils.isEmpty(tvRole.getText().toString())) {
                    ToastUtils.showToast("请选择客户角色");
                    return;
                }
                if (TextUtils.isEmpty(edPhone.getText().toString())) {
                    ToastUtils.showToast("请输入客户手机号码");
                    return;
                }
                if (TextUtils.isEmpty(tvLinkClient.getText().toString())) {
                    ToastUtils.showToast("请选择关联人员");
                    return;
                }
                editProject();
                break;

        }
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

    private interface CallBack {
        void callBack(int position);
    }

    private interface CallBackTime {
        void callBackTime(String time);
    }


}
