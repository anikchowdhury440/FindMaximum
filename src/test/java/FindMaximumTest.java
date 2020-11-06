import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	
	@Test
	public void testMaxInteger_PresentAtFirstPosition_ShouldReturnSameInteger() {
		Integer integer1 = 57, integer2 = 23, integer3 = 32;
		FindMaximum findMaximum = new FindMaximum();
		Integer max = findMaximum.getMaximum(integer1, integer2, integer3);
		Assert.assertEquals(integer1, max);
	}

	@Test
	public void testMaxInteger_PresentAtSecondPosition_ShouldReturnSameInteger() {
		Integer integer1 = 57, integer2 = 83, integer3 = 32;
		FindMaximum findMaximum = new FindMaximum();
		Integer max = findMaximum.getMaximum(integer1, integer2, integer3);
		Assert.assertEquals(integer2, max);
	}
	
	@Test
	public void testMaxInteger_PresentAtThirdPosition_ShouldReturnSameInteger() {
		Integer integer1 = 57, integer2 = 23, integer3 = 82;
		FindMaximum findMaximum = new FindMaximum();
		Integer max = findMaximum.getMaximum(integer1, integer2, integer3);
		Assert.assertEquals(integer3, max);
	}
	
	@Test
	public void testMaxFloat_PresentAtFirstPosition_ShouldReturnSameFloat() {
		Float float1 = 57.41f, float2 = 23.93f, float3 = 32.24f;
		FindMaximum findMaximum = new FindMaximum();
		Float max = findMaximum.getMaximum(float1, float2, float3);
		Assert.assertEquals(float1, max);
	}

	@Test
	public void testMaxFloat_PresentAtSecondPosition_ShouldReturnSameFloat() {
		Float float1 = 57.41f, float2 = 83.93f, float3 = 32.24f;
		FindMaximum findMaximum = new FindMaximum();
		Float max = findMaximum.getMaximum(float1, float2, float3);
		Assert.assertEquals(float2, max);
	}
	
	@Test
	public void testMaxFloat_PresentAtThirdPosition_ShouldReturnSameFloat() {
		Float float1 = 57.41f, float2 = 23.93f, float3 = 82.24f;
		FindMaximum findMaximum = new FindMaximum();
		Float max = findMaximum.getMaximum(float1, float2, float3);
		Assert.assertEquals(float3, max);
	}
}
