package me.joy.tiktokapi.request.api.getuserinfo;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-06-24
 */
public class UserInfoResponseData extends TTBaseResponseData {

  /**
   * status_code : 0
   * user : {"location":"","following_count":18,"follower_count":27,"total_favorited":2,"commerce_user_level":0,"room_id":0,"with_luban_entry":false,"is_blocked":false,"follow_status":2,"follower_status":1,"with_new_goods":false,"story_open":false,"original_musician":{"music_count":0,"music_used_count":0,"digg_count":0},"iso_country_code":"","activity":{"use_music_count":0,"digg_count":0},"province":"","relative_users":null,"nickname":"Locke Mong","aweme_count":2,"is_block":false,"geofencing":[],"gender":0,"weibo_schema":"","with_commerce_entry":false,"city":"","item_list":null,"uid":"6705973372813394949","sync_to_toutiao":0,"react_setting":0,"country":"","sec_uid":"MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk","verify_info":"","show_image_bubble":false,"dongtai_count":2,"enterprise_verify_reason":"","youtube_channel_title":"","new_story_cover":null,"ad_cover_url":null,"with_stick_entry":false,"comment_setting":0,"mplatform_followers_count":0,"ins_id":"","duet_setting":0,"reflow_page_gid":0,"video_icon_virtual_URI":"","weibo_verify":"","user_period":0,"favoriting_count":0,"followers_detail":[{"app_name":"aweme","name":"抖音","icon":"http://p3.pstatp.com/origin/50ec00079b64de2050dc","fans_count":0,"open_url":"snssdk1128://user/profile/0?","apple_id":"1142110895","download_url":"https://d.douyin.com/JsvN/","package_name":"com.ss.android.ugc.aweme"},{"package_name":"com.ss.android.article.news","app_name":"news_article","name":"头条","icon":"http://p3.pstatp.com/origin/50ed00079a1b6b8d1fb1","fans_count":0,"open_url":"snssdk143://profile?uid=0","apple_id":"529092160","download_url":"https://d.toutiao.com/YjjY/"},{"name":"火山","icon":"http://p3.pstatp.com/origin/551900041a7e00ec86ca","fans_count":0,"open_url":"snssdk1112://profile?id=0","apple_id":"1086047750","download_url":"http://d.huoshanzhibo.com/eFvB/","package_name":"com.ss.android.ugc.live","app_name":"live_stream"}],"special_lock":1,"has_activity_medal":false,"avatar_larger":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"avatar_thumb":{"uri":"","url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]},"is_effect_artist":false,"video_icon":{"uri":"","url_list":[]},"share_qrcode_uri":"","is_verified":false,"is_gov_media_vip":false,"constellation":0,"recommend_reason_relation":"","custom_verify":"","share_info":{"share_title_myself":"This musical.ly app is soooooo fun! Follow me @lockemong on musical.ly and check out my videos!","share_weibo_desc":"musical.ly: Global Video Community","share_title":"Join musical.ly and see what I've been up to!","share_qrcode_url":{"uri":"","url_list":[]},"bool_persist":1,"share_title_other":"This musical.ly user is really cool. Follow @lockemong on musical.ly and check out those amazing videos!","share_url":"https://m.tiktok.com/h5/share/usr/6705973372813394949.html?language=en&sec_uid=MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk&u_code=d7039ei40ijc9g","share_desc":"musical.ly: Global Video Community","share_image_url":{"uri":"tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d","url_list":["https://m-p16.akamaized.net/obj/tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d"]}},"verification_type":0,"avatar_uri":"","latest_order_time":0,"school_poi_id":"","secret":0,"reflow_page_uid":0,"avatar_168x168":{"uri":"","url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]},"avatar_300x300":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"unique_id":"lockemong","live_commerce":false,"is_pro_account":false,"hide_following_follower_list":0,"avatar_medium":{"uri":"","url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]},"unique_id_modify_time":1561706663,"weibo_url":"","download_setting":0,"with_commerce_enterprise_tab_entry":false,"user_canceled":false,"user_mode":1,"birthday":"1900-01-01","star_use_new_download":true,"account_region":"","youtube_channel_id":"","has_insights":false,"type_label":null,"signature_language":"un","short_id":"0","hide_location":false,"apple_account":0,"twitter_name":"","district":"","birthday_hide_level":0,"with_fusion_shop_entry":false,"signature":"","bind_phone":"","platform_sync_info":null,"prevent_download":false,"cha_list":null,"wx_tag":0,"profile_tab_type":0,"watch_status":true,"region":"US","with_shop_entry":false,"download_prompt_ts":0,"cover_url":[{"uri":"musically-maliva-obj/1612555907887110","url_list":["https://m-p16.akamaized.net/obj/musically-maliva-obj/1612555907887110"]}],"is_star":false,"twitter_id":""}
   * extra : {"now":1561706663000}
   * log_pb : {"impr_id":"20190628072423010110134141260A9B"}
   */

  private UserBean user;
  private ExtraBean extra;
  private LogPbBean log_pb;


