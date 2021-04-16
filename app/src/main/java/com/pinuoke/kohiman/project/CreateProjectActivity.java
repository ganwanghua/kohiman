package com.pinuoke.kohiman.project;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.adapter.GridViewAdapter;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.weight.GlideEngine;
import com.pinuoke.kohiman.weight.GridViewInScrollView;
import com.tbruyelle.rxpermissions3.RxPermissions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.qqtheme.framework.picker.DatePicker;
import cn.qqtheme.framework.picker.OptionPicker;
import cn.qqtheme.framework.picker.TimePicker;
import cn.qqtheme.framework.widget.WheelView;

public class CreateProjectActivity extends BaseActivity {


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

    private int mYear,mMonth,mDay;
    private ArrayList<String> mList = new ArrayList<>();
    private List<LocalMedia> selectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH) + 1;
        mDay = c.get(Calendar.DAY_OF_MONTH);
        grid(mList);
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
                                        PictureSelector.create(CreateProjectActivity.this)
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
                default:
                    break;
            }
        }
    }




    @OnClick({R.id.iv_back, R.id.tv_type, R.id.tv_link_person, R.id.tv_start_time, R.id.tv_end_time, R.id.ll_is, R.id.ll_no, R.id.tv_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_type:
                break;
            case R.id.tv_link_person:
                List<String> list = new ArrayList<>();
                list.add("xiaoma");
                list.add("ccccc");
                showOption(list,tvLinkPerson);
                break;
            case R.id.tv_start_time:
                showTimeOption(tvStartTime);
                break;
            case R.id.tv_end_time:
                showTimeOption(tvEndTime);
                break;
            case R.id.ll_is:
                iv1.setImageResource(R.mipmap.select);
                iv2.setImageResource(R.mipmap.unselect);
                break;
            case R.id.ll_no:
                iv1.setImageResource(R.mipmap.unselect);
                iv2.setImageResource(R.mipmap.select);
                break;
            case R.id.tv_sure:
                break;
        }
    }

    private void showTimeOption(TextView textView) {
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
                textView.setText(year+"年"+month+"月"+day+"日");
            }
        });
        picker1.show();
    }


    private void showOption(List<String> sourceList,TextView textView) {
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
            }
        });
        picker1.show();
    }


}
