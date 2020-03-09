import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  private static Map<Character, Integer> map = new HashMap<>();

  static {
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
  }

  public int romanToInt(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      if (minus(s, i)) {
        result -= map.get(s.charAt(i));
      } else {
        result += map.get(s.charAt(i));
      }

    }
    return result;
  }

  public boolean minus(String s, int index) {
    if (s.length() == index + 1) {
      return false;
    }
    return map.get(s.charAt(index + 1)) > map.get(s.charAt(index));
  }


}
