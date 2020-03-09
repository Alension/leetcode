import java.util.LinkedList;
import java.util.Queue;

/**
 * @author alen
 */
public class RecentCounter {

  Queue<Integer> queue;

  public RecentCounter() {
    queue = new LinkedList<>();
  }

  public int ping(int t) {
    queue.add(t);
    assert queue.peek() != null;
    if (queue.peek() < t - 3000) {
      queue.poll();
    }
    return queue.size();
  }
}
