package me.joy.tiktokapi.utils.random;

/**
 * Created by Joy on 2019-06-25
 */
public class Validate {
  public static void isTrue(boolean expression, String message, Object... values) {
    if(!expression) {
      throw new IllegalArgumentException(String.format(message, values));
    }
  }

}