  public UserBean getUser() {
    return user;
  }

  public void setUser(UserBean user) {
    this.user = user;
  }

  public ExtraBean getExtra() {
    return extra;
  }

  public void setExtra(ExtraBean extra) {
    this.extra = extra;
  }

  public LogPbBean getLog_pb() {
    return log_pb;
  }

  public void setLog_pb(LogPbBean log_pb) {
    this.log_pb = log_pb;
  }

  public static class UserBean {

    /**
     * location :
     * following_count : 18
     * follower_count : 27
     * total_favorited : 2
     * commerce_user_level : 0
     * room_id : 0
     * with_luban_entry : false
     * is_blocked : false
     * follow_status : 2
     * follower_status : 1
     * with_new_goods : false
     * story_open : false
     * original_musician : {"music_count":0,"music_used_count":0,"digg_count":0}
     * iso_country_code :
     * activity : {"use_music_count":0,"digg_count":0}
     * province :
     * relative_users : null
     * nickname : Locke Mong
     * aweme_count : 2
     * is_block : false
     * geofencing : []
     * gender : 0
     * weibo_schema :
     * with_commerce_entry : false
     * city :
     * item_list : null
     * uid : 6705973372813394949
     * sync_to_toutiao : 0
     * react_setting : 0
     * country :
     * sec_uid : MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk
     * verify_info :
     * show_image_bubble : false
     * dongtai_count : 2
     * enterprise_verify_reason :
     * youtube_channel_title :
     * new_story_cover : null
     * ad_cover_url : null
     * with_stick_entry : false
     * comment_setting : 0
     * mplatform_followers_count : 0
     * ins_id :
     * duet_setting : 0
     * reflow_page_gid : 0
     * video_icon_virtual_URI :
     * weibo_verify :
     * user_period : 0
     * favoriting_count : 0
     * followers_detail : [{"app_name":"aweme","name":"抖音","icon":"http://p3.pstatp.com/origin/50ec00079b64de2050dc","fans_count":0,"open_url":"snssdk1128://user/profile/0?","apple_id":"1142110895","download_url":"https://d.douyin.com/JsvN/","package_name":"com.ss.android.ugc.aweme"},{"package_name":"com.ss.android.article.news","app_name":"news_article","name":"头条","icon":"http://p3.pstatp.com/origin/50ed00079a1b6b8d1fb1","fans_count":0,"open_url":"snssdk143://profile?uid=0","apple_id":"529092160","download_url":"https://d.toutiao.com/YjjY/"},{"name":"火山","icon":"http://p3.pstatp.com/origin/551900041a7e00ec86ca","fans_count":0,"open_url":"snssdk1112://profile?id=0","apple_id":"1086047750","download_url":"http://d.huoshanzhibo.com/eFvB/","package_name":"com.ss.android.ugc.live","app_name":"live_stream"}]
     * special_lock : 1
     * has_activity_medal : false
     * avatar_larger : {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * avatar_thumb : {"uri":"","url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]}
     * is_effect_artist : false
     * video_icon : {"uri":"","url_list":[]}
     * share_qrcode_uri :
     * is_verified : false
     * is_gov_media_vip : false
     * constellation : 0
     * recommend_reason_relation :
     * custom_verify :
     * share_info : {"share_title_myself":"This musical.ly app is soooooo fun! Follow me @lockemong on musical.ly and check out my videos!","share_weibo_desc":"musical.ly: Global Video Community","share_title":"Join musical.ly and see what I've been up to!","share_qrcode_url":{"uri":"","url_list":[]},"bool_persist":1,"share_title_other":"This musical.ly user is really cool. Follow @lockemong on musical.ly and check out those amazing videos!","share_url":"https://m.tiktok.com/h5/share/usr/6705973372813394949.html?language=en&sec_uid=MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk&u_code=d7039ei40ijc9g","share_desc":"musical.ly: Global Video Community","share_image_url":{"uri":"tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d","url_list":["https://m-p16.akamaized.net/obj/tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d"]}}
     * verification_type : 0
     * avatar_uri :
     * latest_order_time : 0
     * school_poi_id :
     * secret : 0
     * reflow_page_uid : 0
     * avatar_168x168 : {"uri":"","url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]}
     * avatar_300x300 : {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * unique_id : lockemong
     * live_commerce : false
     * is_pro_account : false
     * hide_following_follower_list : 0
     * avatar_medium : {"uri":"","url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]}
     * unique_id_modify_time : 1561706663
     * weibo_url :
     * download_setting : 0
     * with_commerce_enterprise_tab_entry : false
     * user_canceled : false
     * user_mode : 1
     * birthday : 1900-01-01
     * star_use_new_download : true
     * account_region :
     * youtube_channel_id :
     * has_insights : false
     * type_label : null
     * signature_language : un
     * short_id : 0
     * hide_location : false
     * apple_account : 0
     * twitter_name :
     * district :
     * birthday_hide_level : 0
     * with_fusion_shop_entry : false
     * signature :
     * bind_phone :
     * platform_sync_info : null
     * prevent_download : false
     * cha_list : null
     * wx_tag : 0
     * profile_tab_type : 0
     * watch_status : true
     * region : US
     * with_shop_entry : false
     * download_prompt_ts : 0
     * cover_url : [{"uri":"musically-maliva-obj/1612555907887110","url_list":["https://m-p16.akamaized.net/obj/musically-maliva-obj/1612555907887110"]}]
     * is_star : false
     * twitter_id :
     */

