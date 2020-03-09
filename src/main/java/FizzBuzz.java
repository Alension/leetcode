import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public List<String> fizzBuzz(int n) {

    List<String> re = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        re.add("FizzBuzz");
      } else if (i % 3 == 0) {
        re.add("Fizz");
      } else if (i % 5 == 0) {
        re.add("Buzz");
      } else {
        re.add(String.valueOf(i));
      }
    }
    return re;
  }
}
