package me.joy.tiktokapi.request.api.unfollow;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-07-02
 */
public class UnFollowRequestResponse extends TTBaseResponseData {


  /**
   * log_pb : {"impr_id":"201907020924430101101570484067D0"}
   * follow_status : 0
   * extra : {"logid":"201907020924430101101570484067D0","now":1562059483482,"fatal_item_ids":[]}
   * status_code : 0
   * status_msg : Followed successfully!
   * watch_status : 0
   */

  private LogPbBean log_pb;
  private int follow_status;
  private ExtraBean extra;
  private int watch_status;

  public LogPbBean getLog_pb() {
    return log_pb;
  }

  public void setLog_pb(LogPbBean log_pb) {
    this.log_pb = log_pb;
  }

  public int getFollow_status() {
    return follow_status;
  }

  public void setFollow_status(int follow_status) {
    this.follow_status = follow_status;
  }

  public ExtraBean getExtra() {
    return extra;
  }

  public void setExtra(ExtraBean extra) {
    this.extra = extra;
  }

  public int getWatch_status() {
    return watch_status;
  }

  public void setWatch_status(int watch_status) {
    this.watch_status = watch_status;
  }

  public static class LogPbBean {

    /**
     * impr_id : 201907020924430101101570484067D0
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
     * logid : 201907020924430101101570484067D0
     * now : 1562059483482
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