    private String location;
    private int following_count;
    private int follower_count;
    private int total_favorited;
    private int commerce_user_level;
    private int room_id;
    private boolean with_luban_entry;
    private boolean is_blocked;
    private int follow_status;
    private int follower_status;
    private boolean with_new_goods;
    private boolean story_open;
    private OriginalMusicianBean original_musician;
    private String iso_country_code;
    private ActivityBean activity;
    private String province;
    private Object relative_users;
    private String nickname;
    private String email;
    private int aweme_count;
    private boolean is_block;
    private int gender;
    private String weibo_schema;
    private boolean with_commerce_entry;
    private String city;
    private Object item_list;
    private String uid;
    private int sync_to_toutiao;
    private int react_setting;
    private String country;
    private String sec_uid;
    private String verify_info;
    private boolean show_image_bubble;
    private int dongtai_count;
    private String enterprise_verify_reason;
    private String youtube_channel_title;
    private Object new_story_cover;
    private Object ad_cover_url;
    private boolean with_stick_entry;
    private int comment_setting;
    private int mplatform_followers_count;
    private String ins_id;
    private int duet_setting;
    private int reflow_page_gid;
    private String video_icon_virtual_URI;
    private String weibo_verify;
    private int user_period;
    private int favoriting_count;
    private int special_lock;
    private boolean has_activity_medal;
    private AvatarLargerBean avatar_larger;
    private AvatarThumbBean avatar_thumb;
    private boolean is_effect_artist;
    private VideoIconBean video_icon;
    private String share_qrcode_uri;
    private boolean is_verified;
    private boolean is_gov_media_vip;
    private int constellation;
    private String recommend_reason_relation;
    private String custom_verify;
    private ShareInfoBean share_info;
    private int verification_type;
    private String avatar_uri;
    private int latest_order_time;
    private String school_poi_id;
    private int secret;
    private int reflow_page_uid;
    private Avatar168x168Bean avatar_168x168;
    private Avatar300x300Bean avatar_300x300;
    private String unique_id;
    private boolean live_commerce;
    private boolean is_pro_account;
    private int hide_following_follower_list;
    private AvatarMediumBean avatar_medium;
    private int unique_id_modify_time;
    private String weibo_url;
    private int download_setting;
    private boolean with_commerce_enterprise_tab_entry;
    private boolean user_canceled;
    private int user_mode;
    private String birthday;
    private boolean star_use_new_download;
    private String account_region;
    private String youtube_channel_id;
    private boolean has_insights;
    private Object type_label;
    private String signature_language;
    private String short_id;
    private boolean hide_location;
    private int apple_account;
    private String twitter_name;
    private String district;
    private int birthday_hide_level;
    private boolean with_fusion_shop_entry;
    private String signature;
    private String bind_phone;
    private Object platform_sync_info;
    private boolean prevent_download;
    private Object cha_list;
    private int wx_tag;
    private int profile_tab_type;
    private boolean watch_status;
    private String region;
    private boolean with_shop_entry;
    private int download_prompt_ts;
    private boolean is_star;
    private String twitter_id;
    private List<?> geofencing;
    private List<FollowersDetailBean> followers_detail;
    private List<CoverUrlBean> cover_url;

    public String getLocation() {
      return location;
    }

    public void setLocation(String location) {
      this.location = location;
    }

    public int getFollowing_count() {
      return following_count;
    }

    public void setFollowing_count(int following_count) {
      this.following_count = following_count;
    }

    public int getFollower_count() {
      return follower_count;
    }

    public void setFollower_count(int follower_count) {
      this.follower_count = follower_count;
    }

    public int getTotal_favorited() {
      return total_favorited;
    }

    public void setTotal_favorited(int total_favorited) {
      this.total_favorited = total_favorited;
    }

    public int getCommerce_user_level() {
      return commerce_user_level;
    }

    public void setCommerce_user_level(int commerce_user_level) {
      this.commerce_user_level = commerce_user_level;
    }

    public int getRoom_id() {
      return room_id;
    }

    public void setRoom_id(int room_id) {
      this.room_id = room_id;
    }

    public boolean isWith_luban_entry() {
      return with_luban_entry;
    }

    public void setWith_luban_entry(boolean with_luban_entry) {
      this.with_luban_entry = with_luban_entry;
    }

    public boolean isIs_blocked() {
      return is_blocked;
    }

    public void setIs_blocked(boolean is_blocked) {
      this.is_blocked = is_blocked;
    }

    public int getFollow_status() {
      return follow_status;
    }

