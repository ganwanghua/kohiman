package com.pinuoke.kohiman.customer;

import android.os.Bundle;

import com.pinuoke.kohiman.R;
import com.pinuoke.kohiman.common.BaseActivity;

public class CustomerDetailsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);
    }
}