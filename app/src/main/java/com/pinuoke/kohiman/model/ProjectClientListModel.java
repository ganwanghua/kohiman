package com.pinuoke.kohiman.model;

import java.io.Serializable;
import java.util.List;

public class ProjectClientListModel {

    /**
     * code : 1
     * msg : success
     * data : [{"clue_id":14742,"name":"11","phone":"13777777777","link_name":"11","region":{"province":"","city":"","region":""},"noFollowDays":"--"},{"clue_id":14741,"name":"测试","phone":"13555555555","link_name":"测试","region":{"province":"","city":"","region":""},"noFollowDays":"--"}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * clue_id : 14742
         * name : 11
         * phone : 13777777777
         * link_name : 11
         * region : {"province":"","city":"","region":""}
         * noFollowDays : --
         */

        private int clue_id;
        private String name;
        private String phone;
        private String link_name;
        private RegionBean region;
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

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getLink_name() {
            return link_name;
        }

        public void setLink_name(String link_name) {
            this.link_name = link_name;
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