    public void setFollow_status(int follow_status) {
      this.follow_status = follow_status;
    }

    public int getFollower_status() {
      return follower_status;
    }

    public void setFollower_status(int follower_status) {
      this.follower_status = follower_status;
    }

    public boolean isWith_new_goods() {
      return with_new_goods;
    }

    public void setWith_new_goods(boolean with_new_goods) {
      this.with_new_goods = with_new_goods;
    }

    public boolean isStory_open() {
      return story_open;
    }

    public void setStory_open(boolean story_open) {
      this.story_open = story_open;
    }

    public OriginalMusicianBean getOriginal_musician() {
      return original_musician;
    }

    public void setOriginal_musician(OriginalMusicianBean original_musician) {
      this.original_musician = original_musician;
    }

    public String getIso_country_code() {
      return iso_country_code;
    }

    public void setIso_country_code(String iso_country_code) {
      this.iso_country_code = iso_country_code;
    }

    public ActivityBean getActivity() {
      return activity;
    }

    public void setActivity(ActivityBean activity) {
      this.activity = activity;
    }

    public String getProvince() {
      return province;
    }

    public void setProvince(String province) {
      this.province = province;
    }

    public Object getRelative_users() {
      return relative_users;
    }

    public void setRelative_users(Object relative_users) {
      this.relative_users = relative_users;
    }

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public int getAweme_count() {
      return aweme_count;
    }

    public void setAweme_count(int aweme_count) {
      this.aweme_count = aweme_count;
    }

    public boolean isIs_block() {
      return is_block;
    }

    public void setIs_block(boolean is_block) {
      this.is_block = is_block;
    }

    public int getGender() {
      return gender;
    }

    public void setGender(int gender) {
      this.gender = gender;
    }

    public String getWeibo_schema() {
      return weibo_schema;
    }

    public void setWeibo_schema(String weibo_schema) {
      this.weibo_schema = weibo_schema;
    }

    public boolean isWith_commerce_entry() {
      return with_commerce_entry;
    }

