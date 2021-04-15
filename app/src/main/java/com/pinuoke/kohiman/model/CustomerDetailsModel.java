package com.pinuoke.kohiman.model;

import java.io.Serializable;
import java.util.List;

public class CustomerDetailsModel implements Serializable {
    /**
     * code : 1
     * msg : success
     * data : {"detail":{"clue_id":14741,"name":"测试","first_character":"C","link_name":"测试","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13555555555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"爱上大声大声","remark":"","extra":"","allot_user_id":0,"allot_time":1618214983,"user_id":10080,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 17:26:34","value":1618219594},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 16:09:43","update_time":"2021-04-12 17:26:34","address":"安徽省合肥市蜀山区爱上大声大声","role":null,"source":null,"status":{"clue_status_id":10014,"name":"一般意向度","enterprise_id":10002,"sort":2,"status":1,"must_plan_follow_time":1,"is_delete":0,"create_time":"2020-02-28 14:39:41","update_time":"2020-04-08 11:40:19"},"user":{"user_id":10080,"user_name":"sq","password":"84992ec436274ae3467ce220fc593955","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试销售","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13956934659","birthday":0,"remark":"","last_login_time":"2021-04-13 11:51:48","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"allot_user":null,"tt_clue":null,"wx_clue":null,"tag_log":[],"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":1},"editLog":{"total":0,"per_page":20,"current_page":1,"last_page":0,"data":[]},"followLog":[{"follow_id":25504,"client_id":0,"client_status_id":0,"client_name":"","clue_id":14741,"clue_status_id":10014,"clue_name":"测试","follow_type_id":10010,"content":"是打分三大","user_id":10056,"now_user_id":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-12 17:26:34","user":{"user_id":10056,"user_name":"keximan2","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":0,"position_id":0,"real_name":"科希曼2","avatar_url":"","gender":{"value":1,"text":"男"},"mobile":"13388888888","birthday":0,"remark":"","last_login_time":"2021-04-13 11:27:24","is_super":1,"enterprise_id":10002,"status":1},"follow_type":{"follow_type_id":10010,"name":"微信","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"},"client":null,"clue":{"clue_id":14741,"name":"测试","first_character":"C","link_name":"测试","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13555555555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"爱上大声大声","remark":"","extra":"","allot_user_id":0,"allot_time":1618214983,"user_id":10080,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 17:26:34","value":1618219594},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 16:09:43","update_time":"2021-04-12 17:26:34","region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":1}}]}
     */

