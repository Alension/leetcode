import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RecentCounterTest {

  @Test
  void should_1_when_1() {
    RecentCounter recentCounter = new RecentCounter();
    int number = recentCounter.ping(1);
    Assert.assertEquals(1, number);
  }

  @Test
  void should_2_when_1_100() {
    RecentCounter recentCounter = new RecentCounter();
    recentCounter.ping(1);
    int number = recentCounter.ping(100);
    Assert.assertEquals(2, number);
  }

  @Test
  void should_3_when_1_100_3001() {
    RecentCounter recentCounter = new RecentCounter();
    recentCounter.ping(1);
    recentCounter.ping(100);
    int number = recentCounter.ping(3001);
    Assert.assertEquals(3, number);
  }

  @Test
  void should_3_when_1_100_3001_3002() {
    RecentCounter recentCounter = new RecentCounter();
    recentCounter.ping(1);
    recentCounter.ping(100);
    recentCounter.ping(3001);
    int number = recentCounter.ping(3002);
    Assert.assertEquals(3, number);
  }
}