    public void setWith_commerce_entry(boolean with_commerce_entry) {
      this.with_commerce_entry = with_commerce_entry;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public Object getItem_list() {
      return item_list;
    }

    public void setItem_list(Object item_list) {
      this.item_list = item_list;
    }

    public String getUid() {
      return uid;
    }

    public void setUid(String uid) {
      this.uid = uid;
    }

    public int getSync_to_toutiao() {
      return sync_to_toutiao;
    }

    public void setSync_to_toutiao(int sync_to_toutiao) {
      this.sync_to_toutiao = sync_to_toutiao;
    }

    public int getReact_setting() {
      return react_setting;
    }

    public void setReact_setting(int react_setting) {
      this.react_setting = react_setting;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public String getSec_uid() {
      return sec_uid;
    }

    public void setSec_uid(String sec_uid) {
      this.sec_uid = sec_uid;
    }

    public String getVerify_info() {
      return verify_info;
    }

    public void setVerify_info(String verify_info) {
      this.verify_info = verify_info;
    }

    public boolean isShow_image_bubble() {
      return show_image_bubble;
    }

    public void setShow_image_bubble(boolean show_image_bubble) {
      this.show_image_bubble = show_image_bubble;
    }

    public int getDongtai_count() {
      return dongtai_count;
    }

    public void setDongtai_count(int dongtai_count) {
      this.dongtai_count = dongtai_count;
    }

    public String getEnterprise_verify_reason() {
      return enterprise_verify_reason;
    }

    public void setEnterprise_verify_reason(String enterprise_verify_reason) {
      this.enterprise_verify_reason = enterprise_verify_reason;
    }

    public String getYoutube_channel_title() {
      return youtube_channel_title;
    }

    public void setYoutube_channel_title(String youtube_channel_title) {
      this.youtube_channel_title = youtube_channel_title;
    }

    public Object getNew_story_cover() {
      return new_story_cover;
    }

    public void setNew_story_cover(Object new_story_cover) {
      this.new_story_cover = new_story_cover;
    }

    public Object getAd_cover_url() {
      return ad_cover_url;
    }

    public void setAd_cover_url(Object ad_cover_url) {
      this.ad_cover_url = ad_cover_url;
    }

    public boolean isWith_stick_entry() {
      return with_stick_entry;
    }

    public void setWith_stick_entry(boolean with_stick_entry) {
      this.with_stick_entry = with_stick_entry;
    }

    public int getComment_setting() {
      return comment_setting;
    }

    public void setComment_setting(int comment_setting) {
      this.comment_setting = comment_setting;
    }

    public int getMplatform_followers_count() {
      return mplatform_followers_count;
    }

    public void setMplatform_followers_count(int mplatform_followers_count) {
      this.mplatform_followers_count = mplatform_followers_count;
    }

    public String getIns_id() {
      return ins_id;
    }

    public void setIns_id(String ins_id) {
      this.ins_id = ins_id;
    }

    public int getDuet_setting() {
      return duet_setting;
    }

    public void setDuet_setting(int duet_setting) {
      this.duet_setting = duet_setting;
    }

    public int getReflow_page_gid() {
      return reflow_page_gid;
    }

    public void setReflow_page_gid(int reflow_page_gid) {
      this.reflow_page_gid = reflow_page_gid;
    }

    public String getVideo_icon_virtual_URI() {
      return video_icon_virtual_URI;
    }

    public void setVideo_icon_virtual_URI(String video_icon_virtual_URI) {
      this.video_icon_virtual_URI = video_icon_virtual_URI;
    }

    public String getWeibo_verify() {
      return weibo_verify;
    }

    public void setWeibo_verify(String weibo_verify) {
      this.weibo_verify = weibo_verify;
    }

    public int getUser_period() {
      return user_period;
    }

    public void setUser_period(int user_period) {
      this.user_period = user_period;
    }

    public int getFavoriting_count() {
      return favoriting_count;
    }

    public void setFavoriting_count(int favoriting_count) {
      this.favoriting_count = favoriting_count;
    }

    public int getSpecial_lock() {
      return special_lock;
    }

    public void setSpecial_lock(int special_lock) {
      this.special_lock = special_lock;
    }

    public boolean isHas_activity_medal() {
      return has_activity_medal;
    }

    public void setHas_activity_medal(boolean has_activity_medal) {
      this.has_activity_medal = has_activity_medal;
    }

    public AvatarLargerBean getAvatar_larger() {
      return avatar_larger;
    }

    public void setAvatar_larger(AvatarLargerBean avatar_larger) {
      this.avatar_larger = avatar_larger;
    }

    public AvatarThumbBean getAvatar_thumb() {
      return avatar_thumb;
    }

    public void setAvatar_thumb(AvatarThumbBean avatar_thumb) {
      this.avatar_thumb = avatar_thumb;
    }

    public boolean isIs_effect_artist() {
      return is_effect_artist;
    }

    public void setIs_effect_artist(boolean is_effect_artist) {
      this.is_effect_artist = is_effect_artist;
    }

    public VideoIconBean getVideo_icon() {
      return video_icon;
    }

    public void setVideo_icon(VideoIconBean video_icon) {
      this.video_icon = video_icon;
    }

    public String getShare_qrcode_uri() {
      return share_qrcode_uri;
    }

    public void setShare_qrcode_uri(String share_qrcode_uri) {
      this.share_qrcode_uri = share_qrcode_uri;
    }

    public boolean isIs_verified() {
      return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
      this.is_verified = is_verified;
    }

    public boolean isIs_gov_media_vip() {
      return is_gov_media_vip;
    }

    public void setIs_gov_media_vip(boolean is_gov_media_vip) {
      this.is_gov_media_vip = is_gov_media_vip;
    }

    public int getConstellation() {
      return constellation;
    }

    public void setConstellation(int constellation) {
      this.constellation = constellation;
    }

    public String getRecommend_reason_relation() {
      return recommend_reason_relation;
    }

    public void setRecommend_reason_relation(String recommend_reason_relation) {
      this.recommend_reason_relation = recommend_reason_relation;
    }

    public String getCustom_verify() {
      return custom_verify;
    }

    public void setCustom_verify(String custom_verify) {
      this.custom_verify = custom_verify;
    }

    public ShareInfoBean getShare_info() {
      return share_info;
    }

    public void setShare_info(ShareInfoBean share_info) {
      this.share_info = share_info;
    }

    public int getVerification_type() {
      return verification_type;
    }

    public void setVerification_type(int verification_type) {
      this.verification_type = verification_type;
    }

    public String getAvatar_uri() {
      return avatar_uri;
    }

    public void setAvatar_uri(String avatar_uri) {
      this.avatar_uri = avatar_uri;
    }

    public int getLatest_order_time() {
      return latest_order_time;
    }

    public void setLatest_order_time(int latest_order_time) {
      this.latest_order_time = latest_order_time;
    }

    public String getSchool_poi_id() {
      return school_poi_id;
    }

    public void setSchool_poi_id(String school_poi_id) {
      this.school_poi_id = school_poi_id;
    }

    public int getSecret() {
      return secret;
    }

    public void setSecret(int secret) {
      this.secret = secret;
    }

    public int getReflow_page_uid() {
      return reflow_page_uid;
    }

    public void setReflow_page_uid(int reflow_page_uid) {
      this.reflow_page_uid = reflow_page_uid;
    }

    public Avatar168x168Bean getAvatar_168x168() {
      return avatar_168x168;
    }

    public void setAvatar_168x168(Avatar168x168Bean avatar_168x168) {
      this.avatar_168x168 = avatar_168x168;
    }

    public Avatar300x300Bean getAvatar_300x300() {
      return avatar_300x300;
    }

    public void setAvatar_300x300(Avatar300x300Bean avatar_300x300) {
      this.avatar_300x300 = avatar_300x300;
    }

    public String getUnique_id() {
      return unique_id;
    }

    public void setUnique_id(String unique_id) {
      this.unique_id = unique_id;
    }

    public boolean isLive_commerce() {
      return live_commerce;
    }

    public void setLive_commerce(boolean live_commerce) {
      this.live_commerce = live_commerce;
    }

    public boolean isIs_pro_account() {
      return is_pro_account;
    }

    public void setIs_pro_account(boolean is_pro_account) {
      this.is_pro_account = is_pro_account;
    }

    public int getHide_following_follower_list() {
      return hide_following_follower_list;
    }

    public void setHide_following_follower_list(int hide_following_follower_list) {
      this.hide_following_follower_list = hide_following_follower_list;
    }

    public AvatarMediumBean getAvatar_medium() {
      return avatar_medium;
    }

    public void setAvatar_medium(AvatarMediumBean avatar_medium) {
      this.avatar_medium = avatar_medium;
    }

    public int getUnique_id_modify_time() {
      return unique_id_modify_time;
    }

    public void setUnique_id_modify_time(int unique_id_modify_time) {
      this.unique_id_modify_time = unique_id_modify_time;
    }

    public String getWeibo_url() {
      return weibo_url;
    }

    public void setWeibo_url(String weibo_url) {
      this.weibo_url = weibo_url;
    }

    public int getDownload_setting() {
      return download_setting;
    }

    public void setDownload_setting(int download_setting) {
      this.download_setting = download_setting;
    }

    public boolean isWith_commerce_enterprise_tab_entry() {
      return with_commerce_enterprise_tab_entry;
    }

    public void setWith_commerce_enterprise_tab_entry(boolean with_commerce_enterprise_tab_entry) {
      this.with_commerce_enterprise_tab_entry = with_commerce_enterprise_tab_entry;
    }

    public boolean isUser_canceled() {
      return user_canceled;
    }

    public void setUser_canceled(boolean user_canceled) {
      this.user_canceled = user_canceled;
    }

    public int getUser_mode() {
      return user_mode;
    }

    public void setUser_mode(int user_mode) {
      this.user_mode = user_mode;
    }

    public String getBirthday() {
      return birthday;
    }

    public void setBirthday(String birthday) {
      this.birthday = birthday;
    }

    public boolean isStar_use_new_download() {
      return star_use_new_download;
    }

    public void setStar_use_new_download(boolean star_use_new_download) {
      this.star_use_new_download = star_use_new_download;
    }

    public String getAccount_region() {
      return account_region;
    }

    public void setAccount_region(String account_region) {
      this.account_region = account_region;
    }

    public String getYoutube_channel_id() {
      return youtube_channel_id;
    }

    public void setYoutube_channel_id(String youtube_channel_id) {
      this.youtube_channel_id = youtube_channel_id;
    }

    public boolean isHas_insights() {
      return has_insights;
    }

    public void setHas_insights(boolean has_insights) {
      this.has_insights = has_insights;
    }

    public Object getType_label() {
      return type_label;
    }

    public void setType_label(Object type_label) {
      this.type_label = type_label;
    }

    public String getSignature_language() {
      return signature_language;
    }

    public void setSignature_language(String signature_language) {
      this.signature_language = signature_language;
    }

    public String getShort_id() {
      return short_id;
    }

    public void setShort_id(String short_id) {
      this.short_id = short_id;
    }

    public boolean isHide_location() {
      return hide_location;
    }

    public void setHide_location(boolean hide_location) {
      this.hide_location = hide_location;
    }

    public int getApple_account() {
      return apple_account;
    }

    public void setApple_account(int apple_account) {
      this.apple_account = apple_account;
    }

    public String getTwitter_name() {
      return twitter_name;
    }

    public void setTwitter_name(String twitter_name) {
      this.twitter_name = twitter_name;
    }

    public String getDistrict() {
      return district;
    }

    public void setDistrict(String district) {
      this.district = district;
    }

    public int getBirthday_hide_level() {
      return birthday_hide_level;
    }

    public void setBirthday_hide_level(int birthday_hide_level) {
      this.birthday_hide_level = birthday_hide_level;
    }

    public boolean isWith_fusion_shop_entry() {
      return with_fusion_shop_entry;
    }

    public void setWith_fusion_shop_entry(boolean with_fusion_shop_entry) {
      this.with_fusion_shop_entry = with_fusion_shop_entry;
    }

    public String getSignature() {
      return signature;
    }

    public void setSignature(String signature) {
      this.signature = signature;
    }

    public String getBind_phone() {
      return bind_phone;
    }

    public void setBind_phone(String bind_phone) {
      this.bind_phone = bind_phone;
    }

    public Object getPlatform_sync_info() {
      return platform_sync_info;
    }

    public void setPlatform_sync_info(Object platform_sync_info) {
      this.platform_sync_info = platform_sync_info;
    }

    public boolean isPrevent_download() {
      return prevent_download;
    }

    public void setPrevent_download(boolean prevent_download) {
      this.prevent_download = prevent_download;
    }

    public Object getCha_list() {
      return cha_list;
    }

    public void setCha_list(Object cha_list) {
      this.cha_list = cha_list;
    }

    public int getWx_tag() {
      return wx_tag;
    }

    public void setWx_tag(int wx_tag) {
      this.wx_tag = wx_tag;
    }

    public int getProfile_tab_type() {
      return profile_tab_type;
    }

    public void setProfile_tab_type(int profile_tab_type) {
      this.profile_tab_type = profile_tab_type;
    }

    public boolean isWatch_status() {
      return watch_status;
    }

    public void setWatch_status(boolean watch_status) {
      this.watch_status = watch_status;
    }

    public String getRegion() {
      return region;
    }

    public void setRegion(String region) {
      this.region = region;
    }

    public boolean isWith_shop_entry() {
      return with_shop_entry;
    }

    public void setWith_shop_entry(boolean with_shop_entry) {
      this.with_shop_entry = with_shop_entry;
    }

    public int getDownload_prompt_ts() {
      return download_prompt_ts;
    }

    public void setDownload_prompt_ts(int download_prompt_ts) {
      this.download_prompt_ts = download_prompt_ts;
    }

    public boolean isIs_star() {
      return is_star;
    }

    public void setIs_star(boolean is_star) {
      this.is_star = is_star;
    }

    public String getTwitter_id() {
      return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
      this.twitter_id = twitter_id;
    }

    public List<?> getGeofencing() {
      return geofencing;
    }

    public void setGeofencing(List<?> geofencing) {
      this.geofencing = geofencing;
    }

    public List<FollowersDetailBean> getFollowers_detail() {
      return followers_detail;
    }

    public void setFollowers_detail(List<FollowersDetailBean> followers_detail) {
      this.followers_detail = followers_detail;
    }

    public List<CoverUrlBean> getCover_url() {
      return cover_url;
    }

    public void setCover_url(List<CoverUrlBean> cover_url) {
      this.cover_url = cover_url;
    }

    public static class OriginalMusicianBean {

      /**
       * music_count : 0
       * music_used_count : 0
       * digg_count : 0
       */

      private int music_count;
      private int music_used_count;
      private int digg_count;

      public int getMusic_count() {
        return music_count;
      }

      public void setMusic_count(int music_count) {
        this.music_count = music_count;
      }

      public int getMusic_used_count() {
        return music_used_count;
      }

      public void setMusic_used_count(int music_used_count) {
        this.music_used_count = music_used_count;
      }

      public int getDigg_count() {
        return digg_count;
      }

      public void setDigg_count(int digg_count) {
        this.digg_count = digg_count;
      }
    }

    public static class ActivityBean {

      /**
       * use_music_count : 0
       * digg_count : 0
       */

      private int use_music_count;
      private int digg_count;

      public int getUse_music_count() {
        return use_music_count;
      }

      public void setUse_music_count(int use_music_count) {
        this.use_music_count = use_music_count;
      }

      public int getDigg_count() {
        return digg_count;
      }

      public void setDigg_count(int digg_count) {
        this.digg_count = digg_count;
      }
    }

    public static class AvatarLargerBean {

      /**
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]
       * uri :
       */

      private String uri;
      private List<String> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<String> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
      }
    }

    public static class AvatarThumbBean {

      /**
       * uri :
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]
       */

      private String uri;
      private List<String> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<String> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
      }
    }

