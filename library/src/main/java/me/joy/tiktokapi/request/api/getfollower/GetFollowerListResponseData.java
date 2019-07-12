package me.joy.tiktokapi.request.api.getfollower;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-06-24
 */
public class GetFollowerListResponseData extends TTBaseResponseData {


  /**
   * log_pb : {"impr_id":"201906280907120101101740251388DB"} extra : {"logid":"201906280907120101101740251388DB","now":1561712832232,"fatal_item_ids":[]}
   * has_more : false status_code : 0 followers : [{"youtube_channel_title":"","share_qrcode_uri":"","original_music_qrcode":null,"in_download_whitelist_country":true,"is_gov_media_vip":false,"live_commerce":false,"account_region":"","user_period":0,"reflow_page_gid":0,"is_binded_weibo":false,"video_icon_virtual_URI":"","avatar_168x168":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"school_name":"","download_setting":0,"cv_level":"","custom_verify":"","special_lock":1,"user_canceled":false,"shield_comment_notice":0,"type_label":[],"hide_location":false,"gender":0,"video_icon":{"url_list":[],"uri":""},"school_poi_id":"","live_agreement":0,"is_phone_binded":false,"prevent_download":false,"weibo_schema":"","birthday_hide_level":0,"create_time":0,"has_insights":false,"react_setting":0,"google_account":"","constellation":0,"is_mirror":false,"user_mode":1,"need_recommend":0,"room_id":0,"avatar_medium":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"has_orders":false,"reflow_page_uid":0,"comment_filter_status":0,"cover_url":[{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110","http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110","http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110"],"uri":"musically-maliva-obj/1612555907887110"}],"duet_setting":0,"language":"en","geofencing":[],"ins_id":"","unique_id_modify_time":1550569152,"school_type":0,"twitter_name":"","avatar_uri":"","signature":"","weibo_verify":"","comment_setting":0,"with_fusion_shop_entry":false,"youtube_channel_id":"","avatar_larger":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"user_rate_map":{},"enterprise_verify_reason":"","story_open":false,"user_rate":1,"live_verify":0,"short_id":"0","secret":0,"avatar_thumb":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"is_verified":false,"hide_search":false,"with_commerce_entry":false,"download_prompt_ts":0,"sec_uid":"MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk","twitter_id":"","has_email":false,"policy_version":{},"region":"US","uid":"6705973372813394949","bind_phone":"","weibo_url":"","live_agreement_time":0,"weibo_name":"","commerce_user_level":0,"verify_info":"","apple_account":0,"accept_private_policy":false,"shield_digg_notice":0,"verification_type":0,"follower_status":1,"neiguang_shield":0,"authority_status":0,"avatar_300x300":{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""},"birthday":"1900-01-01","is_ad_fake":false,"nickname":"Locke
   * Mong","shield_follow_notice":0,"original_music_cover":null,"follow_status":2,"status":1,"unique_id":"lockemong"}]
   * rec_has_more : false max_time : 1561543214 offset : 0 min_time : 1561543214 total : 1
   * myself_user_id : 6706016724343882758
   */

  private LogPbBean log_pb;
  private ExtraBean extra;
  private boolean has_more;
  private boolean rec_has_more;
  private int max_time;
  private int offset;
  private int min_time;
  private int total;
  private String myself_user_id;
  private List<FollowersBean> followers;

  public LogPbBean getLog_pb() {
    return log_pb;
  }

  public void setLog_pb(LogPbBean log_pb) {
    this.log_pb = log_pb;
  }

  public ExtraBean getExtra() {
    return extra;
  }

  public void setExtra(ExtraBean extra) {
    this.extra = extra;
  }

  public boolean isHas_more() {
    return has_more;
  }

  public void setHas_more(boolean has_more) {
    this.has_more = has_more;
  }


  public boolean isRec_has_more() {
    return rec_has_more;
  }

  public void setRec_has_more(boolean rec_has_more) {
    this.rec_has_more = rec_has_more;
  }

