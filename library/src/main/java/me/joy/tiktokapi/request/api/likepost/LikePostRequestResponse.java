package me.joy.tiktokapi.request.api.likepost;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-07-02
 */
public class LikePostRequestResponse extends TTBaseResponseData {


  /**
   * status_code : 0
   * is_digg : 0
   * log_pb : {"impr_id":"2019070210094701011014112304821F"}
   * extra : {"logid":"2019070210094701011014112304821F","now":1562062187249,"fatal_item_ids":[]}
   */

  private int is_digg;
  private LogPbBean log_pb;
  private ExtraBean extra;


  public int getIs_digg() {
    return is_digg;
  }

  public void setIs_digg(int is_digg) {
    this.is_digg = is_digg;
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

  public static class LogPbBean {

    /**
     * impr_id : 2019070210094701011014112304821F
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
     * logid : 2019070210094701011014112304821F
     * now : 1562062187249
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
