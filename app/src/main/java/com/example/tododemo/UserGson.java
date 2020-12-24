package com.example.tododemo;

import java.util.List;

public class UserGson {
    /**
     * users : [{"pk":173560420,"has_anonymous_profile_picture":false,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/67310557_649773548849427_4130659181743046656_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=wdhdQEm_1YQAX8HD7z5&oh=3bea0ad5306cb63c1066b0e097807f46&oe=5F478CD3","latest_reel_media":1595883241,"is_favorite":false,"full_name":"Cristiano Ronaldo","is_private":false,"username":"cristiano","is_verified":true,"profile_pic_id":"2111818646398662315_173560420","account_badges":[]},{"account_badges":[],"is_favorite":false,"is_private":false,"latest_reel_media":0,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/26155970_1584552474997482_4541081815552622592_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=H2m-4Gwgv8oAX9XKOqn&oh=6dc7f13d49859eecafb07beb7459c17d&oe=5F499E4E","username":"nike","profile_pic_id":"1693695260376644961_13460080","pk":13460080,"has_anonymous_profile_picture":false,"full_name":"Nike","is_verified":true},{"latest_reel_media":0,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/47691396_2012173612205008_1777523355625193472_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=Ae6T5dM5zxoAX8rUOf_&oh=c1aa112703323102053902c81817cfac&oe=5F4B0B59","username":"goodmorningamerica","account_badges":[],"full_name":"Good Morning America","is_favorite":false,"is_verified":true,"pk":5812210,"has_anonymous_profile_picture":false,"profile_pic_id":"1947527922883451759_5812210","is_private":false},{"latest_reel_media":0,"full_name":"Michelle Obama","profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/72485179_789888494786634_1332143265733935104_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=YAcjA_vVz5IAX_LQv-Y&oh=daeba1eaa5e9d10a6867900e6d2442f8&oe=5F4A3892","username":"michelleobama","account_badges":[],"has_anonymous_profile_picture":false,"is_verified":true,"pk":4302013048,"is_favorite":false,"profile_pic_id":"2172677019501019379_4302013048","is_private":false},{"is_favorite":false,"has_anonymous_profile_picture":false,"full_name":"Will Smith","profile_pic_id":"1989504739259229163_3132929984","is_private":false,"latest_reel_media":0,"username":"willsmith","pk":3132929984,"is_verified":true,"account_badges":[],"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/53705764_2304835803071421_4142165059826614272_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=gdyWsahahboAX-3EOww&oh=675c6687aa51f6e5bcb7e709874a82b3&oe=5F49C68B"},{"username":"selenagomez","has_anonymous_profile_picture":false,"latest_reel_media":1595874166,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/80812750_2461415647505687_1090722136118525952_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=1osRfn-DWXMAX__8de3&oh=f8afc831df1282baff2727776108a0c9&oe=5F4B14AC","pk":460563723,"account_badges":[],"full_name":"Selena Gomez","is_private":false,"is_favorite":false,"is_verified":true,"profile_pic_id":"2218071391462087482_460563723"},{"is_favorite":false,"profile_pic_id":"2283065959439113858_305701719","has_anonymous_profile_picture":false,"is_private":false,"username":"jlo","latest_reel_media":1595912561,"full_name":"Jennifer Lopez","pk":305701719,"is_verified":true,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/92346759_3432646253417743_7236500683753521152_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=tUkKkMgEahMAX_j-QN0&oh=10471b8d0eac8a69c836e06e4ac03672&oe=5F479306","account_badges":[]},{"latest_reel_media":1595919558,"is_favorite":false,"account_badges":[],"is_private":false,"username":"justinbieber","profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/115887295_756009148479955_1105732211492834314_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=edv3pNvd4t4AX_-MAd1&oh=10eb61670897c1199e491743cbc4b241&oe=5F4A6AD8","full_name":"Justin Bieber","has_anonymous_profile_picture":false,"profile_pic_id":"2362948291183702309_6860189","is_verified":true,"pk":6860189},{"username":"natgeo","is_favorite":false,"account_badges":[],"has_anonymous_profile_picture":false,"profile_pic_id":"2293881278577865907_787132","latest_reel_media":0,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/95140556_594026277870211_4156802974091313152_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=DiivYJ-xpMIAX99mH-R&oh=011454a76a6c637ac4c0ce40233ad3f7&oe=5F4970E4","is_private":false,"is_verified":true,"pk":787132,"full_name":"National Geographic"},{"pk":208560325,"latest_reel_media":1595908221,"has_anonymous_profile_picture":false,"profile_pic_id":"2343333110990804875_208560325","is_private":false,"is_favorite":false,"username":"khloekardashian","profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/106072215_955567881560070_4568816041504047214_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=oLGe9iil8VMAX-4_Qic&oh=99df8140b41484d53c42c34c8faa5007&oe=5F47FF37","full_name":"Khloé","account_badges":[],"is_verified":true},{"is_verified":true,"profile_pic_id":"2339529524285191659_18918467","username":"theellenshow","is_favorite":false,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/106107485_767043264066461_7276751985929746474_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=ptTA8ZFlaYwAX_NF4pV&oh=e9db22516cd40eb35fdfaf33e5fca2c9&oe=5F4A59EB","account_badges":[],"latest_reel_media":1595886649,"has_anonymous_profile_picture":false,"pk":18918467,"is_private":false,"full_name":"Ellen DeGeneres"},{"pk":1118592796,"is_favorite":false,"username":"bonjour_beauty81","has_anonymous_profile_picture":false,"profile_pic_id":"2347393256143468734_1118592796","latest_reel_media":0,"profile_pic_url":"https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/74345485_274618017132905_4607523692676645057_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=YUw-V5-Uq0wAX9umEnD&oh=fd8f20f2ca87c9d6fe162b95f9390ff3&oe=5F4B53DF","is_private":false,"full_name":"Katie Jordan","account_badges":[],"is_verified":false}]
     * status : ok
     * big_list : false
     * sections :
     * next_max_id :
     * global_blacklist_sample :
     * page_size : 200
     */

