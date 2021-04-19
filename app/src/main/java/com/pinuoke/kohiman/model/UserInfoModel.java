package com.pinuoke.kohiman.model;

public class UserInfoModel {
    /**
     * code : 1
     * msg : success
     * data : {"userInfo":{"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-16 17:36:39","is_super":0,"enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2021-04-13 14:16:13","update_time":"2021-04-16 17:36:39","enterprise":{"enterprise_id":10002,"name":"科希曼电器有限公司","intro":"科希曼","introduce":"&lt;p&gt;&lt;img src=&quot;http://scrm.vshop365.cn/uploads/20200801161312556324486.jpg&quot;/&gt;&lt;/p&gt;&lt;p style=&quot;text-indent: 43px&quot;&gt;&lt;br/&gt;&lt;/p&gt;","phone":"13388888888","type":{"value":10,"text":"私营企业"},"industry_id":10001,"province_id":1046,"city_id":1047,"region_id":1050,"detail":"中国合肥·国家高新产业园湖光西路888号","logo_id":10103,"link_name":"杜贤平","gender":1,"mobile":"13388888888","app_id":"","app_secret":"","is_recycle":0,"is_delete":0,"create_time":"2020-02-17 18:40:22","update_time":"2020-08-01 16:13:25","region":{"province":"安徽省","city":"合肥市","region":"蜀山区"}},"department":{"department_id":10005,"parent_id":0,"name":"市场部","level":1,"intro":"","enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2020-02-19 17:23:32","update_time":"2021-03-15 08:47:12"},"position":{"position_id":10007,"name":"部门员工","intro":"","enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2020-02-25 10:42:14","update_time":"2020-02-27 16:44:25"}}}
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
         * userInfo : {"user_id":10081,"user_name":"apptest","password":"5b3a14ece3100489c908a2c07cc7db06","parent_user_id":0,"department_id":10005,"position_id":10007,"real_name":"测试","avatar_url":"","gender":{"value":0,"text":"未知"},"mobile":"13333333333","birthday":0,"remark":"","last_login_time":"2021-04-16 17:36:39","is_super":0,"enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2021-04-13 14:16:13","update_time":"2021-04-16 17:36:39","enterprise":{"enterprise_id":10002,"name":"科希曼电器有限公司","intro":"科希曼","introduce":"&lt;p&gt;&lt;img src=&quot;http://scrm.vshop365.cn/uploads/20200801161312556324486.jpg&quot;/&gt;&lt;/p&gt;&lt;p style=&quot;text-indent: 43px&quot;&gt;&lt;br/&gt;&lt;/p&gt;","phone":"13388888888","type":{"value":10,"text":"私营企业"},"industry_id":10001,"province_id":1046,"city_id":1047,"region_id":1050,"detail":"中国合肥·国家高新产业园湖光西路888号","logo_id":10103,"link_name":"杜贤平","gender":1,"mobile":"13388888888","app_id":"","app_secret":"","is_recycle":0,"is_delete":0,"create_time":"2020-02-17 18:40:22","update_time":"2020-08-01 16:13:25","region":{"province":"安徽省","city":"合肥市","region":"蜀山区"}},"department":{"department_id":10005,"parent_id":0,"name":"市场部","level":1,"intro":"","enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2020-02-19 17:23:32","update_time":"2021-03-15 08:47:12"},"position":{"position_id":10007,"name":"部门员工","intro":"","enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2020-02-25 10:42:14","update_time":"2020-02-27 16:44:25"}}
         */

