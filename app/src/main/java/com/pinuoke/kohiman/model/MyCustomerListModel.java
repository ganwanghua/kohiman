package com.pinuoke.kohiman.model;

import java.io.Serializable;
import java.util.List;

public class MyCustomerListModel implements Serializable {

    /**
     * code : 1
     * msg : success
     * data : {"list":{"total":6,"per_page":20,"current_page":1,"last_page":1,"data":[{"clue_id":14747,"name":"剑圣","first_character":"J","link_name":"阿卡丽","gender":{"value":1,"text":"男"},"age":55,"role_id":10013,"source_id":10026,"status_id":10018,"phone":"17497649769","phone1":"","email":"1679134966@qq.com","wechat":"13499799454","qq":"16791679","province_id":1168,"city_id":1169,"region_id":1170,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618469781,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:56:21","update_time":"2021-04-15 14:56:21","address":"福建省福州市鼓楼区","tagList":[],"role":{"clue_role_id":10013,"name":"使用人","enterprise_id":10002,"sort":100,"status":1,"is_delete":0,"create_time":"2020-02-08 18:40:17","update_time":"2020-02-08 18:40:17"},"status":{"clue_status_id":10018,"name":"新增签约客户","enterprise_id":10002,"sort":7,"status":1,"must_plan_follow_time":0,"is_delete":0,"create_time":"2020-03-02 15:59:12","update_time":"2020-04-08 11:30:57"},"source":{"clue_source_id":10026,"parent_id":0,"name":"房天下","enterprise_id":10002,"sort":7,"status":1,"is_delete":0,"create_time":"2020-03-27 16:16:58","update_time":"2020-03-27 16:16:58"},"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"福建省","city":"福州市","region":"鼓楼区"},"noFollowDays":"--"},{"clue_id":14746,"name":"还好有你","first_character":"H","link_name":"后天","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13864686468","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618467196,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:13:16","update_time":"2021-04-15 14:13:16","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14745,"name":"1466","first_character":"","link_name":"同工酶","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13894686468","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618467169,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:12:50","update_time":"2021-04-15 14:12:50","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14744,"name":"苏摩","first_character":"S","link_name":"白樱","gender":{"value":2,"text":"女"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13894649449","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618466878,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:07:58","update_time":"2021-04-15 14:07:58","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14743,"name":"普朗克","first_character":"P","link_name":"杰克琼斯","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13885855555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618466552,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:02:33","update_time":"2021-04-15 14:02:33","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14556,"name":"夏先生","first_character":"X","link_name":"夏先生","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":10011,"status_id":0,"phone":"18505559888","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":0,"detail":"","remark":"@直营店@柴不要了","extra":"{\"status\":\"success\",\"count\":1,\"data\":[{\"adv_id\":\"1654420645388365\",\"store_id\":0,\"clue_source\":1,\"weixin\":\"\",\"follow_state_name\":\"\\u5f85\\u8054\\u7cfb\",\"system_tags\":[\"\\u53c2\\u4e0e\\u8fd4\\u6b3e\"],\"adv_name\":\"\\u79d1\\u5e0c\\u66fc\\u7535\\u5668\\u6709\\u9650\\u516c\\u53f82\",\"site_id\":\"6869761656052121613\",\"convert_status\":\"\\u5408\\u6cd5\\u8f6c\\u5316\",\"date\":null,\"create_time\":\"1616658873\",\"remark_dict\":{\"\\u60a8\\u6240\\u5728\\u7684\\u5c0f\\u533a\":\"\\u9a6c\\u978d\\u5c71\\u5e02\\u535a\\u671b\\u533a\"},\"intention_estimation\":\"\",\"address\":\"\",\"city_name\":\"\",\"module_id\":\"1655766527473684\",\"clue_id\":\"6943497089540177928\",\"ad_plan_id\":\"1695163634266115\",\"form_remark\":\"\",\"qq\":\"\",\"remark\":\"\",\"ad_plan_name\":\"oCPM_03_03_\\u81ea\\u52a8\\u51fa\\u4ef7_1\",\"name\":\"\\u590f\\u5148\\u751f\",\"appname\":\"\\u4eca\\u65e5\\u5934\\u6761\",\"gender\":0,\"age\":0,\"cid\":1695168408432680,\"telphone\":\"18505559888\",\"clue_state_name\":\"\\u5f85\\u5206\\u914d\",\"clue_owner_name\":\"\",\"store_name\":\"\",\"country_name\":\"\",\"clue_state\":0,\"location\":\"\\u5b89\\u5fbd+\\u5408\\u80a5\",\"req_id\":\"202103251538290101501682301E0720BA\",\"clue_type\":0,\"robot_record_urls\":[],\"module_name\":\"9\\u79d2\\u83b7\\u53d6\\u62a5\\u4ef7\",\"external_url\":\"https:\\/\\/www.chengzijianzhan.com\\/tetris\\/page\\/6869761656052121613\\/\",\"email\":\"\",\"store\":{\"store_name\":\"\",\"store_id\":0,\"store_pack_remark\":\"\",\"store_pack_name\":\"\",\"store_remark\":\"\",\"store_address\":\"\",\"store_location\":\"\",\"store_pack_id\":0},\"province_name\":\"\"}]}","allot_user_id":0,"allot_time":1616658971,"user_id":10081,"last_user_id":10013,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":3,"entry_seas_time":{"text":"2021-04-14 10:44:02","value":1618368242},"is_client":1,"is_handle":0,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-03-25 15:54:33","update_time":"2021-04-14 11:08:46","address":"安徽省合肥市","tagList":[{"tag_id":10008,"name":"地暖空调"}],"role":null,"status":null,"source":{"clue_source_id":10011,"parent_id":0,"name":"头条","enterprise_id":10002,"sort":8,"status":1,"is_delete":0,"create_time":"2020-02-18 14:13:51","update_time":"2020-03-27 16:17:10"},"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":{"user_id":10013,"user_name":"sundongliang","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"孙东亮","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13956972935","birthday":0,"remark":"","last_login_time":"2021-04-09 11:39:57","is_super":0,"enterprise_id":10002,"status":1},"region":{"province":"安徽省","city":"合肥市","region":""},"noFollowDays":"--"}]}}
     */

