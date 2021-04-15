package com.pinuoke.kohiman.nets;

import android.content.Context;

import java.util.Map;

/**
 * Created by whs on 2017/5/18
 */

public class DataRepository implements RemotDataSource {
    private Context mContext;

    private static DataRepository INSTANCE = null;


    private final RemotDataSourceImpl mRemoteDataSource;

    public static DataRepository getInstance(RemotDataSourceImpl remoteDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new DataRepository(remoteDataSource);
        }
        return INSTANCE;
    }

    private DataRepository(RemotDataSourceImpl remoteDataSource) {
        this.mRemoteDataSource = remoteDataSource;
    }

    @Override
    public void login(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.login(queryMap, callback);
    }

    @Override
    public void myCustomerList(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.myCustomerList(queryMap, callback);
    }

    @Override
    public void seasList(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.seasList(queryMap, callback);
    }

    @Override
    public void batchToSeas(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.batchToSeas(queryMap, callback);
    }

    @Override
    public void batchGetClue(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.batchGetClue(queryMap, callback);
    }

    @Override
    public void myProjectList(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.myProjectList(queryMap, callback);
    }

    @Override
    public void customerDetails(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.customerDetails(queryMap, callback);
    }

    @Override
    public void addCustomer(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.addCustomer(queryMap, callback);
    }

    @Override
    public void config(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.config(queryMap, callback);
    }
}
