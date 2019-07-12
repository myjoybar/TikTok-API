package me.joy.tiktokapi.utils.random;

import java.util.Random;

/**
 * Created by Joy on 2019-06-25
 */
public class RandomUtils {
  private static final Random RANDOM = new Random();
  public static int nextInt(int startInclusive, int endExclusive) {
    Validate
        .isTrue(endExclusive >= startInclusive, "Start value must be smaller or equal to end value.", new Object[0]);
    Validate.isTrue(startInclusive >= 0, "Both range values must be non-negative.", new Object[0]);
    return startInclusive == endExclusive?startInclusive:startInclusive + RANDOM.nextInt(endExclusive - startInclusive);
  }

  public static int nextInt() {
    return nextInt(0, 2147483647);
  }


}
