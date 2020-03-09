import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

  @Test
  public void should_return_3_when_give_III() {
    RomanToInteger romantoInteger = new RomanToInteger();
    Assert.assertEquals(3, romantoInteger.romanToInt("III"));
  }

  @Test
  public void should_return_4_when_give_IV() {
    RomanToInteger romantoInteger = new RomanToInteger();
    Assert.assertEquals(4, romantoInteger.romanToInt("IV"));
  }

  @Test
  public void should_return_9_when_give_IX() {
    RomanToInteger romantoInteger = new RomanToInteger();
    Assert.assertEquals(9, romantoInteger.romanToInt("IX"));
  }

  @Test
  public void should_return_58_when_give_LVIII() {
    RomanToInteger romantoInteger = new RomanToInteger();
    Assert.assertEquals(58, romantoInteger.romanToInt("LVIII"));
  }

  @Test
  public void should_return_1994_when_give_MCMXCIV() {
    RomanToInteger romantoInteger = new RomanToInteger();
    Assert.assertEquals(1994, romantoInteger.romanToInt("MCMXCIV"));
  }
}
