package com.pinuoke.kohiman.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinuoke.kohiman.MainActivity;
import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;
import com.pinuoke.kohiman.model.LoginModel;
import com.pinuoke.kohiman.model.StatusModel;
import com.pinuoke.kohiman.nets.DataRepository;
import com.pinuoke.kohiman.nets.Injection;
import com.pinuoke.kohiman.nets.RemotDataSource;
import com.pinuoke.kohiman.utils.FastData;

import java.util.HashMap;
import java.util.Map;

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
    private DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        dataRepository = Injection.dataRepository(this);
        if (!TextUtils.isEmpty(FastData.getToken())) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
    }

    @OnClick(R.id.tv_login)
    public void onViewClicked() {
        if (TextUtils.isEmpty(edName.getText().toString())) {
            ToastUtils.showToast("请输入登录账号");
            return;
        }
        if (TextUtils.isEmpty(edPass.getText().toString())) {
            ToastUtils.showToast("请输入账号密码");
            return;
        }
        login();
    }

    private void login() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/sales/user/login");
        map.put("user_name", edName.getText().toString());
        map.put("password", edPass.getText().toString());
        dataRepository.login(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                StatusModel statusModel = (StatusModel) data;
                if (statusModel.getCode() == 1) {
                    LoginModel loginModel = new Gson().fromJson(statusModel.getData(), LoginModel.class);
                    FastData.setUserId(loginModel.getUser_id());
                    FastData.setToken(loginModel.getToken());
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    ToastUtils.showToast(statusModel.getMsg());
                }
            }
        });
    }
}