        private UserInfoBean userInfo;

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public static class UserInfoBean {
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
             * last_login_time : 2021-04-16 17:36:39
             * is_super : 0
             * enterprise_id : 10002
             * status : 1
             * is_delete : 0
             * create_time : 2021-04-13 14:16:13
             * update_time : 2021-04-16 17:36:39
             * enterprise : {"enterprise_id":10002,"name":"科希曼电器有限公司","intro":"科希曼","introduce":"&lt;p&gt;&lt;img src=&quot;http://scrm.vshop365.cn/uploads/20200801161312556324486.jpg&quot;/&gt;&lt;/p&gt;&lt;p style=&quot;text-indent: 43px&quot;&gt;&lt;br/&gt;&lt;/p&gt;","phone":"13388888888","type":{"value":10,"text":"私营企业"},"industry_id":10001,"province_id":1046,"city_id":1047,"region_id":1050,"detail":"中国合肥·国家高新产业园湖光西路888号","logo_id":10103,"link_name":"杜贤平","gender":1,"mobile":"13388888888","app_id":"","app_secret":"","is_recycle":0,"is_delete":0,"create_time":"2020-02-17 18:40:22","update_time":"2020-08-01 16:13:25","region":{"province":"安徽省","city":"合肥市","region":"蜀山区"}}
             * department : {"department_id":10005,"parent_id":0,"name":"市场部","level":1,"intro":"","enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2020-02-19 17:23:32","update_time":"2021-03-15 08:47:12"}
             * position : {"position_id":10007,"name":"部门员工","intro":"","enterprise_id":10002,"status":1,"is_delete":0,"create_time":"2020-02-25 10:42:14","update_time":"2020-02-27 16:44:25"}
             */

            private int user_id;
            private String user_name;
            private String password;
            private int parent_user_id;
            private int department_id;
            private int position_id;
            private String real_name;
            private String avatar_url;
            private GenderBean gender;
            private String mobile;
            private int birthday;
            private String remark;
            private String last_login_time;
            private int is_super;
            private int enterprise_id;
            private int status;
            private int is_delete;
            private String create_time;
            private String update_time;
            private EnterpriseBean enterprise;
            private DepartmentBean department;
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

            public GenderBean getGender() {
                return gender;
            }

            public void setGender(GenderBean gender) {
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

            public EnterpriseBean getEnterprise() {
                return enterprise;
            }

            public void setEnterprise(EnterpriseBean enterprise) {
                this.enterprise = enterprise;
            }

            public DepartmentBean getDepartment() {
                return department;
            }

            public void setDepartment(DepartmentBean department) {
                this.department = department;
            }

            public PositionBean getPosition() {
                return position;
            }

            public void setPosition(PositionBean position) {
                this.position = position;
            }

            public static class GenderBean {
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

            public static class EnterpriseBean {
                /**
                 * enterprise_id : 10002
                 * name : 科希曼电器有限公司
                 * intro : 科希曼
                 * introduce : &lt;p&gt;&lt;img src=&quot;http://scrm.vshop365.cn/uploads/20200801161312556324486.jpg&quot;/&gt;&lt;/p&gt;&lt;p style=&quot;text-indent: 43px&quot;&gt;&lt;br/&gt;&lt;/p&gt;
                 * phone : 13388888888
                 * type : {"value":10,"text":"私营企业"}
                 * industry_id : 10001
                 * province_id : 1046
                 * city_id : 1047
                 * region_id : 1050
                 * detail : 中国合肥·国家高新产业园湖光西路888号
                 * logo_id : 10103
                 * link_name : 杜贤平
                 * gender : 1
                 * mobile : 13388888888
                 * app_id :
                 * app_secret :
                 * is_recycle : 0
                 * is_delete : 0
                 * create_time : 2020-02-17 18:40:22
                 * update_time : 2020-08-01 16:13:25
                 * region : {"province":"安徽省","city":"合肥市","region":"蜀山区"}
                 */

                private int enterprise_id;
                private String name;
                private String intro;
                private String introduce;
                private String phone;
                private TypeBean type;
                private int industry_id;
                private int province_id;
                private int city_id;
                private int region_id;
                private String detail;
                private int logo_id;
                private String link_name;
                private int gender;
                private String mobile;
                private String app_id;
                private String app_secret;
                private int is_recycle;
                private int is_delete;
                private String create_time;
                private String update_time;
                private RegionBean region;

                public int getEnterprise_id() {
                    return enterprise_id;
                }

                public void setEnterprise_id(int enterprise_id) {
                    this.enterprise_id = enterprise_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getIntro() {
                    return intro;
                }

                public void setIntro(String intro) {
                    this.intro = intro;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public TypeBean getType() {
                    return type;
                }

                public void setType(TypeBean type) {
                    this.type = type;
                }

                public int getIndustry_id() {
                    return industry_id;
                }

                public void setIndustry_id(int industry_id) {
                    this.industry_id = industry_id;
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

                public int getLogo_id() {
                    return logo_id;
                }

                public void setLogo_id(int logo_id) {
                    this.logo_id = logo_id;
                }

                public String getLink_name() {
                    return link_name;
                }

                public void setLink_name(String link_name) {
                    this.link_name = link_name;
                }

                public int getGender() {
                    return gender;
                }

                public void setGender(int gender) {
                    this.gender = gender;
                }

                public String getMobile() {
                    return mobile;
                }

                public void setMobile(String mobile) {
                    this.mobile = mobile;
                }

                public String getApp_id() {
                    return app_id;
                }

                public void setApp_id(String app_id) {
                    this.app_id = app_id;
                }

                public String getApp_secret() {
                    return app_secret;
                }

                public void setApp_secret(String app_secret) {
                    this.app_secret = app_secret;
                }

                public int getIs_recycle() {
                    return is_recycle;
                }

                public void setIs_recycle(int is_recycle) {
                    this.is_recycle = is_recycle;
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

                public static class TypeBean {
                    /**
                     * value : 10
                     * text : 私营企业
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

            public static class DepartmentBean {
                /**
                 * department_id : 10005
                 * parent_id : 0
                 * name : 市场部
                 * level : 1
                 * intro :
                 * enterprise_id : 10002
                 * status : 1
                 * is_delete : 0
                 * create_time : 2020-02-19 17:23:32
                 * update_time : 2021-03-15 08:47:12
                 */

                private int department_id;
                private int parent_id;
                private String name;
                private int level;
                private String intro;
                private int enterprise_id;
                private int status;
                private int is_delete;
                private String create_time;
                private String update_time;

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

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getIntro() {
                    return intro;
                }

                public void setIntro(String intro) {
                    this.intro = intro;
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

            public static class PositionBean {
                /**
                 * position_id : 10007
                 * name : 部门员工
                 * intro :
                 * enterprise_id : 10002
                 * status : 1
                 * is_delete : 0
                 * create_time : 2020-02-25 10:42:14
                 * update_time : 2020-02-27 16:44:25
                 */

                private int position_id;
                private String name;
                private String intro;
                private int enterprise_id;
                private int status;
                private int is_delete;
                private String create_time;
                private String update_time;

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

                public String getIntro() {
                    return intro;
                }

                public void setIntro(String intro) {
                    this.intro = intro;
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
