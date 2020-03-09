import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

  @Test
  public void should_return_fl_when_give_flower_flow_flight() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] strs = new String[]{"flower", "flow", "flight"};
    Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
  }

  @Test
  public void should_return_empty_when_give_dog_racecar_car() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] strs = new String[]{"dog", "racecar", "car"};
    Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
  }

  @Test
  public void should_return_empty_when_give_ca_a() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] strs = new String[]{"ca", "a"};
    Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
  }

  @Test
  public void should_return_a_when_give_a() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] strs = new String[]{"a"};
    Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
  }
}
