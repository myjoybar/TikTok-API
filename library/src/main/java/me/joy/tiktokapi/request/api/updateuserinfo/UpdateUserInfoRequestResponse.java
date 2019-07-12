package me.joy.tiktokapi.request.api.updateuserinfo;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-07-02
 */
public class UpdateUserInfoRequestResponse extends TTBaseResponseData {


  /**
   * log_pb : {"impr_id":"201907080530560101102220049447DD"}
   * user : {"weibo_schema":"","uid":"6706016724343882758","weibo_url":"","share_qrcode_uri":"","youtube_channel_id":"","weibo_name":"","video_icon":{"url_list":[],"uri":""},"avatar_larger":{"url_list":["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_1080x1080.jpeg"],"uri":"musically-maliva-obj/1638466821449733"},"google_account":"","youtube_channel_title":"","apple_account":0,"short_id":"43955652080","verification_type":0,"secret":0,"avatar_medium":{"url_list":["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_720x720.jpeg"],"uri":"musically-maliva-obj/1638466821449733"},"avatar_thumb":{"url_list":["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_100x100.jpeg"],"uri":"musically-maliva-obj/1638466821449733"},"is_binded_weibo":false,"is_verified":true,"school_name":"","birthday":"1990-06-24","nickname":"joy.test","gender":0,"ins_id":"","twitter_id":"","school_type":0,"school_poi_id":"","twitter_name":"","signature":"test experence","unique_id":"joy.deng"}
   * extra : {"logid":"201907080530560101102220049447DD","now":1562563857036,"fatal_item_ids":[]}
   */

  private LogPbBean log_pb;
  private UserBean user;
  private ExtraBean extra;

  public LogPbBean getLog_pb() {
    return log_pb;
  }

  public void setLog_pb(LogPbBean log_pb) {
    this.log_pb = log_pb;
  }

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

  public static class LogPbBean {

    /**
     * impr_id : 201907080530560101102220049447DD
     */

    private String impr_id;

    public String getImpr_id() {
      return impr_id;
    }

    public void setImpr_id(String impr_id) {
      this.impr_id = impr_id;
    }
  }

  public static class UserBean {

    /**
     * weibo_schema :
     * uid : 6706016724343882758
     * weibo_url :
     * share_qrcode_uri :
     * youtube_channel_id :
     * weibo_name :
     * video_icon : {"url_list":[],"uri":""}
     * avatar_larger : {"url_list":["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_1080x1080.jpeg"],"uri":"musically-maliva-obj/1638466821449733"}
     * google_account :
     * youtube_channel_title :
     * apple_account : 0
     * short_id : 43955652080
     * verification_type : 0
     * secret : 0
     * avatar_medium : {"url_list":["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_720x720.jpeg"],"uri":"musically-maliva-obj/1638466821449733"}
     * avatar_thumb : {"url_list":["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_100x100.jpeg"],"uri":"musically-maliva-obj/1638466821449733"}
     * is_binded_weibo : false
     * is_verified : true
     * school_name :
     * birthday : 1990-06-24
     * nickname : joy.test
     * gender : 0
     * ins_id :
     * twitter_id :
     * school_type : 0
     * school_poi_id :
     * twitter_name :
     * signature : test experence
     * unique_id : joy.deng
     */

    private String weibo_schema;
    private String uid;
    private String weibo_url;
    private String share_qrcode_uri;
    private String youtube_channel_id;
    private String weibo_name;
    private VideoIconBean video_icon;
    private AvatarLargerBean avatar_larger;
    private String google_account;
    private String youtube_channel_title;
    private int apple_account;
    private String short_id;
    private int verification_type;
    private int secret;
    private AvatarMediumBean avatar_medium;
    private AvatarThumbBean avatar_thumb;
    private boolean is_binded_weibo;
    private boolean is_verified;
    private String school_name;
    private String birthday;
    private String nickname;
    private int gender;
    private String ins_id;
    private String twitter_id;
    private int school_type;
    private String school_poi_id;
    private String twitter_name;
    private String signature;
    private String unique_id;

    public String getWeibo_schema() {
      return weibo_schema;
    }

    public void setWeibo_schema(String weibo_schema) {
      this.weibo_schema = weibo_schema;
    }

    public String getUid() {
      return uid;
    }

    public void setUid(String uid) {
      this.uid = uid;
    }

    public String getWeibo_url() {
      return weibo_url;
    }

    public void setWeibo_url(String weibo_url) {
      this.weibo_url = weibo_url;
    }

    public String getShare_qrcode_uri() {
      return share_qrcode_uri;
    }

