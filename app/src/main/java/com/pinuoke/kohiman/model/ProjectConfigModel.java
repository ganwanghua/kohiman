package com.pinuoke.kohiman.model;

import java.util.List;

public class ProjectConfigModel {


    /**
     * code : 1
     * msg : success
     * data : {"statusList":[{"project_status_id":10007,"name":"施工阶段"},{"project_status_id":10008,"name":"商务洽谈"},{"project_status_id":10009,"name":"合同履约"},{"project_status_id":10010,"name":"售后维保"},{"project_status_id":10011,"name":"方案比较"},{"project_status_id":10012,"name":"调试验收"},{"project_status_id":10013,"name":"项目招标"},{"project_status_id":10014,"name":"项目投标"},{"project_status_id":10015,"name":"项目中标"},{"project_status_id":10016,"name":"项目丢失"},{"project_status_id":10017,"name":"前期接洽"},{"project_status_id":10018,"name":"项目完成"}],"categoryList":[{"category_id":10011,"parent_id":0,"name":"工程项目","enterprise_id":10002,"sort":1,"is_delete":0,"create_time":"2020-03-23 16:59:04","update_time":"2020-03-23 16:59:04","child":[{"category_id":10019,"parent_id":10011,"name":"山西煤炭运销集团泰山隆安煤业有限公司","enterprise_id":10002,"sort":10,"is_delete":0,"create_time":"2021-03-27 19:04:31","update_time":"2021-03-27 19:04:31"},{"category_id":10023,"parent_id":10011,"name":"忻州厂房9000平办公楼+厂房供暖方案递交。持续跟进。","enterprise_id":10002,"sort":80,"is_delete":0,"create_time":"2021-03-31 17:16:09","update_time":"2021-03-31 17:16:09"},{"category_id":10018,"parent_id":10011,"name":"上德花园","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-03-24 07:13:38","update_time":"2021-03-24 07:13:38"},{"category_id":10021,"parent_id":10011,"name":"商业","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-03-31 17:07:48","update_time":"2021-03-31 17:07:48"},{"category_id":10022,"parent_id":10011,"name":"长治市屯留县曲总跟进7000平养殖场。方案报价已做。持续跟进。","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-03-31 17:14:21","update_time":"2021-03-31 17:14:21"}]},{"category_id":10006,"parent_id":0,"name":"地产项目","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2020-02-25 19:56:10","update_time":"2020-02-25 19:56:10"},{"category_id":10014,"parent_id":0,"name":"电梯消杀","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2020-08-18 11:40:53","update_time":"2020-08-18 11:40:53"},{"category_id":10015,"parent_id":0,"name":"污泥烘干","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-01-25 17:01:02","update_time":"2021-01-25 17:01:02"}],"clientRoleList":[{"clue_role_id":10008,"name":"普通人"},{"clue_role_id":10009,"name":"决策人"},{"clue_role_id":10010,"name":"分项决策人"},{"clue_role_id":10011,"name":"商务决策"},{"clue_role_id":10012,"name":"财务决策"},{"clue_role_id":10013,"name":"使用人"},{"clue_role_id":10014,"name":"意见影响人"}],"followTypeList":[{"follow_type_id":10008,"name":"到访"},{"follow_type_id":10009,"name":"电话"},{"follow_type_id":10010,"name":"微信"},{"follow_type_id":10011,"name":"短信"},{"follow_type_id":10012,"name":"邮件"},{"follow_type_id":10013,"name":"QQ"},{"follow_type_id":10014,"name":"其他"}],"departmentList":[{"department_id":10005,"parent_id":0,"name":"市场部","deep":1,"name_h1":"市场部"},{"department_id":10011,"parent_id":0,"name":"直营系统","deep":1,"name_h1":"直营系统"},{"department_id":10012,"parent_id":10011,"name":"合肥旗舰店","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;合肥旗舰店"},{"department_id":10013,"parent_id":0,"name":"营销中心","deep":1,"name_h1":"营销中心"},{"department_id":10008,"parent_id":10013,"name":"渠道一部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;渠道一部"},{"department_id":10009,"parent_id":10013,"name":"大客户三部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;大客户三部"},{"department_id":10010,"parent_id":10013,"name":"战略客户一部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;战略客户一部"},{"department_id":10015,"parent_id":10013,"name":"招商事业部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;招商事业部"},{"department_id":10025,"parent_id":10013,"name":"战略客户二部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;战略客户二部"},{"department_id":10026,"parent_id":10013,"name":"渠道二部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;渠道二部"},{"department_id":10027,"parent_id":10013,"name":"渠道三部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;渠道三部"},{"department_id":10028,"parent_id":10013,"name":"大客户二部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;大客户二部"},{"department_id":10029,"parent_id":10013,"name":"大客户一部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;大客户一部"},{"department_id":10030,"parent_id":10013,"name":"战略客户三部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;战略客户三部"},{"department_id":10031,"parent_id":10013,"name":"战略客户四部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;战略客户四部"},{"department_id":10033,"parent_id":10013,"name":"战略客户五部","deep":2,"name_h1":"&nbsp;&nbsp;&nbsp;├ &nbsp;战略客户五部"},{"department_id":10014,"parent_id":0,"name":"售后部","deep":1,"name_h1":"售后部"},{"department_id":10023,"parent_id":0,"name":"人力资源","deep":1,"name_h1":"人力资源"},{"department_id":10024,"parent_id":0,"name":"烘干事业部","deep":1,"name_h1":"烘干事业部"}],"userList":[{"user_id":10083,"user_name":"apptest3","parent_user_id":0,"position_id":10007,"real_name":"测试3","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10082,"user_name":"apptest2","parent_user_id":0,"position_id":10007,"real_name":"测试2","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10081,"user_name":"apptest","parent_user_id":0,"position_id":10007,"real_name":"测试","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10080,"user_name":"sq","parent_user_id":0,"position_id":10007,"real_name":"测试销售","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10079,"user_name":"taosheng","parent_user_id":0,"position_id":10007,"real_name":"陶胜","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10078,"user_name":"yanggen","parent_user_id":0,"position_id":10005,"real_name":"杨根","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10077,"user_name":"chenjiong","parent_user_id":0,"position_id":10005,"real_name":"陈炯","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10076,"user_name":"yangshijun","parent_user_id":0,"position_id":10005,"real_name":"杨世军","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10075,"user_name":"jiaoguochang","parent_user_id":0,"position_id":10007,"real_name":"焦国昌","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10074,"user_name":"陈天胜","parent_user_id":0,"position_id":10007,"real_name":"陈天胜","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10073,"user_name":"wangqi","parent_user_id":0,"position_id":10007,"real_name":"王琦","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10072,"user_name":"quanweijiang","parent_user_id":0,"position_id":10005,"real_name":"权维疆","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10071,"user_name":"lixinghong","parent_user_id":0,"position_id":10007,"real_name":"李星宏","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10070,"user_name":"cuizhengkai","parent_user_id":0,"position_id":10007,"real_name":"崔政凯","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10069,"user_name":"zhangfajie","parent_user_id":0,"position_id":10005,"real_name":"张发杰","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10068,"user_name":"dengli","parent_user_id":0,"position_id":10007,"real_name":"邓力","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10066,"user_name":"songlei","parent_user_id":0,"position_id":10005,"real_name":"宋蕾","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10065,"user_name":"weixiangling","parent_user_id":0,"position_id":10007,"real_name":"韦湘玲","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10062,"user_name":"chenya","parent_user_id":0,"position_id":10007,"real_name":"陈亚","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10061,"user_name":"tangchenying","parent_user_id":0,"position_id":10007,"real_name":"唐陈英","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10057,"user_name":"gaodebiao","parent_user_id":0,"position_id":10007,"real_name":"高德彪","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10054,"user_name":"fengyi","parent_user_id":0,"position_id":10005,"real_name":"冯毅","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10053,"user_name":"chengjieyu","parent_user_id":0,"position_id":10007,"real_name":"程杰宇","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10049,"user_name":"xiongyue","parent_user_id":0,"position_id":10005,"real_name":"熊跃","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10047,"user_name":"chaihongliang","parent_user_id":0,"position_id":10007,"real_name":"柴红亮","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10032,"user_name":"jianghong","parent_user_id":0,"position_id":10007,"real_name":"江红","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10029,"user_name":"褚飞祥","parent_user_id":0,"position_id":10007,"real_name":"褚飞祥","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10024,"user_name":"chenglei","parent_user_id":0,"position_id":10005,"real_name":"程磊","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10022,"user_name":"qiangyabo","parent_user_id":0,"position_id":10007,"real_name":"强亚波","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10021,"user_name":"chenjurong1","parent_user_id":0,"position_id":10007,"real_name":"陈桔荣","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10019,"user_name":"钱婷婷","parent_user_id":0,"position_id":10007,"real_name":"钱婷婷","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10017,"user_name":"yangdejun","parent_user_id":0,"position_id":10005,"real_name":"杨德俊","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10016,"user_name":"tianjilong","parent_user_id":0,"position_id":10007,"real_name":"田继龙","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10013,"user_name":"sundongliang","parent_user_id":0,"position_id":10007,"real_name":"孙东亮","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10011,"user_name":"zhangdongxu","parent_user_id":0,"position_id":10005,"real_name":"张东旭","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10010,"user_name":"zhuerjia","parent_user_id":10004,"position_id":10005,"real_name":"朱尔佳","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10009,"user_name":"zhalihua","parent_user_id":10004,"position_id":10005,"real_name":"查丽华","position":{"position_id":10005,"name":"部门负责人"}},{"user_id":10007,"user_name":"caojingru","parent_user_id":10005,"position_id":10007,"real_name":"曹静茹","position":{"position_id":10007,"name":"部门员工"}},{"user_id":10006,"user_name":"sunwenlian","parent_user_id":10004,"position_id":10005,"real_name":"孙文连","position":{"position_id":10005,"name":"部门负责人"}}]}
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
        private List<StatusListBean> statusList;
        private List<CategoryListBean> categoryList;
        private List<ClientRoleListBean> clientRoleList;
        private List<FollowTypeListBean> followTypeList;
        private List<DepartmentListBean> departmentList;
        private List<UserListBean> userList;

        public List<StatusListBean> getStatusList() {
            return statusList;
        }

        public void setStatusList(List<StatusListBean> statusList) {
            this.statusList = statusList;
        }

        public List<CategoryListBean> getCategoryList() {
            return categoryList;
        }

        public void setCategoryList(List<CategoryListBean> categoryList) {
            this.categoryList = categoryList;
        }

        public List<ClientRoleListBean> getClientRoleList() {
            return clientRoleList;
        }

        public void setClientRoleList(List<ClientRoleListBean> clientRoleList) {
            this.clientRoleList = clientRoleList;
        }

        public List<FollowTypeListBean> getFollowTypeList() {
            return followTypeList;
        }

        public void setFollowTypeList(List<FollowTypeListBean> followTypeList) {
            this.followTypeList = followTypeList;
        }

        public List<DepartmentListBean> getDepartmentList() {
            return departmentList;
        }

        public void setDepartmentList(List<DepartmentListBean> departmentList) {
            this.departmentList = departmentList;
        }

        public List<UserListBean> getUserList() {
            return userList;
        }

        public void setUserList(List<UserListBean> userList) {
            this.userList = userList;
        }

        public static class StatusListBean {
            /**
             * project_status_id : 10007
             * name : 施工阶段
             */

