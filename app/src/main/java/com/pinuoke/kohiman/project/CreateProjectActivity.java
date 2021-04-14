package com.pinuoke.kohiman.project;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.weight.GridViewInScrollView;

import org.angmarch.views.NiceSpinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CreateProjectActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_one)
    TextView tvOne;
    @BindView(R.id.tv_1)
    TextView tv1;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.tv_two)
    TextView tvTwo;
    @BindView(R.id.tv_2)
    TextView tv2;
    @BindView(R.id.spinner_project)
    NiceSpinner spinnerProject;
    @BindView(R.id.tv_three)
    TextView tvThree;
    @BindView(R.id.tv_3)
    TextView tv3;
    @BindView(R.id.spinner_link_person)
    NiceSpinner spinnerLinkPerson;
    @BindView(R.id.tv_four)
    TextView tvFour;
    @BindView(R.id.tv_4)
    TextView tv4;
    @BindView(R.id.spinner_ctime)
    NiceSpinner spinnerCtime;
    @BindView(R.id.tv_five)
    TextView tvFive;
    @BindView(R.id.tv_5)
    TextView tv5;
    @BindView(R.id.spinner_etime)
    NiceSpinner spinnerEtime;
    @BindView(R.id.tv_six)
    TextView tvSix;
    @BindView(R.id.is)
    RadioButton is;
    @BindView(R.id.no)
    RadioButton no;
    @BindView(R.id.gender)
    RadioGroup gender;
    @BindView(R.id.ed_content)
    EditText edContent;
    @BindView(R.id.gridView)
    GridViewInScrollView gridView;
    @BindView(R.id.tv_sure)
    TextView tvSure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick({R.id.iv_back, R.id.tv_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_sure:
                break;
        }
    }
}
