public class ReverseInteger {

  public int reverse(int x) {

    int result = 0;

    while (x != 0) {

      final int remainder = x % 10;

      x /= 10;

      if (moreThanMaxIntegerValue(result, remainder)) {
        return 0;
      }

      if (lessThanMinIntegerValue(result, remainder)) {
        return 0;
      }

      result = result * 10 + remainder;
    }

    return result;
  }

  private boolean lessThanMinIntegerValue(int result, int remainder) {
    return result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8);
  }

  private boolean moreThanMaxIntegerValue(int result, int remainder) {
    return result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7);
  }


}
