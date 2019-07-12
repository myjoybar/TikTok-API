package me.joy.tiktokapi.response;

/**
 * Created by Joy on 2019-06-27
 */
public class BaseErrorResponseData {

  private int block_code;
  private String message;
  private String status_msg;

  /**
   * login need captcha
   * data : {"captcha":"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","captcha_key":"6706013657706825221","description":"Verification code error, please re-enter the verification code.","error_code":1102}
   * message : error
   */

  private DataBean data = new DataBean();


  public DataBean getData() {
    return data;
  }

  public void setData(DataBean data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStatus_msg() {
    return status_msg;
  }

  public int getBlock_code() {
    return block_code;
  }

  public void setBlock_code(int block_code) {
    this.block_code = block_code;
  }

  public void setStatus_msg(String status_msg) {
    this.status_msg = status_msg;
  }

  public static class DataBean {

    /**
     * captcha : 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
     * captcha_key : 6706013657706825221
     * description : Verification code error, please re-enter the verification code.
     * error_code : 1102
     */

    private String captcha;
    private String captcha_key;
    private String description;
    private int error_code;  // 1102 1101
    public String getCaptcha() {
      return captcha;
    }

    public void setCaptcha(String captcha) {
      this.captcha = captcha;
    }

    public String getCaptcha_key() {
      return captcha_key;
    }

    public void setCaptcha_key(String captcha_key) {
      this.captcha_key = captcha_key;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public int getError_code() {
      return error_code;
    }

    public void setError_code(int error_code) {
      this.error_code = error_code;
    }

    @Override
    public String toString() {
      return "DataBean{" +
          "captcha='" + captcha + '\'' +
          ", captcha_key='" + captcha_key + '\'' +
          ", description='" + description + '\'' +
          ", error_code=" + error_code +
          '}';
    }
  }

  @Override
  public String toString() {
    return "BaseErrorResponseData{" +
        "block_code=" + block_code +
        ", message='" + message + '\'' +
        ", data=" + data.toString() +
        '}';
  }
}
