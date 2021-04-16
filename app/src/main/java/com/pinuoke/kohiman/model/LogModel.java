package com.pinuoke.kohiman.model;

import java.util.List;

public class LogModel {
    /**
     * code : 1
     * msg : success
     * data : {"list":{"total":7,"per_page":1,"current_page":1,"last_page":7,"data":[{"follow_id":25515,"client_id":0,"prev_clue_status_id":10021,"client_status_id":0,"client_name":"","clue_id":14556,"clue_status_id":10022,"clue_name":"夏先生","follow_type_id":10008,"content":"撒地方撒地方是的分","user_id":10080,"now_user_id":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 18:09:52","time":"18:09:52","text":"跟进客户夏先生，客户意向由已交定金转为施工中","follow_type":{"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"},"client":null}]}}
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

    public static class DataBeanX {
        /**
         * list : {"total":7,"per_page":1,"current_page":1,"last_page":7,"data":[{"follow_id":25515,"client_id":0,"prev_clue_status_id":10021,"client_status_id":0,"client_name":"","clue_id":14556,"clue_status_id":10022,"clue_name":"夏先生","follow_type_id":10008,"content":"撒地方撒地方是的分","user_id":10080,"now_user_id":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 18:09:52","time":"18:09:52","text":"跟进客户夏先生，客户意向由已交定金转为施工中","follow_type":{"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"},"client":null}]}
         */

        private ListBean list;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * total : 7
             * per_page : 1
             * current_page : 1
             * last_page : 7
             * data : [{"follow_id":25515,"client_id":0,"prev_clue_status_id":10021,"client_status_id":0,"client_name":"","clue_id":14556,"clue_status_id":10022,"clue_name":"夏先生","follow_type_id":10008,"content":"撒地方撒地方是的分","user_id":10080,"now_user_id":0,"enterprise_id":10002,"is_delete":0,"create_time":"2021-04-14 18:09:52","time":"18:09:52","text":"跟进客户夏先生，客户意向由已交定金转为施工中","follow_type":{"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"},"client":null}]
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

            public static class DataBean {
                /**
                 * follow_id : 25515
                 * client_id : 0
                 * prev_clue_status_id : 10021
                 * client_status_id : 0
                 * client_name :
                 * clue_id : 14556
                 * clue_status_id : 10022
                 * clue_name : 夏先生
                 * follow_type_id : 10008
                 * content : 撒地方撒地方是的分
                 * user_id : 10080
                 * now_user_id : 0
                 * enterprise_id : 10002
                 * is_delete : 0
                 * create_time : 2021-04-14 18:09:52
                 * time : 18:09:52
                 * text : 跟进客户夏先生，客户意向由已交定金转为施工中
                 * follow_type : {"follow_type_id":10008,"name":"到访","enterprise_id":10002,"sort":100,"status":0,"is_delete":0,"create_time":"2020-02-07 16:22:13","update_time":"2020-02-07 16:22:13"}
                 * client : null
                 */

                private int follow_id;
                private int client_id;
                private int prev_clue_status_id;
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
                private String time;
                private String text;
                private FollowTypeBean follow_type;
                private Object client;

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

                public int getPrev_clue_status_id() {
                    return prev_clue_status_id;
                }

                public void setPrev_clue_status_id(int prev_clue_status_id) {
                    this.prev_clue_status_id = prev_clue_status_id;
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

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
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
}