    public void setShare_qrcode_uri(String share_qrcode_uri) {
      this.share_qrcode_uri = share_qrcode_uri;
    }

    public String getYoutube_channel_id() {
      return youtube_channel_id;
    }

    public void setYoutube_channel_id(String youtube_channel_id) {
      this.youtube_channel_id = youtube_channel_id;
    }

    public String getWeibo_name() {
      return weibo_name;
    }

    public void setWeibo_name(String weibo_name) {
      this.weibo_name = weibo_name;
    }

    public VideoIconBean getVideo_icon() {
      return video_icon;
    }

    public void setVideo_icon(VideoIconBean video_icon) {
      this.video_icon = video_icon;
    }

    public AvatarLargerBean getAvatar_larger() {
      return avatar_larger;
    }

    public void setAvatar_larger(AvatarLargerBean avatar_larger) {
      this.avatar_larger = avatar_larger;
    }

    public String getGoogle_account() {
      return google_account;
    }

    public void setGoogle_account(String google_account) {
      this.google_account = google_account;
    }

    public String getYoutube_channel_title() {
      return youtube_channel_title;
    }

    public void setYoutube_channel_title(String youtube_channel_title) {
      this.youtube_channel_title = youtube_channel_title;
    }

    public int getApple_account() {
      return apple_account;
    }

    public void setApple_account(int apple_account) {
      this.apple_account = apple_account;
    }

    public String getShort_id() {
      return short_id;
    }

    public void setShort_id(String short_id) {
      this.short_id = short_id;
    }

    public int getVerification_type() {
      return verification_type;
    }

    public void setVerification_type(int verification_type) {
      this.verification_type = verification_type;
    }

    public int getSecret() {
      return secret;
    }

    public void setSecret(int secret) {
      this.secret = secret;
    }

    public AvatarMediumBean getAvatar_medium() {
      return avatar_medium;
    }

    public void setAvatar_medium(AvatarMediumBean avatar_medium) {
      this.avatar_medium = avatar_medium;
    }

    public AvatarThumbBean getAvatar_thumb() {
      return avatar_thumb;
    }

    public void setAvatar_thumb(AvatarThumbBean avatar_thumb) {
      this.avatar_thumb = avatar_thumb;
    }

    public boolean isIs_binded_weibo() {
      return is_binded_weibo;
    }

    public void setIs_binded_weibo(boolean is_binded_weibo) {
      this.is_binded_weibo = is_binded_weibo;
    }

    public boolean isIs_verified() {
      return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
      this.is_verified = is_verified;
    }

    public String getSchool_name() {
      return school_name;
    }

    public void setSchool_name(String school_name) {
      this.school_name = school_name;
    }

    public String getBirthday() {
      return birthday;
    }

    public void setBirthday(String birthday) {
      this.birthday = birthday;
    }

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public int getGender() {
      return gender;
    }

    public void setGender(int gender) {
      this.gender = gender;
    }

    public String getIns_id() {
      return ins_id;
    }

    public void setIns_id(String ins_id) {
      this.ins_id = ins_id;
    }

    public String getTwitter_id() {
      return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
      this.twitter_id = twitter_id;
    }

    public int getSchool_type() {
      return school_type;
    }

    public void setSchool_type(int school_type) {
      this.school_type = school_type;
    }

    public String getSchool_poi_id() {
      return school_poi_id;
    }

    public void setSchool_poi_id(String school_poi_id) {
      this.school_poi_id = school_poi_id;
    }

    public String getTwitter_name() {
      return twitter_name;
    }

    public void setTwitter_name(String twitter_name) {
      this.twitter_name = twitter_name;
    }

    public String getSignature() {
      return signature;
    }

    public void setSignature(String signature) {
      this.signature = signature;
    }

    public String getUnique_id() {
      return unique_id;
    }

    public void setUnique_id(String unique_id) {
      this.unique_id = unique_id;
    }

    public static class VideoIconBean {

      /**
       * url_list : []
       * uri :
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

    public static class AvatarLargerBean {

      /**
       * url_list : ["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_1080x1080.jpeg"]
       * uri : musically-maliva-obj/1638466821449733
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
       * url_list : ["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_720x720.jpeg"]
       * uri : musically-maliva-obj/1638466821449733
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
       * url_list : ["http://p16.muscdn.com/img/musically-maliva-obj/1638466821449733~c5_100x100.jpeg"]
       * uri : musically-maliva-obj/1638466821449733
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
     * logid : 201907080530560101102220049447DD
     * now : 1562563857036
     * fatal_item_ids : []
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
}
