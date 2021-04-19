package com.pinuoke.kohiman.nets;


import java.util.Map;

/**
 * Created by whs on 2017/6/7
 */

public interface RemotDataSource {
    interface getCallback {

        void onFailure(String info);

        void onSuccess(Object data);
    }

    void login(Map<String, String> queryMap, getCallback callback);

    void myCustomerList(Map<String, String> queryMap, getCallback callback);

    void seasList(Map<String, String> queryMap, getCallback callback);

    void batchToSeas(Map<String, String> queryMap, getCallback callback);

    void batchGetClue(Map<String, String> queryMap, getCallback callback);

    void myProjectList(Map<String, String> queryMap, getCallback callback);

    void customerDetails(Map<String, String> queryMap, getCallback callback);

    void addCustomer(Map<String, String> queryMap, getCallback callback);

    void editCustomer(Map<String, String> queryMap, getCallback callback);

    void config(Map<String, String> queryMap, getCallback callback);

    void follow(Map<String, String> queryMap, getCallback callback);

    void projectAdd(Map<String, String> queryMap, getCallback callback);

    void projectConfig(Map<String, String> queryMap, getCallback callback);

    void projectClientList(Map<String, String> queryMap, getCallback callback);

    void projectFollowAdd(Map<String, String> queryMap, getCallback callback);

    void log(Map<String, String> queryMap, getCallback callback);

    void userInfo(Map<String, String> queryMap, getCallback callback);

    void myData(Map<String, String> queryMap, getCallback callback);

    void editProject(Map<String, String> queryMap, getCallback callback);

    void projectDetail(Map<String, String> queryMap, getCallback callback);
}
