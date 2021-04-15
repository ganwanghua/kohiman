package com.pinuoke.kohiman.nets;

import android.content.Context;

import com.pinuoke.kohiman.model.BatchToSeasModel;
import com.pinuoke.kohiman.model.ConfigModel;
import com.pinuoke.kohiman.model.CustomerDetailsModel;
import com.pinuoke.kohiman.model.MyCustomerListModel;
import com.pinuoke.kohiman.model.MyProjectListModel;
import com.pinuoke.kohiman.model.SeasListModel;
import com.pinuoke.kohiman.model.StatusModel;
import java.util.Map;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by whs on 2017/5/18
 */

public class RemotDataSourceImpl implements RemotDataSource {

    private static Context mContext;

    private static class Laydz {
        private static RemotDataSourceImpl instance = new RemotDataSourceImpl();
    }


    public static RemotDataSourceImpl getInstance(Context context) {
        mContext = context;
        return Laydz.instance;
    }

    @Override
    public void login(Map<String, String> queryMap, final getCallback callback) {
        Observable<StatusModel> observable = RetrofitHelper.getInstance(mContext).getServer().login(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<StatusModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(StatusModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void myCustomerList(Map<String, String> queryMap, final getCallback callback) {
        Observable<MyCustomerListModel> observable = RetrofitHelper.getInstance(mContext).getServer().myCustomerList(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MyCustomerListModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(MyCustomerListModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void seasList(Map<String, String> queryMap, final getCallback callback) {
        Observable<SeasListModel> observable = RetrofitHelper.getInstance(mContext).getServer().seasList(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SeasListModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(SeasListModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void batchToSeas(Map<String, String> queryMap, final getCallback callback) {
        Observable<BatchToSeasModel> observable = RetrofitHelper.getInstance(mContext).getServer().batchToSeas(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BatchToSeasModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(BatchToSeasModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void batchGetClue(Map<String, String> queryMap, final getCallback callback) {
        Observable<BatchToSeasModel> observable = RetrofitHelper.getInstance(mContext).getServer().batchGetClue(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BatchToSeasModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(BatchToSeasModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void myProjectList(Map<String, String> queryMap, getCallback callback) {
        Observable<MyProjectListModel> observable = RetrofitHelper.getInstance(mContext).getServer().myProjectList(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MyProjectListModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(MyProjectListModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void customerDetails(Map<String, String> queryMap, getCallback callback) {
        Observable<CustomerDetailsModel> observable = RetrofitHelper.getInstance(mContext).getServer().customerDetails(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CustomerDetailsModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(CustomerDetailsModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void addCustomer(Map<String, String> queryMap, getCallback callback) {
        Observable<BatchToSeasModel> observable = RetrofitHelper.getInstance(mContext).getServer().addCustomer(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BatchToSeasModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(BatchToSeasModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void config(Map<String, String> queryMap, getCallback callback) {
        Observable<ConfigModel> observable = RetrofitHelper.getInstance(mContext).getServer().config(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ConfigModel>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(ConfigModel s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }
}
