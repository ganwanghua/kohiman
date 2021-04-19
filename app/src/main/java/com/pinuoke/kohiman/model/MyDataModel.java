package com.pinuoke.kohiman.model;

import java.util.List;

public class MyDataModel {
    /**
     * code : 1
     * msg : success
     * data : {"my":{"total":10,"follow":4,"finish":1,"percent":10},"team":{"total":2029,"follow":1979,"finish":18,"percent":0.88,"user":[{"total":0,"follow":0,"finish":0,"percent":0,"name":"测试3","uid":10083},{"total":5,"follow":4,"finish":0,"percent":0,"name":"测试2","uid":10082},{"total":8,"follow":2,"finish":1,"percent":12.5,"name":"测试","uid":10081},{"total":2,"follow":2,"finish":0,"percent":0,"name":"测试销售","uid":10080},{"total":285,"follow":285,"finish":0,"percent":0,"name":"孙东亮","uid":10013},{"total":66,"follow":45,"finish":0,"percent":0,"name":"张东旭","uid":10011},{"total":682,"follow":666,"finish":15,"percent":2.19,"name":"曹静茹","uid":10007}]}}
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
         * my : {"total":10,"follow":4,"finish":1,"percent":10}
         * team : {"total":2029,"follow":1979,"finish":18,"percent":0.88,"user":[{"total":0,"follow":0,"finish":0,"percent":0,"name":"测试3","uid":10083},{"total":5,"follow":4,"finish":0,"percent":0,"name":"测试2","uid":10082},{"total":8,"follow":2,"finish":1,"percent":12.5,"name":"测试","uid":10081},{"total":2,"follow":2,"finish":0,"percent":0,"name":"测试销售","uid":10080},{"total":285,"follow":285,"finish":0,"percent":0,"name":"孙东亮","uid":10013},{"total":66,"follow":45,"finish":0,"percent":0,"name":"张东旭","uid":10011},{"total":682,"follow":666,"finish":15,"percent":2.19,"name":"曹静茹","uid":10007}]}
         */

        private MyBean my;
        private TeamBean team;

        public MyBean getMy() {
            return my;
        }

        public void setMy(MyBean my) {
            this.my = my;
        }

        public TeamBean getTeam() {
            return team;
        }

        public void setTeam(TeamBean team) {
            this.team = team;
        }

        public static class MyBean {
            /**
             * total : 10
             * follow : 4
             * finish : 1
             * percent : 10
             */

            private int total;
            private int follow;
            private int finish;
            private int percent;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int getFinish() {
                return finish;
            }

            public void setFinish(int finish) {
                this.finish = finish;
            }

            public int getPercent() {
                return percent;
            }

            public void setPercent(int percent) {
                this.percent = percent;
            }
        }

        public static class TeamBean {
            /**
             * total : 2029
             * follow : 1979
             * finish : 18
             * percent : 0.88
             * user : [{"total":0,"follow":0,"finish":0,"percent":0,"name":"测试3","uid":10083},{"total":5,"follow":4,"finish":0,"percent":0,"name":"测试2","uid":10082},{"total":8,"follow":2,"finish":1,"percent":12.5,"name":"测试","uid":10081},{"total":2,"follow":2,"finish":0,"percent":0,"name":"测试销售","uid":10080},{"total":285,"follow":285,"finish":0,"percent":0,"name":"孙东亮","uid":10013},{"total":66,"follow":45,"finish":0,"percent":0,"name":"张东旭","uid":10011},{"total":682,"follow":666,"finish":15,"percent":2.19,"name":"曹静茹","uid":10007}]
             */

            private int total;
            private int follow;
            private int finish;
            private double percent;
            private List<UserBean> user;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int getFinish() {
                return finish;
            }

            public void setFinish(int finish) {
                this.finish = finish;
            }

            public double getPercent() {
                return percent;
            }

            public void setPercent(double percent) {
                this.percent = percent;
            }

            public List<UserBean> getUser() {
                return user;
            }

            public void setUser(List<UserBean> user) {
                this.user = user;
            }

            public static class UserBean {
                /**
                 * total : 0
                 * follow : 0
                 * finish : 0
                 * percent : 0
                 * name : 测试3
                 * uid : 10083
                 */

                private int total;
                private int follow;
                private int finish;
                private double percent;
                private String name;
                private int uid;

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public int getFollow() {
                    return follow;
                }

                public void setFollow(int follow) {
                    this.follow = follow;
                }

                public int getFinish() {
                    return finish;
                }

                public void setFinish(int finish) {
                    this.finish = finish;
                }

                public double getPercent() {
                    return percent;
                }

                public void setPercent(double percent) {
                    this.percent = percent;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getUid() {
                    return uid;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }
            }
        }
    }
}
