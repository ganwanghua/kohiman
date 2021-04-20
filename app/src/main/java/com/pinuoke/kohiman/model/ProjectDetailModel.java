package com.pinuoke.kohiman.model;

import java.io.Serializable;
import java.util.List;

public class ProjectDetailModel {

    /**
     * code : 1
     * msg : success
     * data : {"detail":{"project_id":10223,"name":"22","category_id":10019,"detail":"<p>11<\/p>","status_id":10007,"team_id":0,"start_time":"2021-04-14","end_time":"2021-04-23","plan_follow_time":{"text":"2021-04-14","value":1618329600},"follow_time":{"text":"2021-04-14 14:37:04","value":1618382224},"create_user_id":10056,"is_emphasis":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 14:37:04","category":{"category_id":10019,"parent_id":10011,"name":"山西煤炭运销集团泰山隆安煤业有限公司","enterprise_id":10002,"sort":10,"is_delete":0,"create_time":"2021-03-27 19:04:31","update_time":"2021-03-27 19:04:31"},"create_user":null,"client":[{"project_client_id":10297,"project_id":10223,"client_id":14742,"role_id":10008,"phone":"13333333333","add_user_id":10056,"enterprise_id":10002,"create_time":"2021-04-14 13:40:55","client":{"clue_id":14742,"name":"11","first_character":"","link_name":"11","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13777777777","phone1":"","email":"","wechat":"","qq":"","province_id":0,"city_id":0,"region_id":0,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618224264,"user_id":0,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 18:45:02","value":1618224302},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 18:44:24","update_time":"2021-04-12 18:45:02","region":{"province":"","city":"","region":""},"noFollowDays":"2"}}],"status":{"project_status_id":10007,"name":"施工阶段","enterprise_id":10002,"sort":100,"status":1,"must_plan_follow_time":1,"is_delete":0,"create_time":"2020-03-04 15:01:38","update_time":"2020-03-04 15:01:38"},"user":[{"project_user_id":10316,"project_id":10223,"user_id":10078,"add_user_id":10056,"look_follow":1,"look_phone":1,"enterprise_id":10002,"create_time":"2021-04-14 13:40:55","user":{"user_id":10078,"user_name":"yanggen","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10012,"position_id":10005,"real_name":"杨根","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13965678484","birthday":0,"remark":"","last_login_time":"1970-01-01 08:00:00","is_super":0,"enterprise_id":10002,"status":1}}],"node":[{"node_id":10454,"project_id":10223,"node_name":"11","color":"#4b565b","symbol_size":50,"desc":"","enterprise_id":10002,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 13:40:55"}],"graph":[],"attachment":[],"noFollowDays":0},"look_phone":null,"followLog":[{"follow_id":11198,"project_id":10223,"project_status_id":10007,"project_name":"22","follow_type_id":10008,"content":"ASDASD","user_id":10056,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 14:37:04","project":{"project_id":10223,"name":"22","category_id":10019,"detail":"<p>11<\/p>","status_id":10007,"team_id":0,"start_time":"2021-04-14","end_time":"2021-04-23","plan_follow_time":{"text":"2021-04-14","value":1618329600},"follow_time":{"text":"2021-04-14 14:37:04","value":1618382224},"create_user_id":10056,"is_emphasis":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 14:37:04","noFollowDays":0},"user":{"user_id":10056,"user_name":"keximan2","password":"84992ec436274ae3467ce220fc593955","parent_user_id":0,"department_id":0,"position_id":0,"real_name":"科希曼2","avatar_url":"","gender":{"value":1,"text":"男"},"mobile":"13388888888","birthday":0,"remark":"","last_login_time":"2021-04-13 16:39:57","is_super":1,"enterprise_id":10002,"status":1},"follow_type":{"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"}}]}
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

    public static class DataBean {
        /**
         * detail : {"project_id":10223,"name":"22","category_id":10019,"detail":"<p>11<\/p>","status_id":10007,"team_id":0,"start_time":"2021-04-14","end_time":"2021-04-23","plan_follow_time":{"text":"2021-04-14","value":1618329600},"follow_time":{"text":"2021-04-14 14:37:04","value":1618382224},"create_user_id":10056,"is_emphasis":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 14:37:04","category":{"category_id":10019,"parent_id":10011,"name":"山西煤炭运销集团泰山隆安煤业有限公司","enterprise_id":10002,"sort":10,"is_delete":0,"create_time":"2021-03-27 19:04:31","update_time":"2021-03-27 19:04:31"},"create_user":null,"client":[{"project_client_id":10297,"project_id":10223,"client_id":14742,"role_id":10008,"phone":"13333333333","add_user_id":10056,"enterprise_id":10002,"create_time":"2021-04-14 13:40:55","client":{"clue_id":14742,"name":"11","first_character":"","link_name":"11","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13777777777","phone1":"","email":"","wechat":"","qq":"","province_id":0,"city_id":0,"region_id":0,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618224264,"user_id":0,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 18:45:02","value":1618224302},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 18:44:24","update_time":"2021-04-12 18:45:02","region":{"province":"","city":"","region":""},"noFollowDays":"2"}}],"status":{"project_status_id":10007,"name":"施工阶段","enterprise_id":10002,"sort":100,"status":1,"must_plan_follow_time":1,"is_delete":0,"create_time":"2020-03-04 15:01:38","update_time":"2020-03-04 15:01:38"},"user":[{"project_user_id":10316,"project_id":10223,"user_id":10078,"add_user_id":10056,"look_follow":1,"look_phone":1,"enterprise_id":10002,"create_time":"2021-04-14 13:40:55","user":{"user_id":10078,"user_name":"yanggen","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10012,"position_id":10005,"real_name":"杨根","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13965678484","birthday":0,"remark":"","last_login_time":"1970-01-01 08:00:00","is_super":0,"enterprise_id":10002,"status":1}}],"node":[{"node_id":10454,"project_id":10223,"node_name":"11","color":"#4b565b","symbol_size":50,"desc":"","enterprise_id":10002,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 13:40:55"}],"graph":[],"attachment":[],"noFollowDays":0}
         * look_phone : null
         * followLog : [{"follow_id":11198,"project_id":10223,"project_status_id":10007,"project_name":"22","follow_type_id":10008,"content":"ASDASD","user_id":10056,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 14:37:04","project":{"project_id":10223,"name":"22","category_id":10019,"detail":"<p>11<\/p>","status_id":10007,"team_id":0,"start_time":"2021-04-14","end_time":"2021-04-23","plan_follow_time":{"text":"2021-04-14","value":1618329600},"follow_time":{"text":"2021-04-14 14:37:04","value":1618382224},"create_user_id":10056,"is_emphasis":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 14:37:04","noFollowDays":0},"user":{"user_id":10056,"user_name":"keximan2","password":"84992ec436274ae3467ce220fc593955","parent_user_id":0,"department_id":0,"position_id":0,"real_name":"科希曼2","avatar_url":"","gender":{"value":1,"text":"男"},"mobile":"13388888888","birthday":0,"remark":"","last_login_time":"2021-04-13 16:39:57","is_super":1,"enterprise_id":10002,"status":1},"follow_type":{"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"}}]
         */