    private int code;
    private String msg;
    private DataBeanX data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX implements Serializable {
        /**
         * list : {"total":6,"per_page":20,"current_page":1,"last_page":1,"data":[{"clue_id":14747,"name":"剑圣","first_character":"J","link_name":"阿卡丽","gender":{"value":1,"text":"男"},"age":55,"role_id":10013,"source_id":10026,"status_id":10018,"phone":"17497649769","phone1":"","email":"1679134966@qq.com","wechat":"13499799454","qq":"16791679","province_id":1168,"city_id":1169,"region_id":1170,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618469781,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:56:21","update_time":"2021-04-15 14:56:21","address":"福建省福州市鼓楼区","tagList":[],"role":{"clue_role_id":10013,"name":"使用人","enterprise_id":10002,"sort":100,"status":1,"is_delete":0,"create_time":"2020-02-08 18:40:17","update_time":"2020-02-08 18:40:17"},"status":{"clue_status_id":10018,"name":"新增签约客户","enterprise_id":10002,"sort":7,"status":1,"must_plan_follow_time":0,"is_delete":0,"create_time":"2020-03-02 15:59:12","update_time":"2020-04-08 11:30:57"},"source":{"clue_source_id":10026,"parent_id":0,"name":"房天下","enterprise_id":10002,"sort":7,"status":1,"is_delete":0,"create_time":"2020-03-27 16:16:58","update_time":"2020-03-27 16:16:58"},"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"福建省","city":"福州市","region":"鼓楼区"},"noFollowDays":"--"},{"clue_id":14746,"name":"还好有你","first_character":"H","link_name":"后天","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13864686468","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618467196,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:13:16","update_time":"2021-04-15 14:13:16","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14745,"name":"1466","first_character":"","link_name":"同工酶","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13894686468","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618467169,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:12:50","update_time":"2021-04-15 14:12:50","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14744,"name":"苏摩","first_character":"S","link_name":"白樱","gender":{"value":2,"text":"女"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13894649449","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618466878,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:07:58","update_time":"2021-04-15 14:07:58","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14743,"name":"普朗克","first_character":"P","link_name":"杰克琼斯","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13885855555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618466552,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:02:33","update_time":"2021-04-15 14:02:33","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14556,"name":"夏先生","first_character":"X","link_name":"夏先生","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":10011,"status_id":0,"phone":"18505559888","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":0,"detail":"","remark":"@直营店@柴不要了","extra":"{\"status\":\"success\",\"count\":1,\"data\":[{\"adv_id\":\"1654420645388365\",\"store_id\":0,\"clue_source\":1,\"weixin\":\"\",\"follow_state_name\":\"\\u5f85\\u8054\\u7cfb\",\"system_tags\":[\"\\u53c2\\u4e0e\\u8fd4\\u6b3e\"],\"adv_name\":\"\\u79d1\\u5e0c\\u66fc\\u7535\\u5668\\u6709\\u9650\\u516c\\u53f82\",\"site_id\":\"6869761656052121613\",\"convert_status\":\"\\u5408\\u6cd5\\u8f6c\\u5316\",\"date\":null,\"create_time\":\"1616658873\",\"remark_dict\":{\"\\u60a8\\u6240\\u5728\\u7684\\u5c0f\\u533a\":\"\\u9a6c\\u978d\\u5c71\\u5e02\\u535a\\u671b\\u533a\"},\"intention_estimation\":\"\",\"address\":\"\",\"city_name\":\"\",\"module_id\":\"1655766527473684\",\"clue_id\":\"6943497089540177928\",\"ad_plan_id\":\"1695163634266115\",\"form_remark\":\"\",\"qq\":\"\",\"remark\":\"\",\"ad_plan_name\":\"oCPM_03_03_\\u81ea\\u52a8\\u51fa\\u4ef7_1\",\"name\":\"\\u590f\\u5148\\u751f\",\"appname\":\"\\u4eca\\u65e5\\u5934\\u6761\",\"gender\":0,\"age\":0,\"cid\":1695168408432680,\"telphone\":\"18505559888\",\"clue_state_name\":\"\\u5f85\\u5206\\u914d\",\"clue_owner_name\":\"\",\"store_name\":\"\",\"country_name\":\"\",\"clue_state\":0,\"location\":\"\\u5b89\\u5fbd+\\u5408\\u80a5\",\"req_id\":\"202103251538290101501682301E0720BA\",\"clue_type\":0,\"robot_record_urls\":[],\"module_name\":\"9\\u79d2\\u83b7\\u53d6\\u62a5\\u4ef7\",\"external_url\":\"https:\\/\\/www.chengzijianzhan.com\\/tetris\\/page\\/6869761656052121613\\/\",\"email\":\"\",\"store\":{\"store_name\":\"\",\"store_id\":0,\"store_pack_remark\":\"\",\"store_pack_name\":\"\",\"store_remark\":\"\",\"store_address\":\"\",\"store_location\":\"\",\"store_pack_id\":0},\"province_name\":\"\"}]}","allot_user_id":0,"allot_time":1616658971,"user_id":10081,"last_user_id":10013,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":3,"entry_seas_time":{"text":"2021-04-14 10:44:02","value":1618368242},"is_client":1,"is_handle":0,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-03-25 15:54:33","update_time":"2021-04-14 11:08:46","address":"安徽省合肥市","tagList":[{"tag_id":10008,"name":"地暖空调"}],"role":null,"status":null,"source":{"clue_source_id":10011,"parent_id":0,"name":"头条","enterprise_id":10002,"sort":8,"status":1,"is_delete":0,"create_time":"2020-02-18 14:13:51","update_time":"2020-03-27 16:17:10"},"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":{"user_id":10013,"user_name":"sundongliang","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"孙东亮","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13956972935","birthday":0,"remark":"","last_login_time":"2021-04-09 11:39:57","is_super":0,"enterprise_id":10002,"status":1},"region":{"province":"安徽省","city":"合肥市","region":""},"noFollowDays":"--"}]}
         */

        private ListBean list;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public static class ListBean implements Serializable {
            /**
             * total : 6
             * per_page : 20
             * current_page : 1
             * last_page : 1
             * data : [{"clue_id":14747,"name":"剑圣","first_character":"J","link_name":"阿卡丽","gender":{"value":1,"text":"男"},"age":55,"role_id":10013,"source_id":10026,"status_id":10018,"phone":"17497649769","phone1":"","email":"1679134966@qq.com","wechat":"13499799454","qq":"16791679","province_id":1168,"city_id":1169,"region_id":1170,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618469781,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:56:21","update_time":"2021-04-15 14:56:21","address":"福建省福州市鼓楼区","tagList":[],"role":{"clue_role_id":10013,"name":"使用人","enterprise_id":10002,"sort":100,"status":1,"is_delete":0,"create_time":"2020-02-08 18:40:17","update_time":"2020-02-08 18:40:17"},"status":{"clue_status_id":10018,"name":"新增签约客户","enterprise_id":10002,"sort":7,"status":1,"must_plan_follow_time":0,"is_delete":0,"create_time":"2020-03-02 15:59:12","update_time":"2020-04-08 11:30:57"},"source":{"clue_source_id":10026,"parent_id":0,"name":"房天下","enterprise_id":10002,"sort":7,"status":1,"is_delete":0,"create_time":"2020-03-27 16:16:58","update_time":"2020-03-27 16:16:58"},"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"福建省","city":"福州市","region":"鼓楼区"},"noFollowDays":"--"},{"clue_id":14746,"name":"还好有你","first_character":"H","link_name":"后天","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13864686468","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618467196,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:13:16","update_time":"2021-04-15 14:13:16","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14745,"name":"1466","first_character":"","link_name":"同工酶","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13894686468","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618467169,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:12:50","update_time":"2021-04-15 14:12:50","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14744,"name":"苏摩","first_character":"S","link_name":"白樱","gender":{"value":2,"text":"女"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13894649449","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618466878,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:07:58","update_time":"2021-04-15 14:07:58","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14743,"name":"普朗克","first_character":"P","link_name":"杰克琼斯","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":0,"phone":"13885855555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618466552,"user_id":10081,"last_user_id":0,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-15 14:02:33","update_time":"2021-04-15 14:02:33","address":"安徽省合肥市蜀山区","tagList":[],"role":null,"status":null,"source":null,"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":"--"},{"clue_id":14556,"name":"夏先生","first_character":"X","link_name":"夏先生","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":10011,"status_id":0,"phone":"18505559888","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":0,"detail":"","remark":"@直营店@柴不要了","extra":"{\"status\":\"success\",\"count\":1,\"data\":[{\"adv_id\":\"1654420645388365\",\"store_id\":0,\"clue_source\":1,\"weixin\":\"\",\"follow_state_name\":\"\\u5f85\\u8054\\u7cfb\",\"system_tags\":[\"\\u53c2\\u4e0e\\u8fd4\\u6b3e\"],\"adv_name\":\"\\u79d1\\u5e0c\\u66fc\\u7535\\u5668\\u6709\\u9650\\u516c\\u53f82\",\"site_id\":\"6869761656052121613\",\"convert_status\":\"\\u5408\\u6cd5\\u8f6c\\u5316\",\"date\":null,\"create_time\":\"1616658873\",\"remark_dict\":{\"\\u60a8\\u6240\\u5728\\u7684\\u5c0f\\u533a\":\"\\u9a6c\\u978d\\u5c71\\u5e02\\u535a\\u671b\\u533a\"},\"intention_estimation\":\"\",\"address\":\"\",\"city_name\":\"\",\"module_id\":\"1655766527473684\",\"clue_id\":\"6943497089540177928\",\"ad_plan_id\":\"1695163634266115\",\"form_remark\":\"\",\"qq\":\"\",\"remark\":\"\",\"ad_plan_name\":\"oCPM_03_03_\\u81ea\\u52a8\\u51fa\\u4ef7_1\",\"name\":\"\\u590f\\u5148\\u751f\",\"appname\":\"\\u4eca\\u65e5\\u5934\\u6761\",\"gender\":0,\"age\":0,\"cid\":1695168408432680,\"telphone\":\"18505559888\",\"clue_state_name\":\"\\u5f85\\u5206\\u914d\",\"clue_owner_name\":\"\",\"store_name\":\"\",\"country_name\":\"\",\"clue_state\":0,\"location\":\"\\u5b89\\u5fbd+\\u5408\\u80a5\",\"req_id\":\"202103251538290101501682301E0720BA\",\"clue_type\":0,\"robot_record_urls\":[],\"module_name\":\"9\\u79d2\\u83b7\\u53d6\\u62a5\\u4ef7\",\"external_url\":\"https:\\/\\/www.chengzijianzhan.com\\/tetris\\/page\\/6869761656052121613\\/\",\"email\":\"\",\"store\":{\"store_name\":\"\",\"store_id\":0,\"store_pack_remark\":\"\",\"store_pack_name\":\"\",\"store_remark\":\"\",\"store_address\":\"\",\"store_location\":\"\",\"store_pack_id\":0},\"province_name\":\"\"}]}","allot_user_id":0,"allot_time":1616658971,"user_id":10081,"last_user_id":10013,"is_follow":0,"plan_follow_time":{"text":"","value":0},"follow_time":{"text":"","value":0},"follow_user_id":0,"entry_seas_count":3,"entry_seas_time":{"text":"2021-04-14 10:44:02","value":1618368242},"is_client":1,"is_handle":0,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-03-25 15:54:33","update_time":"2021-04-14 11:08:46","address":"安徽省合肥市","tagList":[{"tag_id":10008,"name":"地暖空调"}],"role":null,"status":null,"source":{"clue_source_id":10011,"parent_id":0,"name":"头条","enterprise_id":10002,"sort":8,"status":1,"is_delete":0,"create_time":"2020-02-18 14:13:51","update_time":"2020-03-27 16:17:10"},"user":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1},"last_user":{"user_id":10013,"user_name":"sundongliang","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"孙东亮","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13956972935","birthday":0,"remark":"","last_login_time":"2021-04-09 11:39:57","is_super":0,"enterprise_id":10002,"status":1},"region":{"province":"安徽省","city":"合肥市","region":""},"noFollowDays":"--"}]
             */

            private int total;
            private int per_page;
            private int current_page;
            private int last_page;
            private List<DataBean> data;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public int getPer_page() {
                return per_page;
            }

            public void setPer_page(int per_page) {
                this.per_page = per_page;
            }

            public int getCurrent_page() {
                return current_page;
            }

            public void setCurrent_page(int current_page) {
                this.current_page = current_page;
            }

            public int getLast_page() {
                return last_page;
            }

            public void setLast_page(int last_page) {
                this.last_page = last_page;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean implements Serializable {
                /**
                 * clue_id : 14747
                 * name : 剑圣
                 * first_character : J
                 * link_name : 阿卡丽
                 * gender : {"value":1,"text":"男"}
                 * age : 55
                 * role_id : 10013
                 * source_id : 10026
                 * status_id : 10018
                 * phone : 17497649769
                 * phone1 :
                 * email : 1679134966@qq.com
                 * wechat : 13499799454
                 * qq : 16791679
                 * province_id : 1168
                 * city_id : 1169
                 * region_id : 1170
                 * detail :
                 * remark :
                 * extra :
                 * allot_user_id : 0
                 * allot_time : 1618469781
                 * user_id : 10081
                 * last_user_id : 0
                 * is_follow : 0
                 * plan_follow_time : {"text":"","value":0}
                 * follow_time : {"text":"","value":0}
                 * follow_user_id : 0
                 * entry_seas_count : 0
                 * entry_seas_time : {"text":"","value":0}
                 * is_client : 1
                 * is_handle : 1
                 * enterprise_id : 10002
                 * mini_user_id : 0
                 * is_delete : 0
                 * create_time : 2021-04-15 14:56:21
                 * update_time : 2021-04-15 14:56:21
                 * address : 福建省福州市鼓楼区
                 * tagList : []
                 * role : {"clue_role_id":10013,"name":"使用人","enterprise_id":10002,"sort":100,"status":1,"is_delete":0,"create_time":"2020-02-08 18:40:17","update_time":"2020-02-08 18:40:17"}
                 * status : {"clue_status_id":10018,"name":"新增签约客户","enterprise_id":10002,"sort":7,"status":1,"must_plan_follow_time":0,"is_delete":0,"create_time":"2020-03-02 15:59:12","update_time":"2020-04-08 11:30:57"}
                 * source : {"clue_source_id":10026,"parent_id":0,"name":"房天下","enterprise_id":10002,"sort":7,"status":1,"is_delete":0,"create_time":"2020-03-27 16:16:58","update_time":"2020-03-27 16:16:58"}
                 * user : {"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-15 09:10:40","is_super":0,"enterprise_id":10002,"status":1}
                 * last_user : null
                 * region : {"province":"福建省","city":"福州市","region":"鼓楼区"}
                 * noFollowDays : --
                 */

                private int clue_id;
                private String name;
                private String first_character;
                private String link_name;
                private GenderBean gender;
                private int age;
                private int role_id;
                private int source_id;
                private int status_id;
                private String phone;
                private String phone1;
                private String email;
                private String wechat;
                private String qq;
                private int province_id;
                private int city_id;
                private int region_id;
                private String detail;
                private String remark;
                private String extra;
                private int allot_user_id;
                private int allot_time;
                private int user_id;
                private int last_user_id;
                private int is_follow;
                private PlanFollowTimeBean plan_follow_time;
                private FollowTimeBean follow_time;
                private int follow_user_id;
                private int entry_seas_count;
                private EntrySeasTimeBean entry_seas_time;
                private int is_client;
                private int is_handle;
                private int enterprise_id;
                private int mini_user_id;
                private int is_delete;
                private String create_time;
                private String update_time;
                private String address;
                private RoleBean role;
                private StatusBean status;
                private SourceBean source;
                private UserBean user;
                private Object last_user;
                private RegionBean region;
                private String noFollowDays;
                private List<?> tagList;

                public int getClue_id() {
                    return clue_id;
                }

                public void setClue_id(int clue_id) {
                    this.clue_id = clue_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getFirst_character() {
                    return first_character;
                }

                public void setFirst_character(String first_character) {
                    this.first_character = first_character;
                }

                public String getLink_name() {
                    return link_name;
                }

                public void setLink_name(String link_name) {
                    this.link_name = link_name;
                }

                public GenderBean getGender() {
                    return gender;
                }

                public void setGender(GenderBean gender) {
                    this.gender = gender;
                }

                public int getAge() {
                    return age;
                }

                public void setAge(int age) {
                    this.age = age;
                }

                public int getRole_id() {
                    return role_id;
                }

                public void setRole_id(int role_id) {
                    this.role_id = role_id;
                }

                public int getSource_id() {
                    return source_id;
                }

                public void setSource_id(int source_id) {
                    this.source_id = source_id;
                }

                public int getStatus_id() {
                    return status_id;
                }

                public void setStatus_id(int status_id) {
                    this.status_id = status_id;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getPhone1() {
                    return phone1;
                }

                public void setPhone1(String phone1) {
                    this.phone1 = phone1;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getWechat() {
                    return wechat;
                }

                public void setWechat(String wechat) {
                    this.wechat = wechat;
                }

                public String getQq() {
                    return qq;
                }

                public void setQq(String qq) {
                    this.qq = qq;
                }

                public int getProvince_id() {
                    return province_id;
                }

                public void setProvince_id(int province_id) {
                    this.province_id = province_id;
                }

                public int getCity_id() {
                    return city_id;
                }

                public void setCity_id(int city_id) {
                    this.city_id = city_id;
                }

                public int getRegion_id() {
                    return region_id;
                }

                public void setRegion_id(int region_id) {
                    this.region_id = region_id;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getExtra() {
                    return extra;
                }

                public void setExtra(String extra) {
                    this.extra = extra;
                }

                public int getAllot_user_id() {
                    return allot_user_id;
                }

                public void setAllot_user_id(int allot_user_id) {
                    this.allot_user_id = allot_user_id;
                }

                public int getAllot_time() {
                    return allot_time;
                }

                public void setAllot_time(int allot_time) {
                    this.allot_time = allot_time;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public int getLast_user_id() {
                    return last_user_id;
                }

                public void setLast_user_id(int last_user_id) {
                    this.last_user_id = last_user_id;
                }

                public int getIs_follow() {
                    return is_follow;
                }

                public void setIs_follow(int is_follow) {
                    this.is_follow = is_follow;
                }

                public PlanFollowTimeBean getPlan_follow_time() {
                    return plan_follow_time;
                }

                public void setPlan_follow_time(PlanFollowTimeBean plan_follow_time) {
                    this.plan_follow_time = plan_follow_time;
                }

                public FollowTimeBean getFollow_time() {
                    return follow_time;
                }

                public void setFollow_time(FollowTimeBean follow_time) {
                    this.follow_time = follow_time;
                }

                public int getFollow_user_id() {
                    return follow_user_id;
                }

                public void setFollow_user_id(int follow_user_id) {
                    this.follow_user_id = follow_user_id;
                }

                public int getEntry_seas_count() {
                    return entry_seas_count;
                }

                public void setEntry_seas_count(int entry_seas_count) {
                    this.entry_seas_count = entry_seas_count;
                }

                public EntrySeasTimeBean getEntry_seas_time() {
                    return entry_seas_time;
                }

                public void setEntry_seas_time(EntrySeasTimeBean entry_seas_time) {
                    this.entry_seas_time = entry_seas_time;
                }

                public int getIs_client() {
                    return is_client;
                }

                public void setIs_client(int is_client) {
                    this.is_client = is_client;
                }

                public int getIs_handle() {
                    return is_handle;
                }

                public void setIs_handle(int is_handle) {
                    this.is_handle = is_handle;
                }

                public int getEnterprise_id() {
                    return enterprise_id;
                }

                public void setEnterprise_id(int enterprise_id) {
                    this.enterprise_id = enterprise_id;
                }

                public int getMini_user_id() {
                    return mini_user_id;
                }

                public void setMini_user_id(int mini_user_id) {
                    this.mini_user_id = mini_user_id;
                }

                public int getIs_delete() {
                    return is_delete;
                }

                public void setIs_delete(int is_delete) {
                    this.is_delete = is_delete;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public RoleBean getRole() {
                    return role;
                }

                public void setRole(RoleBean role) {
                    this.role = role;
                }

                public StatusBean getStatus() {
                    return status;
                }

                public void setStatus(StatusBean status) {
                    this.status = status;
                }

                public SourceBean getSource() {
                    return source;
                }

                public void setSource(SourceBean source) {
                    this.source = source;
                }

                public UserBean getUser() {
                    return user;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public Object getLast_user() {
                    return last_user;
                }

                public void setLast_user(Object last_user) {
                    this.last_user = last_user;
                }

                public RegionBean getRegion() {
                    return region;
                }

                public void setRegion(RegionBean region) {
                    this.region = region;
                }

                public String getNoFollowDays() {
                    return noFollowDays;
                }

                public void setNoFollowDays(String noFollowDays) {
                    this.noFollowDays = noFollowDays;
                }

                public List<?> getTagList() {
                    return tagList;
                }

                public void setTagList(List<?> tagList) {
                    this.tagList = tagList;
                }

                public static class GenderBean implements Serializable{
                    /**
                     * value : 1
                     * text : 男
                     */

                    private int value;
                    private String text;

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }
                }

                public static class PlanFollowTimeBean implements Serializable{
                    /**
                     * text :
                     * value : 0
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class FollowTimeBean implements Serializable{
                    /**
                     * text :
                     * value : 0
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EntrySeasTimeBean implements Serializable{
                    /**
                     * text :
                     * value : 0
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class RoleBean implements Serializable{
                    /**
                     * clue_role_id : 10013
                     * name : 使用人
                     * enterprise_id : 10002
                     * sort : 100
                     * status : 1
                     * is_delete : 0
                     * create_time : 2020-02-08 18:40:17
                     * update_time : 2020-02-08 18:40:17
                     */

                    private int clue_role_id;
                    private String name;
                    private int enterprise_id;
                    private int sort;
                    private int status;
                    private int is_delete;
                    private String create_time;
                    private String update_time;

                    public int getClue_role_id() {
                        return clue_role_id;
                    }

                    public void setClue_role_id(int clue_role_id) {
                        this.clue_role_id = clue_role_id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getEnterprise_id() {
                        return enterprise_id;
                    }

                    public void setEnterprise_id(int enterprise_id) {
                        this.enterprise_id = enterprise_id;
                    }

                    public int getSort() {
                        return sort;
                    }

                    public void setSort(int sort) {
                        this.sort = sort;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public int getIs_delete() {
                        return is_delete;
                    }

                    public void setIs_delete(int is_delete) {
                        this.is_delete = is_delete;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getUpdate_time() {
                        return update_time;
                    }

                    public void setUpdate_time(String update_time) {
                        this.update_time = update_time;
                    }
                }

                public static class StatusBean implements Serializable{
                    /**
                     * clue_status_id : 10018
                     * name : 新增签约客户
                     * enterprise_id : 10002
                     * sort : 7
                     * status : 1
                     * must_plan_follow_time : 0
                     * is_delete : 0
                     * create_time : 2020-03-02 15:59:12
                     * update_time : 2020-04-08 11:30:57
                     */

                    private int clue_status_id;
                    private String name;
                    private int enterprise_id;
                    private int sort;
                    private int status;
                    private int must_plan_follow_time;
                    private int is_delete;
                    private String create_time;
                    private String update_time;

                    public int getClue_status_id() {
                        return clue_status_id;
                    }

                    public void setClue_status_id(int clue_status_id) {
                        this.clue_status_id = clue_status_id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getEnterprise_id() {
                        return enterprise_id;
                    }

                    public void setEnterprise_id(int enterprise_id) {
                        this.enterprise_id = enterprise_id;
                    }

                    public int getSort() {
                        return sort;
                    }

                    public void setSort(int sort) {
                        this.sort = sort;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public int getMust_plan_follow_time() {
                        return must_plan_follow_time;
                    }

                    public void setMust_plan_follow_time(int must_plan_follow_time) {
                        this.must_plan_follow_time = must_plan_follow_time;
                    }

                    public int getIs_delete() {
                        return is_delete;
                    }

                    public void setIs_delete(int is_delete) {
                        this.is_delete = is_delete;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getUpdate_time() {
                        return update_time;
                    }

                    public void setUpdate_time(String update_time) {
                        this.update_time = update_time;
                    }
                }

                public static class SourceBean implements Serializable{
                    /**
                     * clue_source_id : 10026
                     * parent_id : 0
                     * name : 房天下
                     * enterprise_id : 10002
                     * sort : 7
                     * status : 1
                     * is_delete : 0
                     * create_time : 2020-03-27 16:16:58
                     * update_time : 2020-03-27 16:16:58
                     */

                    private int clue_source_id;
                    private int parent_id;
                    private String name;
                    private int enterprise_id;
                    private int sort;
                    private int status;
                    private int is_delete;
                    private String create_time;
                    private String update_time;

                    public int getClue_source_id() {
                        return clue_source_id;
                    }

                    public void setClue_source_id(int clue_source_id) {
                        this.clue_source_id = clue_source_id;
                    }

                    public int getParent_id() {
                        return parent_id;
                    }

                    public void setParent_id(int parent_id) {
                        this.parent_id = parent_id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getEnterprise_id() {
                        return enterprise_id;
                    }

                    public void setEnterprise_id(int enterprise_id) {
                        this.enterprise_id = enterprise_id;
                    }

                    public int getSort() {
                        return sort;
                    }

                    public void setSort(int sort) {
                        this.sort = sort;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public int getIs_delete() {
                        return is_delete;
                    }

                    public void setIs_delete(int is_delete) {
                        this.is_delete = is_delete;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getUpdate_time() {
                        return update_time;
                    }

                    public void setUpdate_time(String update_time) {
                        this.update_time = update_time;
                    }
                }

                public static class UserBean implements Serializable{
                    /**
                     * user_id : 10081
                     * user_name : apptest
                     * password : 5b3a14ece3100489c908a2c07cc7db06
                     * parent_user_id : 0
                     * department_id : 10005
                     * position_id : 10007
                     * real_name : 测试
                     * avatar_url :
                     * gender : {"value":0,"text":"未知"}
                     * mobile : 13333333333
                     * birthday : 0
                     * remark :
                     * last_login_time : 2021-04-15 09:10:40
                     * is_super : 0
                     * enterprise_id : 10002
                     * status : 1
                     */

                    private int user_id;
                    private String user_name;
                    private String password;
                    private int parent_user_id;
                    private int department_id;
                    private int position_id;
                    private String real_name;
                    private String avatar_url;
                    private GenderBeanX gender;
                    private String mobile;
                    private int birthday;
                    private String remark;
                    private String last_login_time;
                    private int is_super;
                    private int enterprise_id;
                    private int status;

                    public int getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public String getUser_name() {
                        return user_name;
                    }

                    public void setUser_name(String user_name) {
                        this.user_name = user_name;
                    }

                    public String getPassword() {
                        return password;
                    }

                    public void setPassword(String password) {
                        this.password = password;
                    }

                    public int getParent_user_id() {
                        return parent_user_id;
                    }

                    public void setParent_user_id(int parent_user_id) {
                        this.parent_user_id = parent_user_id;
                    }

                    public int getDepartment_id() {
                        return department_id;
                    }

                    public void setDepartment_id(int department_id) {
                        this.department_id = department_id;
                    }

                    public int getPosition_id() {
                        return position_id;
                    }

                    public void setPosition_id(int position_id) {
                        this.position_id = position_id;
                    }

                    public String getReal_name() {
                        return real_name;
                    }

                    public void setReal_name(String real_name) {
                        this.real_name = real_name;
                    }

                    public String getAvatar_url() {
                        return avatar_url;
                    }

                    public void setAvatar_url(String avatar_url) {
                        this.avatar_url = avatar_url;
                    }

                    public GenderBeanX getGender() {
                        return gender;
                    }

                    public void setGender(GenderBeanX gender) {
                        this.gender = gender;
                    }

                    public String getMobile() {
                        return mobile;
                    }

                    public void setMobile(String mobile) {
                        this.mobile = mobile;
                    }

                    public int getBirthday() {
                        return birthday;
                    }

                    public void setBirthday(int birthday) {
                        this.birthday = birthday;
                    }

                    public String getRemark() {
                        return remark;
                    }

                    public void setRemark(String remark) {
                        this.remark = remark;
                    }

                    public String getLast_login_time() {
                        return last_login_time;
                    }

                    public void setLast_login_time(String last_login_time) {
                        this.last_login_time = last_login_time;
                    }

                    public int getIs_super() {
                        return is_super;
                    }

                    public void setIs_super(int is_super) {
                        this.is_super = is_super;
                    }

                    public int getEnterprise_id() {
                        return enterprise_id;
                    }

                    public void setEnterprise_id(int enterprise_id) {
                        this.enterprise_id = enterprise_id;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public static class GenderBeanX implements Serializable{
                        /**
                         * value : 0
                         * text : 未知
                         */

                        private int value;
                        private String text;

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }
                    }
                }

                public static class RegionBean implements Serializable{
                    /**
                     * province : 福建省
                     * city : 福州市
                     * region : 鼓楼区
                     */

                    private String province;
                    private String city;
                    private String region;

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getRegion() {
                        return region;
                    }

                    public void setRegion(String region) {
                        this.region = region;
                    }
                }
            }
        }
    }
}