    private String status;
    private boolean big_list;
    private String sections;
    private String next_max_id;
    private String global_blacklist_sample;
    private int page_size;
    private List<UsersBean> users;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBig_list() {
        return big_list;
    }

    public void setBig_list(boolean big_list) {
        this.big_list = big_list;
    }

    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }

    public String getNext_max_id() {
        return next_max_id;
    }

    public void setNext_max_id(String next_max_id) {
        this.next_max_id = next_max_id;
    }

    public String getGlobal_blacklist_sample() {
        return global_blacklist_sample;
    }

    public void setGlobal_blacklist_sample(String global_blacklist_sample) {
        this.global_blacklist_sample = global_blacklist_sample;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public List<UsersBean> getUsers() {
        return users;
    }

    public void setUsers(List<UsersBean> users) {
        this.users = users;
    }

    public static class UsersBean {
        /**
         * pk : 173560420
         * has_anonymous_profile_picture : false
         * profile_pic_url : https://scontent-hkg4-1.cdninstagram.com/v/t51.2885-19/s150x150/67310557_649773548849427_4130659181743046656_n.jpg?_nc_ht=scontent-hkg4-1.cdninstagram.com&_nc_ohc=wdhdQEm_1YQAX8HD7z5&oh=3bea0ad5306cb63c1066b0e097807f46&oe=5F478CD3
         * latest_reel_media : 1595883241
         * is_favorite : false
         * full_name : Cristiano Ronaldo
         * is_private : false
         * username : cristiano
         * is_verified : true
         * profile_pic_id : 2111818646398662315_173560420
         * account_badges : []
         */

        private int pk;
        private boolean has_anonymous_profile_picture;
        private String profile_pic_url;
        private int latest_reel_media;
        private boolean is_favorite;
        private String full_name;
        private boolean is_private;
        private String username;
        private boolean is_verified;
        private String profile_pic_id;
        private List<?> account_badges;

        public int getPk() {
            return pk;
        }

        public void setPk(int pk) {
            this.pk = pk;
        }

        public boolean isHas_anonymous_profile_picture() {
            return has_anonymous_profile_picture;
        }

        public void setHas_anonymous_profile_picture(boolean has_anonymous_profile_picture) {
            this.has_anonymous_profile_picture = has_anonymous_profile_picture;
        }

        public String getProfile_pic_url() {
            return profile_pic_url;
        }

        public void setProfile_pic_url(String profile_pic_url) {
            this.profile_pic_url = profile_pic_url;
        }

        public int getLatest_reel_media() {
            return latest_reel_media;
        }

        public void setLatest_reel_media(int latest_reel_media) {
            this.latest_reel_media = latest_reel_media;
        }

        public boolean isIs_favorite() {
            return is_favorite;
        }

        public void setIs_favorite(boolean is_favorite) {
            this.is_favorite = is_favorite;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public boolean isIs_private() {
            return is_private;
        }

        public void setIs_private(boolean is_private) {
            this.is_private = is_private;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public boolean isIs_verified() {
            return is_verified;
        }

        public void setIs_verified(boolean is_verified) {
            this.is_verified = is_verified;
        }

        public String getProfile_pic_id() {
            return profile_pic_id;
        }

        public void setProfile_pic_id(String profile_pic_id) {
            this.profile_pic_id = profile_pic_id;
        }

        public List<?> getAccount_badges() {
            return account_badges;
        }

        public void setAccount_badges(List<?> account_badges) {
            this.account_badges = account_badges;
        }
    }
}
