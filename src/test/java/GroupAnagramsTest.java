import java.util.List;
import org.junit.Test;

public class GroupAnagramsTest {

  @Test
  public void groupAnagrams_test() {
    GroupAnagrams groupAnagrams = new GroupAnagrams();
    final String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    final List<List<String>> lists = groupAnagrams.groupAnagrams(strs);
    System.out.println(lists);
  }
}