    private int code;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * detail : {"clue_id":14741,"name":"测试","first_character":"C","link_name":"测试","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13555555555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"爱上大声大声","remark":"","extra":"","allot_user_id":0,"allot_time":1618214983,"user_id":10080,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 17:26:34","value":1618219594},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 16:09:43","update_time":"2021-04-12 17:26:34","address":"安徽省合肥市蜀山区爱上大声大声","role":null,"source":null,"status":{"clue_status_id":10014,"name":"一般意向度","enterprise_id":10002,"sort":2,"status":1,"must_plan_follow_time":1,"is_delete":0,"create_time":"2020-02-28 14:39:41","update_time":"2020-04-08 11:40:19"},"user":{"user_id":10080,"user_name":"sq","password":"84992ec436274ae3467ce220fc593955","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试销售","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13956934659","birthday":0,"remark":"","last_login_time":"2021-04-13 11:51:48","is_super":0,"enterprise_id":10002,"status":1},"last_user":null,"allot_user":null,"tt_clue":null,"wx_clue":null,"tag_log":[],"region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":1}
         * editLog : {"total":0,"per_page":20,"current_page":1,"last_page":0,"data":[]}
         * followLog : [{"follow_id":25504,"client_id":0,"client_status_id":0,"client_name":"","clue_id":14741,"clue_status_id":10014,"clue_name":"测试","follow_type_id":10010,"content":"是打分三大","user_id":10056,"now_user_id":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-12 17:26:34","user":{"user_id":10056,"user_name":"keximan2","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":0,"position_id":0,"real_name":"科希曼2","avatar_url":"","gender":{"value":1,"text":"男"},"mobile":"13388888888","birthday":0,"remark":"","last_login_time":"2021-04-13 11:27:24","is_super":1,"enterprise_id":10002,"status":1},"follow_type":{"follow_type_id":10010,"name":"微信","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"},"client":null,"clue":{"clue_id":14741,"name":"测试","first_character":"C","link_name":"测试","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13555555555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"爱上大声大声","remark":"","extra":"","allot_user_id":0,"allot_time":1618214983,"user_id":10080,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 17:26:34","value":1618219594},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 16:09:43","update_time":"2021-04-12 17:26:34","region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":1}}]
         */

        private DetailBean detail;
        private EditLogBean editLog;
        private List<FollowLogBean> followLog;

        public DetailBean getDetail() {
            return detail;
        }

        public void setDetail(DetailBean detail) {
            this.detail = detail;
        }

        public EditLogBean getEditLog() {
            return editLog;
        }

        public void setEditLog(EditLogBean editLog) {
            this.editLog = editLog;
        }

        public List<FollowLogBean> getFollowLog() {
            return followLog;
        }

        public void setFollowLog(List<FollowLogBean> followLog) {
            this.followLog = followLog;
        }

        public static class DetailBean {
            /**
             * clue_id : 14741
             * name : 测试
             * first_character : C
             * link_name : 测试
             * gender : {"value":1,"text":"男"}
             * age : 0
             * role_id : 0
             * source_id : 0
             * status_id : 10014
             * phone : 13555555555
             * phone1 :
             * email :
             * wechat :
             * qq :
             * province_id : 1046
             * city_id : 1047
             * region_id : 1050
             * detail : 爱上大声大声
             * remark :
             * extra :
             * allot_user_id : 0
             * allot_time : 1618214983
             * user_id : 10080
             * last_user_id : 0
             * is_follow : 1
             * plan_follow_time : {"text":"2021-04-12","value":1618156800}
             * follow_time : {"text":"2021-04-12 17:26:34","value":1618219594}
             * follow_user_id : 0
             * entry_seas_count : 0
             * entry_seas_time : {"text":"","value":0}
             * is_client : 1
             * is_handle : 1
             * enterprise_id : 10002
             * mini_user_id : 0
             * is_delete : 0
             * create_time : 2021-04-12 16:09:43
             * update_time : 2021-04-12 17:26:34
             * address : 安徽省合肥市蜀山区爱上大声大声
             * role : null
             * source : null
             * status : {"clue_status_id":10014,"name":"一般意向度","enterprise_id":10002,"sort":2,"status":1,"must_plan_follow_time":1,"is_delete":0,"create_time":"2020-02-28 14:39:41","update_time":"2020-04-08 11:40:19"}
             * user : {"user_id":10080,"user_name":"sq","password":"84992ec436274ae3467ce220fc593955","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试销售","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13956934659","birthday":0,"remark":"","last_login_time":"2021-04-13 11:51:48","is_super":0,"enterprise_id":10002,"status":1}
             * last_user : null
             * allot_user : null
             * tt_clue : null
             * wx_clue : null
             * tag_log : []
             * region : {"province":"安徽省","city":"合肥市","region":"蜀山区"}
             * noFollowDays : 1
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
            private Object role;
            private SourceBean source;
            private StatusBean status;
            private UserBean user;
            private Object last_user;
            private Object allot_user;
            private Object tt_clue;
            private Object wx_clue;
            private RegionBean region;
            private String noFollowDays;
            private List<?> tag_log;

            public SourceBean getSource() {
                return source;
            }

            public void setSource(SourceBean source) {
                this.source = source;
            }

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

            public Object getRole() {
                return role;
            }

            public void setRole(Object role) {
                this.role = role;
            }

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
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

            public Object getAllot_user() {
                return allot_user;
            }

            public void setAllot_user(Object allot_user) {
                this.allot_user = allot_user;
            }

            public Object getTt_clue() {
                return tt_clue;
            }

            public void setTt_clue(Object tt_clue) {
                this.tt_clue = tt_clue;
            }

            public Object getWx_clue() {
                return wx_clue;
            }

            public void setWx_clue(Object wx_clue) {
                this.wx_clue = wx_clue;
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

            public List<?> getTag_log() {
                return tag_log;
            }

            public void setTag_log(List<?> tag_log) {
                this.tag_log = tag_log;
            }

            public static class SourceBean {
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

            public static class GenderBean {
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

            public static class PlanFollowTimeBean {
                /**
                 * text : 2021-04-12
                 * value : 1618156800
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

            public static class FollowTimeBean {
                /**
                 * text : 2021-04-12 17:26:34
                 * value : 1618219594
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

            public static class EntrySeasTimeBean {
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

            public static class StatusBean {
                /**
                 * clue_status_id : 10014
                 * name : 一般意向度
                 * enterprise_id : 10002
                 * sort : 2
                 * status : 1
                 * must_plan_follow_time : 1
                 * is_delete : 0
                 * create_time : 2020-02-28 14:39:41
                 * update_time : 2020-04-08 11:40:19
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

            public static class UserBean {
                /**
                 * user_id : 10080
                 * user_name : sq
                 * password : 84992ec436274ae3467ce220fc593955
                 * parent_user_id : 0
                 * department_id : 10005
                 * position_id : 10007
                 * real_name : 测试销售
                 * avatar_url :
                 * gender : {"value":0,"text":"未知"}
                 * mobile : 13956934659
                 * birthday : 0
                 * remark :
                 * last_login_time : 2021-04-13 11:51:48
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

                public static class GenderBeanX {
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

            public static class RegionBean {
                /**
                 * province : 安徽省
                 * city : 合肥市
                 * region : 蜀山区
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

        public static class EditLogBean {
            /**
             * total : 0
             * per_page : 20
             * current_page : 1
             * last_page : 0
             * data : []
             */

            private int total;
            private int per_page;
            private int current_page;
            private int last_page;
            private List<?> data;

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

            public List<?> getData() {
                return data;
            }

            public void setData(List<?> data) {
                this.data = data;
            }
        }

        public static class FollowLogBean implements Serializable {
            /**
             * follow_id : 25504
             * client_id : 0
             * client_status_id : 0
             * client_name :
             * clue_id : 14741
             * clue_status_id : 10014
             * clue_name : 测试
             * follow_type_id : 10010
             * content : 是打分三大
             * user_id : 10056
             * now_user_id : 0
             * enterprise_id : 10002
             * is_delete : 0
             * create_time : 2021-04-12 17:26:34
             * user : {"user_id":10056,"user_name":"keximan2","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":0,"position_id":0,"real_name":"科希曼2","avatar_url":"","gender":{"value":1,"text":"男"},"mobile":"13388888888","birthday":0,"remark":"","last_login_time":"2021-04-13 11:27:24","is_super":1,"enterprise_id":10002,"status":1}
             * follow_type : {"follow_type_id":10010,"name":"微信","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"}
             * client : null
             * clue : {"clue_id":14741,"name":"测试","first_character":"C","link_name":"测试","gender":{"value":1,"text":"男"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13555555555","phone1":"","email":"","wechat":"","qq":"","province_id":1046,"city_id":1047,"region_id":1050,"detail":"爱上大声大声","remark":"","extra":"","allot_user_id":0,"allot_time":1618214983,"user_id":10080,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 17:26:34","value":1618219594},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 16:09:43","update_time":"2021-04-12 17:26:34","region":{"province":"安徽省","city":"合肥市","region":"蜀山区"},"noFollowDays":1}
             */

            private int follow_id;
            private int client_id;
            private int client_status_id;
            private String client_name;
            private int clue_id;
            private int clue_status_id;
            private String clue_name;
            private int follow_type_id;
            private String content;
            private int user_id;
            private int now_user_id;
            private int enterprise_id;
            private int is_delete;
            private String create_time;
            private UserBeanX user;
            private FollowTypeBean follow_type;
            private Object client;
            private ClueBean clue;

            public int getFollow_id() {
                return follow_id;
            }

            public void setFollow_id(int follow_id) {
                this.follow_id = follow_id;
            }

            public int getClient_id() {
                return client_id;
            }

            public void setClient_id(int client_id) {
                this.client_id = client_id;
            }

            public int getClient_status_id() {
                return client_status_id;
            }

            public void setClient_status_id(int client_status_id) {
                this.client_status_id = client_status_id;
            }

            public String getClient_name() {
                return client_name;
            }

            public void setClient_name(String client_name) {
                this.client_name = client_name;
            }

            public int getClue_id() {
                return clue_id;
            }

            public void setClue_id(int clue_id) {
                this.clue_id = clue_id;
            }

            public int getClue_status_id() {
                return clue_status_id;
            }

            public void setClue_status_id(int clue_status_id) {
                this.clue_status_id = clue_status_id;
            }

            public String getClue_name() {
                return clue_name;
            }

            public void setClue_name(String clue_name) {
                this.clue_name = clue_name;
            }

            public int getFollow_type_id() {
                return follow_type_id;
            }

            public void setFollow_type_id(int follow_type_id) {
                this.follow_type_id = follow_type_id;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getNow_user_id() {
                return now_user_id;
            }

            public void setNow_user_id(int now_user_id) {
                this.now_user_id = now_user_id;
            }

            public int getEnterprise_id() {
                return enterprise_id;
            }

            public void setEnterprise_id(int enterprise_id) {
                this.enterprise_id = enterprise_id;
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

            public UserBeanX getUser() {
                return user;
            }

            public void setUser(UserBeanX user) {
                this.user = user;
            }

            public FollowTypeBean getFollow_type() {
                return follow_type;
            }

            public void setFollow_type(FollowTypeBean follow_type) {
                this.follow_type = follow_type;
            }

            public Object getClient() {
                return client;
            }

            public void setClient(Object client) {
                this.client = client;
            }

            public ClueBean getClue() {
                return clue;
            }

            public void setClue(ClueBean clue) {
                this.clue = clue;
            }

            public static class UserBeanX {
                /**
                 * user_id : 10056
                 * user_name : keximan2
                 * password : 97db5dc51a3545946f91d1c6c30e6c6d
                 * parent_user_id : 0
                 * department_id : 0
                 * position_id : 0
                 * real_name : 科希曼2
                 * avatar_url :
                 * gender : {"value":1,"text":"男"}
                 * mobile : 13388888888
                 * birthday : 0
                 * remark :
                 * last_login_time : 2021-04-13 11:27:24
                 * is_super : 1
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
                private GenderBeanXX gender;
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

                public GenderBeanXX getGender() {
                    return gender;
                }

                public void setGender(GenderBeanXX gender) {
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

                public static class GenderBeanXX {
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
            }

            public static class FollowTypeBean {
                /**
                 * follow_type_id : 10010
                 * name : 微信
                 * enterprise_id : 10002
                 * sort : 100
                 * status : 0
                 * is_delete : 0
                 * create_time : 2020-02-07 16:22:13
                 * update_time : 2020-02-07 16:22:13
                 */

                private int follow_type_id;
                private String name;
                private int enterprise_id;
                private int sort;
                private int status;
                private int is_delete;
                private String create_time;
                private String update_time;

                public int getFollow_type_id() {
                    return follow_type_id;
                }

                public void setFollow_type_id(int follow_type_id) {
                    this.follow_type_id = follow_type_id;
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

            public static class ClueBean {
                /**
                 * clue_id : 14741
                 * name : 测试
                 * first_character : C
                 * link_name : 测试
                 * gender : {"value":1,"text":"男"}
                 * age : 0
                 * role_id : 0
                 * source_id : 0
                 * status_id : 10014
                 * phone : 13555555555
                 * phone1 :
                 * email :
                 * wechat :
                 * qq :
                 * province_id : 1046
                 * city_id : 1047
                 * region_id : 1050
                 * detail : 爱上大声大声
                 * remark :
                 * extra :
                 * allot_user_id : 0
                 * allot_time : 1618214983
                 * user_id : 10080
                 * last_user_id : 0
                 * is_follow : 1
                 * plan_follow_time : {"text":"2021-04-12","value":1618156800}
                 * follow_time : {"text":"2021-04-12 17:26:34","value":1618219594}
                 * follow_user_id : 0
                 * entry_seas_count : 0
                 * entry_seas_time : {"text":"","value":0}
                 * is_client : 1
                 * is_handle : 1
                 * enterprise_id : 10002
                 * mini_user_id : 0
                 * is_delete : 0
                 * create_time : 2021-04-12 16:09:43
                 * update_time : 2021-04-12 17:26:34
                 * region : {"province":"安徽省","city":"合肥市","region":"蜀山区"}
                 * noFollowDays : 1
                 */

                private int clue_id;
                private String name;
                private String first_character;
                private String link_name;
                private GenderBeanXXX gender;
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
                private PlanFollowTimeBeanX plan_follow_time;
                private FollowTimeBeanX follow_time;
                private int follow_user_id;
                private int entry_seas_count;
                private EntrySeasTimeBeanX entry_seas_time;
                private int is_client;
                private int is_handle;
                private int enterprise_id;
                private int mini_user_id;
                private int is_delete;
                private String create_time;
                private String update_time;
                private RegionBeanX region;
                private String noFollowDays;

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

                public GenderBeanXXX getGender() {
                    return gender;
                }

                public void setGender(GenderBeanXXX gender) {
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

                public PlanFollowTimeBeanX getPlan_follow_time() {
                    return plan_follow_time;
                }

                public void setPlan_follow_time(PlanFollowTimeBeanX plan_follow_time) {
                    this.plan_follow_time = plan_follow_time;
                }

                public FollowTimeBeanX getFollow_time() {
                    return follow_time;
                }

                public void setFollow_time(FollowTimeBeanX follow_time) {
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

                public EntrySeasTimeBeanX getEntry_seas_time() {
                    return entry_seas_time;
                }

                public void setEntry_seas_time(EntrySeasTimeBeanX entry_seas_time) {
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

                public RegionBeanX getRegion() {
                    return region;
                }

                public void setRegion(RegionBeanX region) {
                    this.region = region;
                }

                public String getNoFollowDays() {
                    return noFollowDays;
                }

                public void setNoFollowDays(String noFollowDays) {
                    this.noFollowDays = noFollowDays;
                }

                public static class GenderBeanXXX {
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

                public static class PlanFollowTimeBeanX {
                    /**
                     * text : 2021-04-12
                     * value : 1618156800
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

                public static class FollowTimeBeanX {
                    /**
                     * text : 2021-04-12 17:26:34
                     * value : 1618219594
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

                public static class EntrySeasTimeBeanX {
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

                public static class RegionBeanX {
                    /**
                     * province : 安徽省
                     * city : 合肥市
                     * region : 蜀山区
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