        private DetailBean detail;
        private Object look_phone;
        private List<FollowLogBean> followLog;

        public DetailBean getDetail() {
            return detail;
        }

        public void setDetail(DetailBean detail) {
            this.detail = detail;
        }

        public Object getLook_phone() {
            return look_phone;
        }

        public void setLook_phone(Object look_phone) {
            this.look_phone = look_phone;
        }

        public List<FollowLogBean> getFollowLog() {
            return followLog;
        }

        public void setFollowLog(List<FollowLogBean> followLog) {
            this.followLog = followLog;
        }

        public static class DetailBean implements Serializable {
            /**
             * project_id : 10223
             * name : 22
             * category_id : 10019
             * detail : <p>11</p>
             * status_id : 10007
             * team_id : 0
             * start_time : 2021-04-14
             * end_time : 2021-04-23
             * plan_follow_time : {"text":"2021-04-14","value":1618329600}
             * follow_time : {"text":"2021-04-14 14:37:04","value":1618382224}
             * create_user_id : 10056
             * is_emphasis : 0
             * enterprise_id : 10002
             * is_delete : 0
             * create_time : 2021-04-14 13:40:55
             * update_time : 2021-04-14 14:37:04
             * category : {"category_id":10019,"parent_id":10011,"name":"山西煤炭运销集团泰山隆安煤业有限公司","enterprise_id":10002,"sort":10,"is_delete":0,"create_time":"2021-03-27 19:04:31","update_time":"2021-03-27 19:04:31"}
             * create_user : null
             * client : [{"project_client_id":10297,"project_id":10223,"client_id":14742,"role_id":10008,"phone":"13333333333","add_user_id":10056,"enterprise_id":10002,"create_time":"2021-04-14 13:40:55","client":{"clue_id":14742,"name":"11","first_character":"","link_name":"11","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13777777777","phone1":"","email":"","wechat":"","qq":"","province_id":0,"city_id":0,"region_id":0,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618224264,"user_id":0,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 18:45:02","value":1618224302},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 18:44:24","update_time":"2021-04-12 18:45:02","region":{"province":"","city":"","region":""},"noFollowDays":"2"}}]
             * status : {"project_status_id":10007,"name":"施工阶段","enterprise_id":10002,"sort":100,"status":1,"must_plan_follow_time":1,"is_delete":0,"create_time":"2020-03-04 15:01:38","update_time":"2020-03-04 15:01:38"}
             * user : [{"project_user_id":10316,"project_id":10223,"user_id":10078,"add_user_id":10056,"look_follow":1,"look_phone":1,"enterprise_id":10002,"create_time":"2021-04-14 13:40:55","user":{"user_id":10078,"user_name":"yanggen","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10012,"position_id":10005,"real_name":"杨根","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13965678484","birthday":0,"remark":"","last_login_time":"1970-01-01 08:00:00","is_super":0,"enterprise_id":10002,"status":1}}]
             * node : [{"node_id":10454,"project_id":10223,"node_name":"11","color":"#4b565b","symbol_size":50,"desc":"","enterprise_id":10002,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 13:40:55"}]
             * graph : []
             * attachment : []
             * noFollowDays : 0
             */