    public static class VideoIconBean {

      /**
       * uri :
       * url_list : []
       */

      private String uri;
      private List<?> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<?> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<?> url_list) {
        this.url_list = url_list;
      }
    }

    public static class ShareInfoBean {

      /**
       * share_title_myself : This musical.ly app is soooooo fun! Follow me @lockemong on musical.ly and check out my videos!
       * share_weibo_desc : musical.ly: Global Video Community
       * share_title : Join musical.ly and see what I've been up to!
       * share_qrcode_url : {"uri":"","url_list":[]}
       * bool_persist : 1
       * share_title_other : This musical.ly user is really cool. Follow @lockemong on musical.ly and check out those amazing videos!
       * share_url : https://m.tiktok.com/h5/share/usr/6705973372813394949.html?language=en&sec_uid=MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk&u_code=d7039ei40ijc9g
       * share_desc : musical.ly: Global Video Community
       * share_image_url : {"uri":"tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d","url_list":["https://m-p16.akamaized.net/obj/tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d"]}
       */

      private String share_title_myself;
      private String share_weibo_desc;
      private String share_title;
      private ShareQrcodeUrlBean share_qrcode_url;
      private int bool_persist;
      private String share_title_other;
      private String share_url;
      private String share_desc;
      private ShareImageUrlBean share_image_url;

