import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

  private static Map<Character, Character> mappings;

  static {
    mappings = new HashMap<>();
    mappings.put(')', '(');
    mappings.put('}', '{');
    mappings.put(']', '[');

  }

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      if (mappings.values().contains(c)) {
        stack.push(c);
      } else if (stack.empty()) {
        return false;
      } else if (!stack.pop().equals(mappings.get(c))) {
        return false;
      }
    }
    return stack.empty();
  }
}
