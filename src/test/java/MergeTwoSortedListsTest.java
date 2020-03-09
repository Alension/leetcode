import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

  @Test
  public void should_return_112334_when_give_124_134() {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);
    final ListNode result = mergeTwoSortedLists.mergeTwoLists(l1, l2);
    Assert.assertEquals(1, result.val);
    Assert.assertEquals(1, result.next.val);
    Assert.assertEquals(2, result.next.next.val);
    Assert.assertEquals(3, result.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.val);
    Assert.assertEquals(4, result.next.next.next.next.next.val);
  }
}