      public String getShare_title_myself() {
        return share_title_myself;
      }

      public void setShare_title_myself(String share_title_myself) {
        this.share_title_myself = share_title_myself;
      }

      public String getShare_weibo_desc() {
        return share_weibo_desc;
      }

      public void setShare_weibo_desc(String share_weibo_desc) {
        this.share_weibo_desc = share_weibo_desc;
      }

      public String getShare_title() {
        return share_title;
      }

      public void setShare_title(String share_title) {
        this.share_title = share_title;
      }

      public ShareQrcodeUrlBean getShare_qrcode_url() {
        return share_qrcode_url;
      }

      public void setShare_qrcode_url(ShareQrcodeUrlBean share_qrcode_url) {
        this.share_qrcode_url = share_qrcode_url;
      }

      public int getBool_persist() {
        return bool_persist;
      }

      public void setBool_persist(int bool_persist) {
        this.bool_persist = bool_persist;
      }

      public String getShare_title_other() {
        return share_title_other;
      }

      public void setShare_title_other(String share_title_other) {
        this.share_title_other = share_title_other;
      }

      public String getShare_url() {
        return share_url;
      }

      public void setShare_url(String share_url) {
        this.share_url = share_url;
      }

      public String getShare_desc() {
        return share_desc;
      }

      public void setShare_desc(String share_desc) {
        this.share_desc = share_desc;
      }

