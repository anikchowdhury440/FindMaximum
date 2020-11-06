import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	
	@Test
	public void testMaxInteger_PresentAtFirstPosition_ShouldReturnSameInteger() {
		int integer1 = 57, integer2 = 23, integer3 = 32;
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(integer1, integer2, integer3);
		Assert.assertEquals(integer1, max);
	}

	@Test
	public void testMaxInteger_PresentAtSecondPosition_ShouldReturnSameInteger() {
		int integer1 = 57, integer2 = 83, integer3 = 32;
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(integer1, integer2, integer3);
		Assert.assertEquals(integer2, max);
	}
	
	@Test
	public void testMaxInteger_PresentAtThirdPosition_ShouldReturnSameInteger() {
		int integer1 = 57, integer2 = 23, integer3 = 82;
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(integer1, integer2, integer3);
		Assert.assertEquals(integer3, max);
	}
}