            private int project_id;
            private String name;
            private int category_id;
            private String detail;
            private int status_id;
            private int team_id;
            private String start_time;
            private String end_time;
            private PlanFollowTimeBean plan_follow_time;
            private FollowTimeBean follow_time;
            private int create_user_id;
            private int is_emphasis;
            private int enterprise_id;
            private int is_delete;
            private String create_time;
            private String update_time;
            private CategoryBean category;
            private Object create_user;
            private StatusBean status;
            private String noFollowDays;
            private List<ClientBeanX> client;
            private List<UserBeanX> user;
            private List<NodeBean> node;
            private List<?> graph;
            private List<?> attachment;

            public int getProject_id() {
                return project_id;
            }

            public void setProject_id(int project_id) {
                this.project_id = project_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public int getStatus_id() {
                return status_id;
            }

            public void setStatus_id(int status_id) {
                this.status_id = status_id;
            }

            public int getTeam_id() {
                return team_id;
            }

            public void setTeam_id(int team_id) {
                this.team_id = team_id;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
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

            public int getCreate_user_id() {
                return create_user_id;
            }

            public void setCreate_user_id(int create_user_id) {
                this.create_user_id = create_user_id;
            }

            public int getIs_emphasis() {
                return is_emphasis;
            }

            public void setIs_emphasis(int is_emphasis) {
                this.is_emphasis = is_emphasis;
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

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public CategoryBean getCategory() {
                return category;
            }

            public void setCategory(CategoryBean category) {
                this.category = category;
            }

            public Object getCreate_user() {
                return create_user;
            }

            public void setCreate_user(Object create_user) {
                this.create_user = create_user;
            }

            public StatusBean getStatus() {
                return status;
            }

            public void setStatus(StatusBean status) {
                this.status = status;
            }

            public String getNoFollowDays() {
                return noFollowDays;
            }

            public void setNoFollowDays(String noFollowDays) {
                this.noFollowDays = noFollowDays;
            }

            public List<ClientBeanX> getClient() {
                return client;
            }

            public void setClient(List<ClientBeanX> client) {
                this.client = client;
            }

            public List<UserBeanX> getUser() {
                return user;
            }

            public void setUser(List<UserBeanX> user) {
                this.user = user;
            }

            public List<NodeBean> getNode() {
                return node;
            }

            public void setNode(List<NodeBean> node) {
                this.node = node;
            }

            public List<?> getGraph() {
                return graph;
            }

            public void setGraph(List<?> graph) {
                this.graph = graph;
            }

            public List<?> getAttachment() {
                return attachment;
            }

            public void setAttachment(List<?> attachment) {
                this.attachment = attachment;
            }

            public static class PlanFollowTimeBean implements Serializable{
                /**
                 * text : 2021-04-14
                 * value : 1618329600
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
                 * text : 2021-04-14 14:37:04
                 * value : 1618382224
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

            public static class CategoryBean implements Serializable {
                /**
                 * category_id : 10019
                 * parent_id : 10011
                 * name : 山西煤炭运销集团泰山隆安煤业有限公司
                 * enterprise_id : 10002
                 * sort : 10
                 * is_delete : 0
                 * create_time : 2021-03-27 19:04:31
                 * update_time : 2021-03-27 19:04:31
                 */

                private int category_id;
                private int parent_id;
                private String name;
                private int enterprise_id;
                private int sort;
                private int is_delete;
                private String create_time;
                private String update_time;

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
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
                 * project_status_id : 10007
                 * name : 施工阶段
                 * enterprise_id : 10002
                 * sort : 100
                 * status : 1
                 * must_plan_follow_time : 1
                 * is_delete : 0
                 * create_time : 2020-03-04 15:01:38
                 * update_time : 2020-03-04 15:01:38
                 */

                private int project_status_id;
                private String name;
                private int enterprise_id;
                private int sort;
                private int status;
                private int must_plan_follow_time;
                private int is_delete;
                private String create_time;
                private String update_time;

                public int getProject_status_id() {
                    return project_status_id;
                }

                public void setProject_status_id(int project_status_id) {
                    this.project_status_id = project_status_id;
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

            public static class ClientBeanX implements Serializable{
                /**
                 * project_client_id : 10297
                 * project_id : 10223
                 * client_id : 14742
                 * role_id : 10008
                 * phone : 13333333333
                 * add_user_id : 10056
                 * enterprise_id : 10002
                 * create_time : 2021-04-14 13:40:55
                 * client : {"clue_id":14742,"name":"11","first_character":"","link_name":"11","gender":{"value":0,"text":"未知"},"age":0,"role_id":0,"source_id":0,"status_id":10014,"phone":"13777777777","phone1":"","email":"","wechat":"","qq":"","province_id":0,"city_id":0,"region_id":0,"detail":"","remark":"","extra":"","allot_user_id":0,"allot_time":1618224264,"user_id":0,"last_user_id":0,"is_follow":1,"plan_follow_time":{"text":"2021-04-12","value":1618156800},"follow_time":{"text":"2021-04-12 18:45:02","value":1618224302},"follow_user_id":0,"entry_seas_count":0,"entry_seas_time":{"text":"","value":0},"is_client":1,"is_handle":1,"enterprise_id":10002,"mini_user_id":0,"is_delete":0,"create_time":"2021-04-12 18:44:24","update_time":"2021-04-12 18:45:02","region":{"province":"","city":"","region":""},"noFollowDays":"2"}
                 */

                private int project_client_id;
                private int project_id;
                private int client_id;
                private int role_id;
                private String phone;
                private int add_user_id;
                private int enterprise_id;
                private String create_time;
                private ClientBean client;
                private RoleBean role;

                public RoleBean getRole() {
                    return role;
                }

                public void setRole(RoleBean role) {
                    this.role = role;
                }

                public static class RoleBean implements Serializable{

                    /**
                     * clue_role_id : 10008
                     * name : 普通人
                     * enterprise_id : 10002
                     * sort : 100
                     * status : 1
                     * is_delete : 0
                     * create_time : 2020-02-08 18:40:17
                     * update_time : 2020-02-08 18:40:50
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


                public int getProject_client_id() {
                    return project_client_id;
                }

                public void setProject_client_id(int project_client_id) {
                    this.project_client_id = project_client_id;
                }

                public int getProject_id() {
                    return project_id;
                }

                public void setProject_id(int project_id) {
                    this.project_id = project_id;
                }

                public int getClient_id() {
                    return client_id;
                }

                public void setClient_id(int client_id) {
                    this.client_id = client_id;
                }

                public int getRole_id() {
                    return role_id;
                }

                public void setRole_id(int role_id) {
                    this.role_id = role_id;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public int getAdd_user_id() {
                    return add_user_id;
                }

                public void setAdd_user_id(int add_user_id) {
                    this.add_user_id = add_user_id;
                }

                public int getEnterprise_id() {
                    return enterprise_id;
                }

                public void setEnterprise_id(int enterprise_id) {
                    this.enterprise_id = enterprise_id;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public ClientBean getClient() {
                    return client;
                }

                public void setClient(ClientBean client) {
                    this.client = client;
                }

                public static class ClientBean implements Serializable{
                    /**
                     * clue_id : 14742
                     * name : 11
                     * first_character :
                     * link_name : 11
                     * gender : {"value":0,"text":"未知"}
                     * age : 0
                     * role_id : 0
                     * source_id : 0
                     * status_id : 10014
                     * phone : 13777777777
                     * phone1 :
                     * email :
                     * wechat :
                     * qq :
                     * province_id : 0
                     * city_id : 0
                     * region_id : 0
                     * detail :
                     * remark :
                     * extra :
                     * allot_user_id : 0
                     * allot_time : 1618224264
                     * user_id : 0
                     * last_user_id : 0
                     * is_follow : 1
                     * plan_follow_time : {"text":"2021-04-12","value":1618156800}
                     * follow_time : {"text":"2021-04-12 18:45:02","value":1618224302}
                     * follow_user_id : 0
                     * entry_seas_count : 0
                     * entry_seas_time : {"text":"","value":0}
                     * is_client : 1
                     * is_handle : 1
                     * enterprise_id : 10002
                     * mini_user_id : 0
                     * is_delete : 0
                     * create_time : 2021-04-12 18:44:24
                     * update_time : 2021-04-12 18:45:02
                     * region : {"province":"","city":"","region":""}
                     * noFollowDays : 2
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
                    private PlanFollowTimeBeanX plan_follow_time;
                    private FollowTimeBeanX follow_time;
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
                    private RegionBean region;
                    private String noFollowDays;


                    public static class RoleBean implements Serializable{

                        /**
                         * clue_role_id : 10008
                         * name : 普通人
                         * enterprise_id : 10002
                         * sort : 100
                         * status : 1
                         * is_delete : 0
                         * create_time : 2020-02-08 18:40:17
                         * update_time : 2020-02-08 18:40:50
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

                    public static class GenderBean implements Serializable{
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

                    public static class PlanFollowTimeBeanX implements Serializable {
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

                    public static class FollowTimeBeanX implements Serializable{
                        /**
                         * text : 2021-04-12 18:45:02
                         * value : 1618224302
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

                    public static class RegionBean implements Serializable{
                        /**
                         * province :
                         * city :
                         * region :
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

            public static class UserBeanX implements Serializable{
                /**
                 * project_user_id : 10316
                 * project_id : 10223
                 * user_id : 10078
                 * add_user_id : 10056
                 * look_follow : 1
                 * look_phone : 1
                 * enterprise_id : 10002
                 * create_time : 2021-04-14 13:40:55
                 * user : {"user_id":10078,"user_name":"yanggen","password":"97db5dc51a3545946f91d1c6c30e6c6d","parent_user_id":0,"department_id":10012,"position_id":10005,"real_name":"杨根","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13965678484","birthday":0,"remark":"","last_login_time":"1970-01-01 08:00:00","is_super":0,"enterprise_id":10002,"status":1}
                 */

                private int project_user_id;
                private int project_id;
                private int user_id;
                private int add_user_id;
                private int look_follow;
                private int look_phone;
                private int enterprise_id;
                private String create_time;
                private UserBean user;

                public int getProject_user_id() {
                    return project_user_id;
                }

                public void setProject_user_id(int project_user_id) {
                    this.project_user_id = project_user_id;
                }

                public int getProject_id() {
                    return project_id;
                }

                public void setProject_id(int project_id) {
                    this.project_id = project_id;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public int getAdd_user_id() {
                    return add_user_id;
                }

                public void setAdd_user_id(int add_user_id) {
                    this.add_user_id = add_user_id;
                }

                public int getLook_follow() {
                    return look_follow;
                }

                public void setLook_follow(int look_follow) {
                    this.look_follow = look_follow;
                }

                public int getLook_phone() {
                    return look_phone;
                }

                public void setLook_phone(int look_phone) {
                    this.look_phone = look_phone;
                }

                public int getEnterprise_id() {
                    return enterprise_id;
                }

                public void setEnterprise_id(int enterprise_id) {
                    this.enterprise_id = enterprise_id;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }

                public UserBean getUser() {
                    return user;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public static class UserBean implements Serializable{
                    /**
                     * user_id : 10078
                     * user_name : yanggen
                     * password : 97db5dc51a3545946f91d1c6c30e6c6d
                     * parent_user_id : 0
                     * department_id : 10012
                     * position_id : 10005
                     * real_name : 杨根
                     * avatar_url :
                     * gender : {"value":0,"text":"未知"}
                     * mobile : 13965678484
                     * birthday : 0
                     * remark :
                     * last_login_time : 1970-01-01 08:00:00
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
            }

            public static class NodeBean implements Serializable {
                /**
                 * node_id : 10454
                 * project_id : 10223
                 * node_name : 11
                 * color : #4b565b
                 * symbol_size : 50
                 * desc :
                 * enterprise_id : 10002
                 * create_time : 2021-04-14 13:40:55
                 * update_time : 2021-04-14 13:40:55
                 */

                private int node_id;
                private int project_id;
                private String node_name;
                private String color;
                private int symbol_size;
                private String desc;
                private int enterprise_id;
                private String create_time;
                private String update_time;

                public int getNode_id() {
                    return node_id;
                }

                public void setNode_id(int node_id) {
                    this.node_id = node_id;
                }

                public int getProject_id() {
                    return project_id;
                }

                public void setProject_id(int project_id) {
                    this.project_id = project_id;
                }

                public String getNode_name() {
                    return node_name;
                }

                public void setNode_name(String node_name) {
                    this.node_name = node_name;
                }

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public int getSymbol_size() {
                    return symbol_size;
                }

                public void setSymbol_size(int symbol_size) {
                    this.symbol_size = symbol_size;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public int getEnterprise_id() {
                    return enterprise_id;
                }

                public void setEnterprise_id(int enterprise_id) {
                    this.enterprise_id = enterprise_id;
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
        }

        public static class FollowLogBean {
            /**
             * follow_id : 11198
             * project_id : 10223
             * project_status_id : 10007
             * project_name : 22
             * follow_type_id : 10008
             * content : ASDASD
             * user_id : 10056
             * enterprise_id : 10002
             * is_delete : 0
             * create_time : 2021-04-14 14:37:04
             * project : {"project_id":10223,"name":"22","category_id":10019,"detail":"<p>11<\/p>","status_id":10007,"team_id":0,"start_time":"2021-04-14","end_time":"2021-04-23","plan_follow_time":{"text":"2021-04-14","value":1618329600},"follow_time":{"text":"2021-04-14 14:37:04","value":1618382224},"create_user_id":10056,"is_emphasis":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 13:40:55","update_time":"2021-04-14 14:37:04","noFollowDays":0}
             * user : {"user_id":10056,"user_name":"keximan2","password":"84992ec436274ae3467ce220fc593955","parent_user_id":0,"department_id":0,"position_id":0,"real_name":"科希曼2","avatar_url":"","gender":{"value":1,"text":"男"},"mobile":"13388888888","birthday":0,"remark":"","last_login_time":"2021-04-13 16:39:57","is_super":1,"enterprise_id":10002,"status":1}
             * follow_type : {"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"}
             */

            private int follow_id;
            private int project_id;
            private int project_status_id;
            private String project_name;
            private int follow_type_id;
            private String content;
            private int user_id;
            private int enterprise_id;
            private int is_delete;
            private String create_time;
            private ProjectBean project;
            private UserBeanXX user;
            private FollowTypeBean follow_type;

            public int getFollow_id() {
                return follow_id;
            }

            public void setFollow_id(int follow_id) {
                this.follow_id = follow_id;
            }

            public int getProject_id() {
                return project_id;
            }

            public void setProject_id(int project_id) {
                this.project_id = project_id;
            }

            public int getProject_status_id() {
                return project_status_id;
            }

            public void setProject_status_id(int project_status_id) {
                this.project_status_id = project_status_id;
            }

            public String getProject_name() {
                return project_name;
            }

            public void setProject_name(String project_name) {
                this.project_name = project_name;
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

            public ProjectBean getProject() {
                return project;
            }

            public void setProject(ProjectBean project) {
                this.project = project;
            }

            public UserBeanXX getUser() {
                return user;
            }

            public void setUser(UserBeanXX user) {
                this.user = user;
            }

            public FollowTypeBean getFollow_type() {
                return follow_type;
            }

            public void setFollow_type(FollowTypeBean follow_type) {
                this.follow_type = follow_type;
            }

            public static class ProjectBean {
                /**
                 * project_id : 10223
                 * name : 22
                 * category_id : 10019
                 * detail : <p>11</p>
                 * status_id : 10007
                 * team_id : 0
                 * start_time : 2021-04-14
                 * end_time : 2021-04-23
                 * plan_follow_time : {"text":"2021-04-14","value":1618329600}
                 * follow_time : {"text":"2021-04-14 14:37:04","value":1618382224}
                 * create_user_id : 10056
                 * is_emphasis : 0
                 * enterprise_id : 10002
                 * is_delete : 0
                 * create_time : 2021-04-14 13:40:55
                 * update_time : 2021-04-14 14:37:04
                 * noFollowDays : 0
                 */

                private int project_id;
                private String name;
                private int category_id;
                private String detail;
                private int status_id;
                private int team_id;
                private String start_time;
                private String end_time;
                private PlanFollowTimeBeanXX plan_follow_time;
                private FollowTimeBeanXX follow_time;
                private int create_user_id;
                private int is_emphasis;
                private int enterprise_id;
                private int is_delete;
                private String create_time;
                private String update_time;
                private String noFollowDays;

                public int getProject_id() {
                    return project_id;
                }

                public void setProject_id(int project_id) {
                    this.project_id = project_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public int getStatus_id() {
                    return status_id;
                }

                public void setStatus_id(int status_id) {
                    this.status_id = status_id;
                }

                public int getTeam_id() {
                    return team_id;
                }

                public void setTeam_id(int team_id) {
                    this.team_id = team_id;
                }

                public String getStart_time() {
                    return start_time;
                }

                public void setStart_time(String start_time) {
                    this.start_time = start_time;
                }

                public String getEnd_time() {
                    return end_time;
                }

                public void setEnd_time(String end_time) {
                    this.end_time = end_time;
                }

                public PlanFollowTimeBeanXX getPlan_follow_time() {
                    return plan_follow_time;
                }

                public void setPlan_follow_time(PlanFollowTimeBeanXX plan_follow_time) {
                    this.plan_follow_time = plan_follow_time;
                }

                public FollowTimeBeanXX getFollow_time() {
                    return follow_time;
                }

                public void setFollow_time(FollowTimeBeanXX follow_time) {
                    this.follow_time = follow_time;
                }

                public int getCreate_user_id() {
                    return create_user_id;
                }

                public void setCreate_user_id(int create_user_id) {
                    this.create_user_id = create_user_id;
                }

                public int getIs_emphasis() {
                    return is_emphasis;
                }

                public void setIs_emphasis(int is_emphasis) {
                    this.is_emphasis = is_emphasis;
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

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getNoFollowDays() {
                    return noFollowDays;
                }

                public void setNoFollowDays(String noFollowDays) {
                    this.noFollowDays = noFollowDays;
                }

                public static class PlanFollowTimeBeanXX {
                    /**
                     * text : 2021-04-14
                     * value : 1618329600
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

                public static class FollowTimeBeanXX {
                    /**
                     * text : 2021-04-14 14:37:04
                     * value : 1618382224
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
            }

            public static class UserBeanXX {
                /**
                 * user_id : 10056
                 * user_name : keximan2
                 * password : 84992ec436274ae3467ce220fc593955
                 * parent_user_id : 0
                 * department_id : 0
                 * position_id : 0
                 * real_name : 科希曼2
                 * avatar_url :
                 * gender : {"value":1,"text":"男"}
                 * mobile : 13388888888
                 * birthday : 0
                 * remark :
                 * last_login_time : 2021-04-13 16:39:57
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
                 * follow_type_id : 10008
                 * name : 到访
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
        }
    }
}
