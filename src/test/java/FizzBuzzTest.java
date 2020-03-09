import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.core.Is;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = 15)
  void fizzBuzzTest(int n) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    List<String> result = fizzBuzz.fizzBuzz(n);
    final List<String> list = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz",
        "7", "8", "Fizz", "Buzz", "11", "Fizz",
        "13", "14", "FizzBuzz");
    assertThat(result, Is.is(list));
  }
}