  public int getMax_time() {
    return max_time;
  }

  public void setMax_time(int max_time) {
    this.max_time = max_time;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getMin_time() {
    return min_time;
  }

  public void setMin_time(int min_time) {
    this.min_time = min_time;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public String getMyself_user_id() {
    return myself_user_id;
  }

  public void setMyself_user_id(String myself_user_id) {
    this.myself_user_id = myself_user_id;
  }

  public List<FollowersBean> getFollowers() {
    return followers;
  }

  public void setFollowers(List<FollowersBean> followers) {
    this.followers = followers;
  }

  public static class LogPbBean {

    /**
     * impr_id : 201906280907120101101740251388DB
     */

    private String impr_id;

    public String getImpr_id() {
      return impr_id;
    }

    public void setImpr_id(String impr_id) {
      this.impr_id = impr_id;
    }
  }

  public static class ExtraBean {

    /**
     * logid : 201906280907120101101740251388DB now : 1561712832232 fatal_item_ids : []
     */

    private String logid;
    private long now;
    private List<?> fatal_item_ids;

    public String getLogid() {
      return logid;
    }

    public void setLogid(String logid) {
      this.logid = logid;
    }

    public long getNow() {
      return now;
    }

    public void setNow(long now) {
      this.now = now;
    }

    public List<?> getFatal_item_ids() {
      return fatal_item_ids;
    }

    public void setFatal_item_ids(List<?> fatal_item_ids) {
      this.fatal_item_ids = fatal_item_ids;
    }
  }

  public static class FollowersBean {

    /**
     * youtube_channel_title : share_qrcode_uri : original_music_qrcode : null
     * in_download_whitelist_country : true is_gov_media_vip : false live_commerce : false
     * account_region : user_period : 0 reflow_page_gid : 0 is_binded_weibo : false
     * video_icon_virtual_URI : avatar_168x168 : {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * school_name : download_setting : 0 cv_level : custom_verify : special_lock : 1 user_canceled
     * : false shield_comment_notice : 0 type_label : [] hide_location : false gender : 0 video_icon
     * : {"url_list":[],"uri":""} school_poi_id : live_agreement : 0 is_phone_binded : false
     * prevent_download : false weibo_schema : birthday_hide_level : 0 create_time : 0 has_insights
     * : false react_setting : 0 google_account : constellation : 0 is_mirror : false user_mode : 1
     * need_recommend : 0 room_id : 0 avatar_medium : {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * has_orders : false reflow_page_uid : 0 comment_filter_status : 0 cover_url :
     * [{"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110","http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110","http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110"],"uri":"musically-maliva-obj/1612555907887110"}]
     * duet_setting : 0 language : en geofencing : [] ins_id : unique_id_modify_time : 1550569152
     * school_type : 0 twitter_name : avatar_uri : signature : weibo_verify : comment_setting : 0
     * with_fusion_shop_entry : false youtube_channel_id : avatar_larger :
     * {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * user_rate_map : {} enterprise_verify_reason : story_open : false user_rate : 1 live_verify :
     * 0 short_id : 0 secret : 0 avatar_thumb : {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * is_verified : false hide_search : false with_commerce_entry : false download_prompt_ts : 0
     * sec_uid : MS4wLjABAAAAzZ_XruUr9X1L6AnSPaiOBWcDT6MN-Oc368qp-LjvP1c91QrRQSdtTq1OPdmpZBuk
     * twitter_id : has_email : false policy_version : {} region : US uid : 6705973372813394949
     * bind_phone : weibo_url : live_agreement_time : 0 weibo_name : commerce_user_level : 0
     * verify_info : apple_account : 0 accept_private_policy : false shield_digg_notice : 0
     * verification_type : 0 follower_status : 1 neiguang_shield : 0 authority_status : 0
     * avatar_300x300 : {"url_list":["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"],"uri":""}
     * birthday : 1900-01-01 is_ad_fake : false nickname : Locke Mong shield_follow_notice : 0
     * original_music_cover : null follow_status : 2 status : 1 unique_id : lockemong
     */

    private String youtube_channel_title;
    private String share_qrcode_uri;
    private Object original_music_qrcode;
    private boolean in_download_whitelist_country;
    private boolean is_gov_media_vip;
    private boolean live_commerce;
    private String account_region;
    private int user_period;
    private int reflow_page_gid;
    private boolean is_binded_weibo;
    private String video_icon_virtual_URI;
    private Avatar168x168Bean avatar_168x168;
    private String school_name;
    private int download_setting;
    private String cv_level;
    private String custom_verify;
    private int special_lock;
    private boolean user_canceled;
    private int shield_comment_notice;
    private boolean hide_location;
    private int gender;
    private VideoIconBean video_icon;
    private String school_poi_id;
    private int live_agreement;
    private boolean is_phone_binded;
    private boolean prevent_download;
    private String weibo_schema;
    private int birthday_hide_level;
    private int create_time;
    private boolean has_insights;
    private int react_setting;
    private String google_account;
    private int constellation;
    private boolean is_mirror;
    private int user_mode;
    private int need_recommend;
    private int room_id;
    private AvatarMediumBean avatar_medium;
    private boolean has_orders;
    private int reflow_page_uid;
    private int comment_filter_status;
    private int duet_setting;
    private String language;
    private String ins_id;
    private int unique_id_modify_time;
    private int school_type;
    private String twitter_name;
    private String avatar_uri;
    private String signature;
    private String weibo_verify;
    private int comment_setting;
    private boolean with_fusion_shop_entry;
    private String youtube_channel_id;
    private AvatarLargerBean avatar_larger;
    private UserRateMapBean user_rate_map;
    private String enterprise_verify_reason;
    private boolean story_open;
    private int user_rate;
    private int live_verify;
    private String short_id;
    private int secret;
    private AvatarThumbBean avatar_thumb;
    private boolean is_verified;
    private boolean hide_search;
    private boolean with_commerce_entry;
    private int download_prompt_ts;
    private String sec_uid;
    private String twitter_id;
    private boolean has_email;
    private PolicyVersionBean policy_version;
    private String region;
    private String uid;
    private String bind_phone;
    private String weibo_url;
    private int live_agreement_time;
    private String weibo_name;
    private int commerce_user_level;
    private String verify_info;
    private int apple_account;
    private boolean accept_private_policy;
    private int shield_digg_notice;
    private int verification_type;
    private int follower_status;
    private int neiguang_shield;
    private int authority_status;
    private Avatar300x300Bean avatar_300x300;
    private String birthday;
    private boolean is_ad_fake;
    private String nickname;
    private String email;
    private int shield_follow_notice;
    private Object original_music_cover;
    private int follow_status;
    private int status;
    private String unique_id;
    private List<?> type_label;
    private List<CoverUrlBean> cover_url;
    private List<?> geofencing;

    public String getYoutube_channel_title() {
      return youtube_channel_title;
    }

    public void setYoutube_channel_title(String youtube_channel_title) {
      this.youtube_channel_title = youtube_channel_title;
    }

    public String getShare_qrcode_uri() {
      return share_qrcode_uri;
    }

    public void setShare_qrcode_uri(String share_qrcode_uri) {
      this.share_qrcode_uri = share_qrcode_uri;
    }

    public Object getOriginal_music_qrcode() {
      return original_music_qrcode;
    }

    public void setOriginal_music_qrcode(Object original_music_qrcode) {
      this.original_music_qrcode = original_music_qrcode;
    }

    public boolean isIn_download_whitelist_country() {
      return in_download_whitelist_country;
    }

    public void setIn_download_whitelist_country(boolean in_download_whitelist_country) {
      this.in_download_whitelist_country = in_download_whitelist_country;
    }

    public boolean isIs_gov_media_vip() {
      return is_gov_media_vip;
    }

    public void setIs_gov_media_vip(boolean is_gov_media_vip) {
      this.is_gov_media_vip = is_gov_media_vip;
    }

    public boolean isLive_commerce() {
      return live_commerce;
    }

    public void setLive_commerce(boolean live_commerce) {
      this.live_commerce = live_commerce;
    }

    public String getAccount_region() {
      return account_region;
    }

    public void setAccount_region(String account_region) {
      this.account_region = account_region;
    }

    public int getUser_period() {
      return user_period;
    }

    public void setUser_period(int user_period) {
      this.user_period = user_period;
    }

    public int getReflow_page_gid() {
      return reflow_page_gid;
    }

    public void setReflow_page_gid(int reflow_page_gid) {
      this.reflow_page_gid = reflow_page_gid;
    }

    public boolean isIs_binded_weibo() {
      return is_binded_weibo;
    }

    public void setIs_binded_weibo(boolean is_binded_weibo) {
      this.is_binded_weibo = is_binded_weibo;
    }

    public String getVideo_icon_virtual_URI() {
      return video_icon_virtual_URI;
    }

    public void setVideo_icon_virtual_URI(String video_icon_virtual_URI) {
      this.video_icon_virtual_URI = video_icon_virtual_URI;
    }

    public Avatar168x168Bean getAvatar_168x168() {
      return avatar_168x168;
    }

    public void setAvatar_168x168(Avatar168x168Bean avatar_168x168) {
      this.avatar_168x168 = avatar_168x168;
    }

    public String getSchool_name() {
      return school_name;
    }

    public void setSchool_name(String school_name) {
      this.school_name = school_name;
    }

    public int getDownload_setting() {
      return download_setting;
    }

    public void setDownload_setting(int download_setting) {
      this.download_setting = download_setting;
    }

    public String getCv_level() {
      return cv_level;
    }

    public void setCv_level(String cv_level) {
      this.cv_level = cv_level;
    }

    public String getCustom_verify() {
      return custom_verify;
    }

    public void setCustom_verify(String custom_verify) {
      this.custom_verify = custom_verify;
    }

    public int getSpecial_lock() {
      return special_lock;
    }

    public void setSpecial_lock(int special_lock) {
      this.special_lock = special_lock;
    }

    public boolean isUser_canceled() {
      return user_canceled;
    }

    public void setUser_canceled(boolean user_canceled) {
      this.user_canceled = user_canceled;
    }

    public int getShield_comment_notice() {
      return shield_comment_notice;
    }

    public void setShield_comment_notice(int shield_comment_notice) {
      this.shield_comment_notice = shield_comment_notice;
    }

    public boolean isHide_location() {
      return hide_location;
    }

    public void setHide_location(boolean hide_location) {
      this.hide_location = hide_location;
    }

    public int getGender() {
      return gender;
    }

    public void setGender(int gender) {
      this.gender = gender;
    }

    public VideoIconBean getVideo_icon() {
      return video_icon;
    }

    public void setVideo_icon(VideoIconBean video_icon) {
      this.video_icon = video_icon;
    }

    public String getSchool_poi_id() {
      return school_poi_id;
    }

    public void setSchool_poi_id(String school_poi_id) {
      this.school_poi_id = school_poi_id;
    }

    public int getLive_agreement() {
      return live_agreement;
    }

    public void setLive_agreement(int live_agreement) {
      this.live_agreement = live_agreement;
    }

    public boolean isIs_phone_binded() {
      return is_phone_binded;
    }

    public void setIs_phone_binded(boolean is_phone_binded) {
      this.is_phone_binded = is_phone_binded;
    }

    public boolean isPrevent_download() {
      return prevent_download;
    }

    public void setPrevent_download(boolean prevent_download) {
      this.prevent_download = prevent_download;
    }

    public String getWeibo_schema() {
      return weibo_schema;
    }

    public void setWeibo_schema(String weibo_schema) {
      this.weibo_schema = weibo_schema;
    }

    public int getBirthday_hide_level() {
      return birthday_hide_level;
    }

    public void setBirthday_hide_level(int birthday_hide_level) {
      this.birthday_hide_level = birthday_hide_level;
    }

    public int getCreate_time() {
      return create_time;
    }

    public void setCreate_time(int create_time) {
      this.create_time = create_time;
    }

    public boolean isHas_insights() {
      return has_insights;
    }

    public void setHas_insights(boolean has_insights) {
      this.has_insights = has_insights;
    }

    public int getReact_setting() {
      return react_setting;
    }

    public void setReact_setting(int react_setting) {
      this.react_setting = react_setting;
    }

    public String getGoogle_account() {
      return google_account;
    }

    public void setGoogle_account(String google_account) {
      this.google_account = google_account;
    }

    public int getConstellation() {
      return constellation;
    }

    public void setConstellation(int constellation) {
      this.constellation = constellation;
    }

    public boolean isIs_mirror() {
      return is_mirror;
    }

    public void setIs_mirror(boolean is_mirror) {
      this.is_mirror = is_mirror;
    }

    public int getUser_mode() {
      return user_mode;
    }

    public void setUser_mode(int user_mode) {
      this.user_mode = user_mode;
    }

    public int getNeed_recommend() {
      return need_recommend;
    }

    public void setNeed_recommend(int need_recommend) {
      this.need_recommend = need_recommend;
    }

    public int getRoom_id() {
      return room_id;
    }

    public void setRoom_id(int room_id) {
      this.room_id = room_id;
    }

    public AvatarMediumBean getAvatar_medium() {
      return avatar_medium;
    }

    public void setAvatar_medium(AvatarMediumBean avatar_medium) {
      this.avatar_medium = avatar_medium;
    }

    public boolean isHas_orders() {
      return has_orders;
    }

    public void setHas_orders(boolean has_orders) {
      this.has_orders = has_orders;
    }

    public int getReflow_page_uid() {
      return reflow_page_uid;
    }

    public void setReflow_page_uid(int reflow_page_uid) {
      this.reflow_page_uid = reflow_page_uid;
    }

    public int getComment_filter_status() {
      return comment_filter_status;
    }

    public void setComment_filter_status(int comment_filter_status) {
      this.comment_filter_status = comment_filter_status;
    }

    public int getDuet_setting() {
      return duet_setting;
    }

    public void setDuet_setting(int duet_setting) {
      this.duet_setting = duet_setting;
    }

    public String getLanguage() {
      return language;
    }

    public void setLanguage(String language) {
      this.language = language;
    }

    public String getIns_id() {
      return ins_id;
    }

    public void setIns_id(String ins_id) {
      this.ins_id = ins_id;
    }

    public int getUnique_id_modify_time() {
      return unique_id_modify_time;
    }

    public void setUnique_id_modify_time(int unique_id_modify_time) {
      this.unique_id_modify_time = unique_id_modify_time;
    }

    public int getSchool_type() {
      return school_type;
    }

    public void setSchool_type(int school_type) {
      this.school_type = school_type;
    }

    public String getTwitter_name() {
      return twitter_name;
    }

    public void setTwitter_name(String twitter_name) {
      this.twitter_name = twitter_name;
    }

    public String getAvatar_uri() {
      return avatar_uri;
    }

    public void setAvatar_uri(String avatar_uri) {
      this.avatar_uri = avatar_uri;
    }

    public String getSignature() {
      return signature;
    }

    public void setSignature(String signature) {
      this.signature = signature;
    }

    public String getWeibo_verify() {
      return weibo_verify;
    }

    public void setWeibo_verify(String weibo_verify) {
      this.weibo_verify = weibo_verify;
    }

    public int getComment_setting() {
      return comment_setting;
    }

    public void setComment_setting(int comment_setting) {
      this.comment_setting = comment_setting;
    }

    public boolean isWith_fusion_shop_entry() {
      return with_fusion_shop_entry;
    }

    public void setWith_fusion_shop_entry(boolean with_fusion_shop_entry) {
      this.with_fusion_shop_entry = with_fusion_shop_entry;
    }

    public String getYoutube_channel_id() {
      return youtube_channel_id;
    }

    public void setYoutube_channel_id(String youtube_channel_id) {
      this.youtube_channel_id = youtube_channel_id;
    }

    public AvatarLargerBean getAvatar_larger() {
      return avatar_larger;
    }

    public void setAvatar_larger(AvatarLargerBean avatar_larger) {
      this.avatar_larger = avatar_larger;
    }

    public UserRateMapBean getUser_rate_map() {
      return user_rate_map;
    }

    public void setUser_rate_map(UserRateMapBean user_rate_map) {
      this.user_rate_map = user_rate_map;
    }

    public String getEnterprise_verify_reason() {
      return enterprise_verify_reason;
    }

    public void setEnterprise_verify_reason(String enterprise_verify_reason) {
      this.enterprise_verify_reason = enterprise_verify_reason;
    }

    public boolean isStory_open() {
      return story_open;
    }

    public void setStory_open(boolean story_open) {
      this.story_open = story_open;
    }

    public int getUser_rate() {
      return user_rate;
    }

    public void setUser_rate(int user_rate) {
      this.user_rate = user_rate;
    }

    public int getLive_verify() {
      return live_verify;
    }

    public void setLive_verify(int live_verify) {
      this.live_verify = live_verify;
    }

    public String getShort_id() {
      return short_id;
    }

    public void setShort_id(String short_id) {
      this.short_id = short_id;
    }

    public int getSecret() {
      return secret;
    }

    public void setSecret(int secret) {
      this.secret = secret;
    }

    public AvatarThumbBean getAvatar_thumb() {
      return avatar_thumb;
    }

    public void setAvatar_thumb(AvatarThumbBean avatar_thumb) {
      this.avatar_thumb = avatar_thumb;
    }

    public boolean isIs_verified() {
      return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
      this.is_verified = is_verified;
    }

    public boolean isHide_search() {
      return hide_search;
    }

    public void setHide_search(boolean hide_search) {
      this.hide_search = hide_search;
    }

    public boolean isWith_commerce_entry() {
      return with_commerce_entry;
    }

    public void setWith_commerce_entry(boolean with_commerce_entry) {
      this.with_commerce_entry = with_commerce_entry;
    }

    public int getDownload_prompt_ts() {
      return download_prompt_ts;
    }

    public void setDownload_prompt_ts(int download_prompt_ts) {
      this.download_prompt_ts = download_prompt_ts;
    }

    public String getSec_uid() {
      return sec_uid;
    }

    public void setSec_uid(String sec_uid) {
      this.sec_uid = sec_uid;
    }

    public String getTwitter_id() {
      return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
      this.twitter_id = twitter_id;
    }

    public boolean isHas_email() {
      return has_email;
    }

    public void setHas_email(boolean has_email) {
      this.has_email = has_email;
    }

    public PolicyVersionBean getPolicy_version() {
      return policy_version;
    }

    public void setPolicy_version(PolicyVersionBean policy_version) {
      this.policy_version = policy_version;
    }

    public String getRegion() {
      return region;
    }

    public void setRegion(String region) {
      this.region = region;
    }

    public String getUid() {
      return uid;
    }

    public void setUid(String uid) {
      this.uid = uid;
    }

    public String getBind_phone() {
      return bind_phone;
    }

    public void setBind_phone(String bind_phone) {
      this.bind_phone = bind_phone;
    }

    public String getWeibo_url() {
      return weibo_url;
    }

    public void setWeibo_url(String weibo_url) {
      this.weibo_url = weibo_url;
    }

    public int getLive_agreement_time() {
      return live_agreement_time;
    }

    public void setLive_agreement_time(int live_agreement_time) {
      this.live_agreement_time = live_agreement_time;
    }

    public String getWeibo_name() {
      return weibo_name;
    }

    public void setWeibo_name(String weibo_name) {
      this.weibo_name = weibo_name;
    }

    public int getCommerce_user_level() {
      return commerce_user_level;
    }

    public void setCommerce_user_level(int commerce_user_level) {
      this.commerce_user_level = commerce_user_level;
    }

    public String getVerify_info() {
      return verify_info;
    }

    public void setVerify_info(String verify_info) {
      this.verify_info = verify_info;
    }

    public int getApple_account() {
      return apple_account;
    }

    public void setApple_account(int apple_account) {
      this.apple_account = apple_account;
    }

    public boolean isAccept_private_policy() {
      return accept_private_policy;
    }

    public void setAccept_private_policy(boolean accept_private_policy) {
      this.accept_private_policy = accept_private_policy;
    }

    public int getShield_digg_notice() {
      return shield_digg_notice;
    }

    public void setShield_digg_notice(int shield_digg_notice) {
      this.shield_digg_notice = shield_digg_notice;
    }

    public int getVerification_type() {
      return verification_type;
    }

    public void setVerification_type(int verification_type) {
      this.verification_type = verification_type;
    }

    public int getFollower_status() {
      return follower_status;
    }

    public void setFollower_status(int follower_status) {
      this.follower_status = follower_status;
    }

    public int getNeiguang_shield() {
      return neiguang_shield;
    }

    public void setNeiguang_shield(int neiguang_shield) {
      this.neiguang_shield = neiguang_shield;
    }

    public int getAuthority_status() {
      return authority_status;
    }

    public void setAuthority_status(int authority_status) {
      this.authority_status = authority_status;
    }

    public Avatar300x300Bean getAvatar_300x300() {
      return avatar_300x300;
    }

    public void setAvatar_300x300(Avatar300x300Bean avatar_300x300) {
      this.avatar_300x300 = avatar_300x300;
    }

    public String getBirthday() {
      return birthday;
    }

    public void setBirthday(String birthday) {
      this.birthday = birthday;
    }

    public boolean isIs_ad_fake() {
      return is_ad_fake;
    }

    public void setIs_ad_fake(boolean is_ad_fake) {
      this.is_ad_fake = is_ad_fake;
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

    public int getShield_follow_notice() {
      return shield_follow_notice;
    }

    public void setShield_follow_notice(int shield_follow_notice) {
      this.shield_follow_notice = shield_follow_notice;
    }

    public Object getOriginal_music_cover() {
      return original_music_cover;
    }

    public void setOriginal_music_cover(Object original_music_cover) {
      this.original_music_cover = original_music_cover;
    }

    public int getFollow_status() {
      return follow_status;
    }

    public void setFollow_status(int follow_status) {
      this.follow_status = follow_status;
    }

    public int getStatus() {
      return status;
    }

    public void setStatus(int status) {
      this.status = status;
    }

    public String getUnique_id() {
      return unique_id;
    }

    public void setUnique_id(String unique_id) {
      this.unique_id = unique_id;
    }

    public List<?> getType_label() {
      return type_label;
    }

    public void setType_label(List<?> type_label) {
      this.type_label = type_label;
    }

    public List<CoverUrlBean> getCover_url() {
      return cover_url;
    }

    public void setCover_url(List<CoverUrlBean> cover_url) {
      this.cover_url = cover_url;
    }

    public List<?> getGeofencing() {
      return geofencing;
    }

    public void setGeofencing(List<?> geofencing) {
      this.geofencing = geofencing;
    }

    public static class Avatar168x168Bean {

      /**
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"] uri :
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
       * url_list : [] uri :
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

    public static class AvatarMediumBean {

      /**
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"] uri :
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

    public static class AvatarLargerBean {

    }

    public static class UserRateMapBean {

    }

    public static class AvatarThumbBean {

    }

    public static class PolicyVersionBean {

    }

    public static class Avatar300x300Bean {

      /**
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1637202070785030"] uri :
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

    public static class CoverUrlBean {

      /**
       * url_list : ["http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110","http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110","http://p16.muscdn.com/obj/musically-maliva-obj/1612555907887110"]
       * uri : musically-maliva-obj/1612555907887110
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
}
