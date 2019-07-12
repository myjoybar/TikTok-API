package me.joy.tiktokapi.request.api.login.loginemail;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-06-24
 */
public class LoginResponseData extends TTBaseResponseData {


  /**
   * data : {"user_id":6706016724343882758,"user_id_str":"6706016724343882758","name":"joy.deng","screen_name":"joy.deng","avatar_url":"","user_verified":false,"verified_content":"","verified_agency":"","is_blocked":0,"is_blocking":0,"bg_img_url":"","gender":0,"media_id":0,"user_auth_info":"","industry":"","area":"","can_be_found_by_phone":1,"mobile":"","birthday":"","description":"","email":"j***g@dingtone.me","new_user":0,"session_key":"8fd491c1b97fb657eedec0b174bfd80d","is_recommend_allowed":1,"recommend_hint_message":"同时推荐给我的粉丝","connects":[],"followings_count":0,"followers_count":0,"visit_count_recent":0,"skip_edit_profile":0,"is_manual_set_user_info":false}
   * message : success
   */

  private DataBean data;

  public DataBean getData() {
    return data;
  }

  public void setData(DataBean data) {
    this.data = data;
  }


  public static class DataBean {

    /**
     * user_id : 6706016724343882758
     * user_id_str : 6706016724343882758
     * name : joy.deng
     * screen_name : joy.deng
     * avatar_url :
     * user_verified : false
     * verified_content :
     * verified_agency :
     * is_blocked : 0
     * is_blocking : 0
     * bg_img_url :
     * gender : 0
     * media_id : 0
     * user_auth_info :
     * industry :
     * area :
     * can_be_found_by_phone : 1
     * mobile :
     * birthday :
     * description :
     * email : j***g@dingtone.me
     * new_user : 0
     * session_key : 8fd491c1b97fb657eedec0b174bfd80d
     * is_recommend_allowed : 1
     * recommend_hint_message : 同时推荐给我的粉丝
     * connects : []
     * followings_count : 0
     * followers_count : 0
     * visit_count_recent : 0
     * skip_edit_profile : 0
     * is_manual_set_user_info : false
     */

    private long user_id;
    private String user_id_str;
    private String name;
    private String screen_name;
    private String avatar_url;
    private boolean user_verified;
    private String verified_content;
    private String verified_agency;
    private int is_blocked;
    private int is_blocking;
    private String bg_img_url;
    private int gender;
    private int media_id;
    private String user_auth_info;
    private String industry;
    private String area;
    private int can_be_found_by_phone;
    private String mobile;
    private String birthday;
    private String description;
    private String email;
    private int new_user;
    private String session_key;
    private int is_recommend_allowed;
    private String recommend_hint_message;
    private int followings_count;
    private int followers_count;
    private int visit_count_recent;
    private int skip_edit_profile;
    private boolean is_manual_set_user_info;
    private List<?> connects;

    public long getUser_id() {
      return user_id;
    }

    public void setUser_id(long user_id) {
      this.user_id = user_id;
    }

    public String getUser_id_str() {
      return user_id_str;
    }

    public void setUser_id_str(String user_id_str) {
      this.user_id_str = user_id_str;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getScreen_name() {
      return screen_name;
    }

    public void setScreen_name(String screen_name) {
      this.screen_name = screen_name;
    }

    public String getAvatar_url() {
      return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
      this.avatar_url = avatar_url;
    }

    public boolean isUser_verified() {
      return user_verified;
    }

    public void setUser_verified(boolean user_verified) {
      this.user_verified = user_verified;
    }

    public String getVerified_content() {
      return verified_content;
    }

    public void setVerified_content(String verified_content) {
      this.verified_content = verified_content;
    }

    public String getVerified_agency() {
      return verified_agency;
    }

    public void setVerified_agency(String verified_agency) {
      this.verified_agency = verified_agency;
    }

    public int getIs_blocked() {
      return is_blocked;
    }

    public void setIs_blocked(int is_blocked) {
      this.is_blocked = is_blocked;
    }

    public int getIs_blocking() {
      return is_blocking;
    }

    public void setIs_blocking(int is_blocking) {
      this.is_blocking = is_blocking;
    }

    public String getBg_img_url() {
      return bg_img_url;
    }

    public void setBg_img_url(String bg_img_url) {
      this.bg_img_url = bg_img_url;
    }

    public int getGender() {
      return gender;
    }

    public void setGender(int gender) {
      this.gender = gender;
    }

    public int getMedia_id() {
      return media_id;
    }

    public void setMedia_id(int media_id) {
      this.media_id = media_id;
    }

    public String getUser_auth_info() {
      return user_auth_info;
    }

    public void setUser_auth_info(String user_auth_info) {
      this.user_auth_info = user_auth_info;
    }

    public String getIndustry() {
      return industry;
    }

    public void setIndustry(String industry) {
      this.industry = industry;
    }

    public String getArea() {
      return area;
    }

    public void setArea(String area) {
      this.area = area;
    }

    public int getCan_be_found_by_phone() {
      return can_be_found_by_phone;
    }

    public void setCan_be_found_by_phone(int can_be_found_by_phone) {
      this.can_be_found_by_phone = can_be_found_by_phone;
    }

    public String getMobile() {
      return mobile;
    }

    public void setMobile(String mobile) {
      this.mobile = mobile;
    }

    public String getBirthday() {
      return birthday;
    }

    public void setBirthday(String birthday) {
      this.birthday = birthday;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public int getNew_user() {
      return new_user;
    }

    public void setNew_user(int new_user) {
      this.new_user = new_user;
    }

    public String getSession_key() {
      return session_key;
    }

    public void setSession_key(String session_key) {
      this.session_key = session_key;
    }

    public int getIs_recommend_allowed() {
      return is_recommend_allowed;
    }

    public void setIs_recommend_allowed(int is_recommend_allowed) {
      this.is_recommend_allowed = is_recommend_allowed;
    }

    public String getRecommend_hint_message() {
      return recommend_hint_message;
    }

    public void setRecommend_hint_message(String recommend_hint_message) {
      this.recommend_hint_message = recommend_hint_message;
    }

    public int getFollowings_count() {
      return followings_count;
    }

    public void setFollowings_count(int followings_count) {
      this.followings_count = followings_count;
    }

    public int getFollowers_count() {
      return followers_count;
    }

    public void setFollowers_count(int followers_count) {
      this.followers_count = followers_count;
    }

    public int getVisit_count_recent() {
      return visit_count_recent;
    }

    public void setVisit_count_recent(int visit_count_recent) {
      this.visit_count_recent = visit_count_recent;
    }

    public int getSkip_edit_profile() {
      return skip_edit_profile;
    }

    public void setSkip_edit_profile(int skip_edit_profile) {
      this.skip_edit_profile = skip_edit_profile;
    }

    public boolean isIs_manual_set_user_info() {
      return is_manual_set_user_info;
    }

    public void setIs_manual_set_user_info(boolean is_manual_set_user_info) {
      this.is_manual_set_user_info = is_manual_set_user_info;
    }

    public List<?> getConnects() {
      return connects;
    }

    public void setConnects(List<?> connects) {
      this.connects = connects;
    }
  }
}
