package com.pinuoke.kohiman.workbench;

import android.os.Bundle;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;

public class LogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
    }
}