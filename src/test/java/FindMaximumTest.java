import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	
	@Test
	public void testMaxInteger_PresentAtFirstPosition_ShouldReturnTrue() {
		int number1 = 57, number2 = 23, number3 = 32;
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(number1, number2, number3);
		Assert.assertEquals(number1, max);
	}

	@Test
	public void testMaxInteger_PresentAtSecondPosition_ShouldReturnTrue() {
		int number1 = 57, number2 = 83, number3 = 32;
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(number1, number2, number3);
		Assert.assertEquals(number2, max);
	}
	
	@Test
	public void testMaxInteger_PresentAtThirdPosition_ShouldReturnTrue() {
		int number1 = 57, number2 = 23, number3 = 82;
		FindMaximum findMaximum = new FindMaximum();
		int max = findMaximum.getMaximum(number1, number2, number3);
		Assert.assertEquals(number3, max);
	}
}
