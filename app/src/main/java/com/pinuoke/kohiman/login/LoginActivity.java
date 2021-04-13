package com.pinuoke.kohiman.login;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.iv_user)
    ImageView ivUser;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.iv_pass)
    ImageView ivPass;
    @BindView(R.id.ed_pass)
    EditText edPass;
    @BindView(R.id.tv_login)
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_login)
    public void onViewClicked() {
    }
}