      public ShareImageUrlBean getShare_image_url() {
        return share_image_url;
      }

      public void setShare_image_url(ShareImageUrlBean share_image_url) {
        this.share_image_url = share_image_url;
      }

      public static class ShareQrcodeUrlBean {

        /**
         * uri :
         * url_list : []
         */

        private String uri;
        private List<?> url_list;

        public String getUri() {
          return uri;
        }

        public void setUri(String uri) {
          this.uri = uri;
        }

        public List<?> getUrl_list() {
          return url_list;
        }

        public void setUrl_list(List<?> url_list) {
          this.url_list = url_list;
        }
      }

      public static class ShareImageUrlBean {

        /**
         * uri : tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d
         * url_list : ["https://m-p16.akamaized.net/obj/tos-maliva-p-0068/9c93d3c4aa8843a68168bba3b15c386d"]
         */

        private String uri;
        private List<String> url_list;

        public String getUri() {
          return uri;
        }

        public void setUri(String uri) {
          this.uri = uri;
        }

        public List<String> getUrl_list() {
          return url_list;
        }

        public void setUrl_list(List<String> url_list) {
          this.url_list = url_list;
        }
      }
    }

    public static class Avatar168x168Bean {

      /**
       * uri :
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]
       */

      private String uri;
      private List<String> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<String> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
      }
    }

    public static class Avatar300x300Bean {

      /**
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]
       * uri :
       */

      private String uri;
      private List<String> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<String> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
      }
    }

    public static class AvatarMediumBean {

      /**
       * uri :
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"]
       */

      private String uri;
      private List<String> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<String> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
      }
    }

    public static class FollowersDetailBean {

      /**
       * app_name : aweme
       * name : 抖音
       * icon : http://p3.pstatp.com/origin/50ec00079b64de2050dc
       * fans_count : 0
       * open_url : snssdk1128://user/profile/0?
       * apple_id : 1142110895
       * download_url : https://d.douyin.com/JsvN/
       * package_name : com.ss.android.ugc.aweme
       */

      private String app_name;
      private String name;
      private String icon;
      private int fans_count;
      private String open_url;
      private String apple_id;
      private String download_url;
      private String package_name;

      public String getApp_name() {
        return app_name;
      }

      public void setApp_name(String app_name) {
        this.app_name = app_name;
      }

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getIcon() {
        return icon;
      }

      public void setIcon(String icon) {
        this.icon = icon;
      }

      public int getFans_count() {
        return fans_count;
      }

      public void setFans_count(int fans_count) {
        this.fans_count = fans_count;
      }

      public String getOpen_url() {
        return open_url;
      }

      public void setOpen_url(String open_url) {
        this.open_url = open_url;
      }

      public String getApple_id() {
        return apple_id;
      }

      public void setApple_id(String apple_id) {
        this.apple_id = apple_id;
      }

      public String getDownload_url() {
        return download_url;
      }

      public void setDownload_url(String download_url) {
        this.download_url = download_url;
      }

      public String getPackage_name() {
        return package_name;
      }

      public void setPackage_name(String package_name) {
        this.package_name = package_name;
      }
    }

    public static class CoverUrlBean {

      /**
       * uri : musically-maliva-obj/1612555907887110
       * url_list : ["https://m-p16.akamaized.net/obj/musically-maliva-obj/1612555907887110"]
       */

      private String uri;
      private List<String> url_list;

      public String getUri() {
        return uri;
      }

      public void setUri(String uri) {
        this.uri = uri;
      }

      public List<String> getUrl_list() {
        return url_list;
      }

      public void setUrl_list(List<String> url_list) {
        this.url_list = url_list;
      }
    }
  }

  public static class ExtraBean {

    /**
     * now : 1561706663000
     */

    private long now;

    public long getNow() {
      return now;
    }

    public void setNow(long now) {
      this.now = now;
    }
  }

  public static class LogPbBean {

    /**
     * impr_id : 20190628072423010110134141260A9B
     */

    private String impr_id;

    public String getImpr_id() {
      return impr_id;
    }

    public void setImpr_id(String impr_id) {
      this.impr_id = impr_id;
    }
  }
}
