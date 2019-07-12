package me.joy.tiktokapi.request.api.uploadimg;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-07-02
 */
public class UploadImgRequestResponse extends TTBaseResponseData {


  /**
   * data : {"url_list":["https://m-p16.akamaized.net/obj/musically-maliva-obj/1638459719086086","https://m-p16.akamaized.net/obj/musically-maliva-obj/1638459719086086","https://m-p16.akamaized.net/obj/musically-maliva-obj/1638459719086086"],"uri":"musically-maliva-obj/1638459719086086"}
   * log_pb : {"impr_id":"20190708033552010110222054417E47"}
   * extra : {"logid":"20190708033552010110222054417E47","now":1562556952621,"fatal_item_ids":[]}
   */

  private DataBean data;
  private LogPbBean log_pb;
  private ExtraBean extra;

  public DataBean getData() {
    return data;
  }

  public void setData(DataBean data) {
    this.data = data;
  }

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

  public static class DataBean {

    /**
     * url_list : ["https://m-p16.akamaized.net/obj/musically-maliva-obj/1638459719086086","https://m-p16.akamaized.net/obj/musically-maliva-obj/1638459719086086","https://m-p16.akamaized.net/obj/musically-maliva-obj/1638459719086086"]
     * uri : musically-maliva-obj/1638459719086086
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

  public static class LogPbBean {

    /**
     * impr_id : 20190708033552010110222054417E47
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
     * logid : 20190708033552010110222054417E47
     * now : 1562556952621
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
