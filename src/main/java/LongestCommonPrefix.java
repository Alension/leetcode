public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String firstStr = strs[0];
    for (int i = firstStr.length() - 1; i >= 0; i--) {
      final String s = firstStr.substring(0, i + 1);
      boolean flag = true;
      for (int j = strs.length - 1; j > 0; j--) {
        if (!strs[j].startsWith(s)) {
          flag = false;
          break;
        }
      }
      if (flag) {
        return s;
      }

    }
    return "";
  }
}
