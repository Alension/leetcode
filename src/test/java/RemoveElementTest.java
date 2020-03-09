import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

  @Test
  public void should_return_22_when_give_3223_3() {
    int[] nums = {3, 2, 2, 3};
    Assert.assertEquals(2, new RemoveElement().removeElement(nums, 3));
    Assert.assertEquals(2, nums[0]);
    Assert.assertEquals(2, nums[1]);
  }

  @Test
  public void should_return_0134_when_give_01223042_2() {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    Assert.assertEquals(5, new RemoveElement().removeElement(nums, 2));
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(4, nums[4]);
  }
}
