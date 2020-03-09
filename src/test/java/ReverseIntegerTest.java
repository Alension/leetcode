import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

  @Test
  public void should_return_321_when_give_123() {
    ReverseInteger reverseInteger = new ReverseInteger();
    int result = reverseInteger.reverse(123);
    Assert.assertEquals(321, result);
  }

  @Test
  public void should_return_minus_321_when_give_minus_123() {
    ReverseInteger reverseInteger = new ReverseInteger();
    int result = reverseInteger.reverse(-123);
    Assert.assertEquals(-321, result);
  }

  @Test
  public void should_return_21_when_give_120() {
    ReverseInteger reverseInteger = new ReverseInteger();
    int result = reverseInteger.reverse(120);
    Assert.assertEquals(21, result);
  }
}
