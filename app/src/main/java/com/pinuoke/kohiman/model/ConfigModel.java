package com.pinuoke.kohiman.model;

import java.util.List;

public class ConfigModel {

    /**
     * code : 1
     * msg : success
     * data : {"sourceList":[{"clue_source_id":10019,"parent_id":0,"name":"SEM-云推广","name_h1":"SEM-云推广"},{"clue_source_id":10020,"parent_id":0,"name":"SEM--竞价","name_h1":"SEM--竞价"},{"clue_source_id":10021,"parent_id":0,"name":"天猫","name_h1":"天猫"},{"clue_source_id":10023,"parent_id":0,"name":"400","name_h1":"400"},{"clue_source_id":10024,"parent_id":0,"name":"自助","name_h1":"自助"},{"clue_source_id":10026,"parent_id":0,"name":"房天下","name_h1":"房天下"},{"clue_source_id":10011,"parent_id":0,"name":"头条","name_h1":"头条"},{"clue_source_id":10027,"parent_id":0,"name":"UC","name_h1":"UC"},{"clue_source_id":10012,"parent_id":0,"name":"微信","name_h1":"微信"},{"clue_source_id":10013,"parent_id":0,"name":"手动","name_h1":"手动"},{"clue_source_id":10014,"parent_id":10013,"name":"老客户","name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;老客户"},{"clue_source_id":10015,"parent_id":10013,"name":"活动现场","name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;活动现场"},{"clue_source_id":10016,"parent_id":10013,"name":"领导指派","name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;领导指派"},{"clue_source_id":10022,"parent_id":10013,"name":"装修渠道","name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;装修渠道"},{"clue_source_id":10025,"parent_id":0,"name":"项目相关方","name_h1":"项目相关方"},{"clue_source_id":10028,"parent_id":0,"name":"自主开发","name_h1":"自主开发"},{"clue_source_id":10029,"parent_id":0,"name":"同行推荐","name_h1":"同行推荐"}],"statusList":[{"clue_status_id":10012,"name":"无意向客户","must_plan_follow_time":0},{"clue_status_id":10014,"name":"一般意向度","must_plan_follow_time":1},{"clue_status_id":10013,"name":"高意向度","must_plan_follow_time":1},{"clue_status_id":10020,"name":"已上门","must_plan_follow_time":1},{"clue_status_id":10021,"name":"已交定金","must_plan_follow_time":1},{"clue_status_id":10018,"name":"新增签约客户","must_plan_follow_time":0},{"clue_status_id":10022,"name":"施工中","must_plan_follow_time":1},{"clue_status_id":10023,"name":"合同完成","must_plan_follow_time":0},{"clue_status_id":10024,"name":"其他咨询","must_plan_follow_time":1},{"clue_status_id":10025,"name":"老客户录入","must_plan_follow_time":1},{"clue_status_id":10026,"name":"项目需要","must_plan_follow_time":0},{"clue_status_id":10027,"name":"项目内追踪","must_plan_follow_time":0},{"clue_status_id":10028,"name":"公司员工","must_plan_follow_time":0},{"clue_status_id":10029,"name":"已上门无意向","must_plan_follow_time":0}],"roleList":[{"clue_role_id":10008,"name":"普通人"},{"clue_role_id":10009,"name":"决策人"},{"clue_role_id":10010,"name":"分项决策人"},{"clue_role_id":10011,"name":"商务决策"},{"clue_role_id":10012,"name":"财务决策"},{"clue_role_id":10013,"name":"使用人"},{"clue_role_id":10014,"name":"意见影响人"}],"followTypeList":[{"follow_type_id":10008,"name":"到访"},{"follow_type_id":10009,"name":"电话"},{"follow_type_id":10010,"name":"微信"},{"follow_type_id":10011,"name":"短信"},{"follow_type_id":10012,"name":"邮件"},{"follow_type_id":10013,"name":"QQ"},{"follow_type_id":10014,"name":"其他"}]}
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
        private List<SourceListBean> sourceList;
        private List<StatusListBean> statusList;
        private List<RoleListBean> roleList;
        private List<FollowTypeListBean> followTypeList;

        public List<SourceListBean> getSourceList() {
            return sourceList;
        }

        public void setSourceList(List<SourceListBean> sourceList) {
            this.sourceList = sourceList;
        }

        public List<StatusListBean> getStatusList() {
            return statusList;
        }

        public void setStatusList(List<StatusListBean> statusList) {
            this.statusList = statusList;
        }

        public List<RoleListBean> getRoleList() {
            return roleList;
        }

        public void setRoleList(List<RoleListBean> roleList) {
            this.roleList = roleList;
        }

        public List<FollowTypeListBean> getFollowTypeList() {
            return followTypeList;
        }

        public void setFollowTypeList(List<FollowTypeListBean> followTypeList) {
            this.followTypeList = followTypeList;
        }

        public static class SourceListBean {
            /**
             * clue_source_id : 10019
             * parent_id : 0
             * name : SEM-云推广
             * name_h1 : SEM-云推广
             */

            private int clue_source_id;
            private int parent_id;
            private String name;
            private String name_h1;

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

            public String getName_h1() {
                return name_h1;
            }

            public void setName_h1(String name_h1) {
                this.name_h1 = name_h1;
            }
        }

        public static class StatusListBean {
            /**
             * clue_status_id : 10012
             * name : 无意向客户
             * must_plan_follow_time : 0
             */

            private int clue_status_id;
            private String name;
            private int must_plan_follow_time;

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

            public int getMust_plan_follow_time() {
                return must_plan_follow_time;
            }

            public void setMust_plan_follow_time(int must_plan_follow_time) {
                this.must_plan_follow_time = must_plan_follow_time;
            }
        }

        public static class RoleListBean {
            /**
             * clue_role_id : 10008
             * name : 普通人
             */

            private int clue_role_id;
            private String name;

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
        }

        public static class FollowTypeListBean {
            /**
             * follow_type_id : 10008
             * name : 到访
             */

            private int follow_type_id;
            private String name;

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
        }
    }
}
