package me.joy.tiktokapi.request.api.follow;

import java.util.List;
import me.joy.tiktokapi.response.TTBaseResponseData;

/**
 * Created by Joy on 2019-07-02
 */
public class FollowRequestResponse extends TTBaseResponseData {

  /**
   * status_code : 0 status_msg : Followed successfully! log_pb : {"impr_id":"20190702064808010110134243263582"}
   * follow_status : 1 extra : {"logid":"20190702064808010110134243263582","now":1562050088364,"fatal_item_ids":[]}
   */

  private LogPbBean log_pb;
  private int follow_status;
  private ExtraBean extra;

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

  public static class LogPbBean {

    /**
     * impr_id : 20190702064808010110134243263582
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
     * logid : 20190702064808010110134243263582 now : 1562050088364 fatal_item_ids : []
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
