package com.pinuoke.kohiman.nets;

import com.pinuoke.kohiman.model.BatchToSeasModel;
import com.pinuoke.kohiman.model.ConfigModel;
import com.pinuoke.kohiman.model.CustomerDetailsModel;
import com.pinuoke.kohiman.model.LogModel;
import com.pinuoke.kohiman.model.MyCustomerListModel;
import com.pinuoke.kohiman.model.MyDataModel;
import com.pinuoke.kohiman.model.MyProjectListModel;
import com.pinuoke.kohiman.model.SeasListModel;
import com.pinuoke.kohiman.model.StatusModel;
import com.pinuoke.kohiman.model.UserInfoModel;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by whs on 2017/2/17
 * Retrofit 接口
 */

public interface RetrofitService {
    // 登录
    @POST("index.php")
    Observable<StatusModel> login(@QueryMap Map<String, String> queryMap);

    // 我的客户列表
    @POST("index.php")
    Observable<MyCustomerListModel> myCustomerList(@QueryMap Map<String, String> queryMap);

    // 公海客户
    @POST("index.php")
    Observable<SeasListModel> seasList(@QueryMap Map<String, String> queryMap);

    // 移除公海
    @POST("index.php")
    Observable<BatchToSeasModel> batchToSeas(@QueryMap Map<String, String> queryMap);

    // 公海客户领取
    @POST("index.php")
    Observable<BatchToSeasModel> batchGetClue(@QueryMap Map<String, String> queryMap);

    // 我的项目
    @POST("index.php")
    Observable<MyProjectListModel> myProjectList(@QueryMap Map<String, String> queryMap);

    // 客户详情
    @POST("index.php")
    Observable<CustomerDetailsModel> customerDetails(@QueryMap Map<String, String> queryMap);

    // 新增客户
    @POST("index.php")
    Observable<BatchToSeasModel> addCustomer(@QueryMap Map<String, String> queryMap);

    // 编辑客户
    @POST("index.php")
    Observable<StatusModel> editCustomer(@QueryMap Map<String, String> queryMap);

    // 配置项
    @POST("index.php")
    Observable<ConfigModel> config(@QueryMap Map<String, String> queryMap);

    // 跟进客户
    @POST("index.php")
    Observable<BatchToSeasModel> follow(@QueryMap Map<String, String> queryMap);

    // 工作日志
    @POST("index.php")
    Observable<LogModel> log(@QueryMap Map<String, String> queryMap);

    // 用户信息
    @POST("index.php")
    Observable<UserInfoModel> userInfo(@QueryMap Map<String, String> queryMap);

    // 数据统计
    @POST("index.php")
    Observable<MyDataModel> myData(@QueryMap Map<String, String> queryMap);
}
