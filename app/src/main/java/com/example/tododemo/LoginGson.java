package com.example.tododemo;

public class LoginGson {
    /**
     * logged_in_user : {"can_see_organic_insights":false,"nametag":{"mode":1,"gradient":0,"emoji":"😀","selfie_sticker":0},"show_insights_terms":false,"has_anonymous_profile_picture":false,"profile_pic_id":"1791350204417218003_7905154115","profile_pic_url":"https://scontent-nrt1-1.cdninstagram.com/vp/6be7e7bba681ee7fe65a10056fcb999f/5BA512B7/t51.2885-19/s150x150/33307507_571231933262572_470814151778762752_n.jpg","username":"billyson007","can_boost_post":false,"full_name":"Billyson007","reel_auto_archive":"unset","pk":1529929095651,"allowed_commenter_type":"any","allow_contacts_sync":true,"phone_number":"+8618876129472","country_code":86,"national_number":18876129472,"_business":false,"_private":false,"_verified":false}
     * status : ok
     */

    private LoggedInUserBean logged_in_user;
    private String status;

    public LoggedInUserBean getLogged_in_user() {
        return logged_in_user;
    }

    public void setLogged_in_user(LoggedInUserBean logged_in_user) {
        this.logged_in_user = logged_in_user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class LoggedInUserBean {
        /**
         * can_see_organic_insights : false
         * nametag : {"mode":1,"gradient":0,"emoji":"😀","selfie_sticker":0}
         * show_insights_terms : false
         * has_anonymous_profile_picture : false
         * profile_pic_id : 1791350204417218003_7905154115
         * profile_pic_url : https://scontent-nrt1-1.cdninstagram.com/vp/6be7e7bba681ee7fe65a10056fcb999f/5BA512B7/t51.2885-19/s150x150/33307507_571231933262572_470814151778762752_n.jpg
         * username : billyson007
         * can_boost_post : false
         * full_name : Billyson007
         * reel_auto_archive : unset
         * pk : 1529929095651
         * allowed_commenter_type : any
         * allow_contacts_sync : true
         * phone_number : +8618876129472
         * country_code : 86
         * national_number : 18876129472
         * _business : false
         * _private : false
         * _verified : false
         */

        private boolean can_see_organic_insights;
        private NametagBean nametag;
        private boolean show_insights_terms;
        private boolean has_anonymous_profile_picture;
        private String profile_pic_id;
        private String profile_pic_url;
        private String username;
        private boolean can_boost_post;
        private String full_name;
        private String reel_auto_archive;
        private long pk;
        private String allowed_commenter_type;
        private boolean allow_contacts_sync;
        private String phone_number;
        private int country_code;
        private long national_number;
        private boolean _business;
        private boolean _private;
        private boolean _verified;

        public boolean isCan_see_organic_insights() {
            return can_see_organic_insights;
        }

        public void setCan_see_organic_insights(boolean can_see_organic_insights) {
            this.can_see_organic_insights = can_see_organic_insights;
        }

        public NametagBean getNametag() {
            return nametag;
        }

        public void setNametag(NametagBean nametag) {
            this.nametag = nametag;
        }

        public boolean isShow_insights_terms() {
            return show_insights_terms;
        }

        public void setShow_insights_terms(boolean show_insights_terms) {
            this.show_insights_terms = show_insights_terms;
        }

        public boolean isHas_anonymous_profile_picture() {
            return has_anonymous_profile_picture;
        }

        public void setHas_anonymous_profile_picture(boolean has_anonymous_profile_picture) {
            this.has_anonymous_profile_picture = has_anonymous_profile_picture;
        }

        public String getProfile_pic_id() {
            return profile_pic_id;
        }

        public void setProfile_pic_id(String profile_pic_id) {
            this.profile_pic_id = profile_pic_id;
        }

        public String getProfile_pic_url() {
            return profile_pic_url;
        }

        public void setProfile_pic_url(String profile_pic_url) {
            this.profile_pic_url = profile_pic_url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public boolean isCan_boost_post() {
            return can_boost_post;
        }

        public void setCan_boost_post(boolean can_boost_post) {
            this.can_boost_post = can_boost_post;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public String getReel_auto_archive() {
            return reel_auto_archive;
        }

        public void setReel_auto_archive(String reel_auto_archive) {
            this.reel_auto_archive = reel_auto_archive;
        }

        public long getPk() {
            return pk;
        }

        public void setPk(long pk) {
            this.pk = pk;
        }

        public String getAllowed_commenter_type() {
            return allowed_commenter_type;
        }

        public void setAllowed_commenter_type(String allowed_commenter_type) {
            this.allowed_commenter_type = allowed_commenter_type;
        }

        public boolean isAllow_contacts_sync() {
            return allow_contacts_sync;
        }

        public void setAllow_contacts_sync(boolean allow_contacts_sync) {
            this.allow_contacts_sync = allow_contacts_sync;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }

        public int getCountry_code() {
            return country_code;
        }

        public void setCountry_code(int country_code) {
            this.country_code = country_code;
        }

        public long getNational_number() {
            return national_number;
        }

        public void setNational_number(long national_number) {
            this.national_number = national_number;
        }

        public boolean is_business() {
            return _business;
        }

        public void set_business(boolean _business) {
            this._business = _business;
        }

        public boolean is_private() {
            return _private;
        }

        public void set_private(boolean _private) {
            this._private = _private;
        }

        public boolean is_verified() {
            return _verified;
        }

        public void set_verified(boolean _verified) {
            this._verified = _verified;
        }

        public static class NametagBean {
            /**
             * mode : 1
             * gradient : 0
             * emoji : 😀
             * selfie_sticker : 0
             */

            private int mode;
            private int gradient;
            private String emoji;
            private int selfie_sticker;

            public int getMode() {
                return mode;
            }

            public void setMode(int mode) {
                this.mode = mode;
            }

            public int getGradient() {
                return gradient;
            }

            public void setGradient(int gradient) {
                this.gradient = gradient;
            }

            public String getEmoji() {
                return emoji;
            }

            public void setEmoji(String emoji) {
                this.emoji = emoji;
            }

            public int getSelfie_sticker() {
                return selfie_sticker;
            }

            public void setSelfie_sticker(int selfie_sticker) {
                this.selfie_sticker = selfie_sticker;
            }
        }
    }
}