            private int project_status_id;
            private String name;

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
        }

        public static class CategoryListBean {
            /**
             * category_id : 10011
             * parent_id : 0
             * name : 工程项目
             * enterprise_id : 10002
             * sort : 1
             * is_delete : 0
             * create_time : 2020-03-23 16:59:04
             * update_time : 2020-03-23 16:59:04
             * child : [{"category_id":10019,"parent_id":10011,"name":"山西煤炭运销集团泰山隆安煤业有限公司","enterprise_id":10002,"sort":10,"is_delete":0,"create_time":"2021-03-27 19:04:31","update_time":"2021-03-27 19:04:31"},{"category_id":10023,"parent_id":10011,"name":"忻州厂房9000平办公楼+厂房供暖方案递交。持续跟进。","enterprise_id":10002,"sort":80,"is_delete":0,"create_time":"2021-03-31 17:16:09","update_time":"2021-03-31 17:16:09"},{"category_id":10018,"parent_id":10011,"name":"上德花园","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-03-24 07:13:38","update_time":"2021-03-24 07:13:38"},{"category_id":10021,"parent_id":10011,"name":"商业","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-03-31 17:07:48","update_time":"2021-03-31 17:07:48"},{"category_id":10022,"parent_id":10011,"name":"长治市屯留县曲总跟进7000平养殖场。方案报价已做。持续跟进。","enterprise_id":10002,"sort":100,"is_delete":0,"create_time":"2021-03-31 17:14:21","update_time":"2021-03-31 17:14:21"}]
             */

            private int category_id;
            private int parent_id;
            private String name;
            private int enterprise_id;
            private int sort;
            private int is_delete;
            private String create_time;
            private String update_time;
            private List<ChildBean> child;

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

            public List<ChildBean> getChild() {
                return child;
            }

            public void setChild(List<ChildBean> child) {
                this.child = child;
            }

            public static class ChildBean {
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
        }

        public static class ClientRoleListBean {
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

        public static class DepartmentListBean {
            /**
             * department_id : 10005
             * parent_id : 0
             * name : 市场部
             * deep : 1
             * name_h1 : 市场部
             */

            private int department_id;
            private int parent_id;
            private String name;
            private int deep;
            private String name_h1;

            public int getDepartment_id() {
                return department_id;
            }

            public void setDepartment_id(int department_id) {
                this.department_id = department_id;
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

            public int getDeep() {
                return deep;
            }

            public void setDeep(int deep) {
                this.deep = deep;
            }

            public String getName_h1() {
                return name_h1;
            }

            public void setName_h1(String name_h1) {
                this.name_h1 = name_h1;
            }
        }

        public static class UserListBean {
            /**
             * user_id : 10083
             * user_name : apptest3
             * parent_user_id : 0
             * position_id : 10007
             * real_name : 测试3
             * position : {"position_id":10007,"name":"部门员工"}
             */

            private int user_id;
            private String user_name;
            private int parent_user_id;
            private int position_id;
            private String real_name;
            private PositionBean position;

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

            public int getParent_user_id() {
                return parent_user_id;
            }

            public void setParent_user_id(int parent_user_id) {
                this.parent_user_id = parent_user_id;
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

            public PositionBean getPosition() {
                return position;
            }

            public void setPosition(PositionBean position) {
                this.position = position;
            }

            public static class PositionBean {
                /**
                 * position_id : 10007
                 * name : 部门员工
                 */

                private int position_id;
                private String name;

                public int getPosition_id() {
                    return position_id;
                }

                public void setPosition_id(int position_id) {
                    this.position_id = position_id;
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
}
