package com.pinuoke.kohiman.nets;

import com.pinuoke.kohiman.model.StatusModel;

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
}
