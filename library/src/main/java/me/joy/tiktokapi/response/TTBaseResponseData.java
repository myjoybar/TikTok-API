package me.joy.tiktokapi.response;

/**
 * Created by Joy on 2019-06-24
 */
public class TTBaseResponseData {

  private String message; // success  error
  private int status_code; // 0
  private String status_msg; // unknown
  private String block_code; // 2018


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getStatus_code() {
    return status_code;
  }

  public void setStatus_code(int status_code) {
    this.status_code = status_code;
  }

  public String getStatus_msg() {
    return status_msg;
  }

  public void setStatus_msg(String status_msg) {
    this.status_msg = status_msg;
  }

  public String getBlock_code() {
    return block_code;
  }

  public void setBlock_code(String block_code) {
    this.block_code = block_code;
  }
}
