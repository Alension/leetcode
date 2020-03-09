import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

  @Test
  public void should_return_true_when_give_input1() {
    ValidParentheses validParentheses = new ValidParentheses();
    Assert.assertTrue(validParentheses.isValid("()"));
  }

  @Test
  public void should_return_true_when_give_input2() {
    ValidParentheses validParentheses = new ValidParentheses();
    Assert.assertTrue(validParentheses.isValid("()[]{}"));
  }

  @Test
  public void should_return_false_when_give_input3() {
    ValidParentheses validParentheses = new ValidParentheses();
    Assert.assertFalse(validParentheses.isValid("(]"));
  }

  @Test
  public void should_return_false_when_give_input4() {
    ValidParentheses validParentheses = new ValidParentheses();
    Assert.assertFalse(validParentheses.isValid("([)]"));
  }

  @Test
  public void should_return_true_when_give_input5() {
    ValidParentheses validParentheses = new ValidParentheses();
    Assert.assertTrue(validParentheses.isValid("{[]}"));
  }
}
