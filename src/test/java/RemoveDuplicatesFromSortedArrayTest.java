import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

  @Test
  public void should_return_2_when_give_112() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    final int[] nums = {1, 1, 2};
    Assert.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
  }

  @Test
  public void should_return_5_when_give_0011122334() {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    final int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    Assert.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(3, nums[3]);
    Assert.assertEquals(4, nums[4]);
  }

  @Test
  public void should_return_1_when_give_11() {
    int[] nums = {1, 1};
    Assert.assertEquals(1, new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    Assert.assertEquals(1, nums[0]);
  }
}
