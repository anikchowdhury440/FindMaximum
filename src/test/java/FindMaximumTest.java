import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
	
	@Test
	public void testMaxInteger_PresentAtFirstPosition_ShouldReturnSameInteger() {
		Integer integer1 = 57, integer2 = 23, integer3 = 32;
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integer1, integer2, integer3);
		Integer max = findMaximum.getMaximum();
		Assert.assertEquals(integer1, max);
	}

	@Test
	public void testMaxInteger_PresentAtSecondPosition_ShouldReturnSameInteger() {
		Integer integer1 = 57, integer2 = 83, integer3 = 32;
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integer1, integer2, integer3);
		Integer max = findMaximum.getMaximum();
		Assert.assertEquals(integer2, max);
	}
	
	@Test
	public void testMaxInteger_PresentAtThirdPosition_ShouldReturnSameInteger() {
		Integer integer1 = 57, integer2 = 23, integer3 = 82;
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(integer1, integer2, integer3);
		Integer max = findMaximum.getMaximum();
		Assert.assertEquals(integer3, max);
	}
	
	@Test
	public void testMaxFloat_PresentAtFirstPosition_ShouldReturnSameFloat() {
		Float float1 = 57.41f, float2 = 23.93f, float3 = 32.24f;
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(float1, float2, float3);
		Float max = findMaximum.getMaximum();
		Assert.assertEquals(float1, max);
	}

	@Test
	public void testMaxFloat_PresentAtSecondPosition_ShouldReturnSameFloat() {
		Float float1 = 57.41f, float2 = 83.93f, float3 = 32.24f;
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(float1, float2, float3);
		Float max = findMaximum.getMaximum();
		Assert.assertEquals(float2, max);
	}
	
	@Test
	public void testMaxFloat_PresentAtThirdPosition_ShouldReturnSameFloat() {
		Float float1 = 57.41f, float2 = 23.93f, float3 = 82.24f;
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(float1, float2, float3);
		Float max = findMaximum.getMaximum();
		Assert.assertEquals(float3, max);
	}
	
	@Test
	public void testMaxString_PresentAtFirstPosition_ShouldReturnSameString() {
		String string1 = "Peach", string2 = "Banana", string3 = "Apple";
		FindMaximum<String> findMaximum = new FindMaximum<String>(string1, string2, string3);
		String max = findMaximum.getMaximum();
		Assert.assertEquals(string1, max);
	}
	
	@Test
	public void testMaxString_PresentAtSecondPosition_ShouldReturnSameString() {
		String string1 = "Banana", string2 = "Peach", string3 = "Apple";
		FindMaximum<String> findMaximum = new FindMaximum<String>(string1, string2, string3);
		String max = findMaximum.getMaximum();
		Assert.assertEquals(string2, max);
	}
	
	@Test
	public void testMaxString_PresentAtThirdPosition_ShouldReturnSameString() {
		String string1 = "Banana", string2 = "Apple", string3 = "Peach";
		FindMaximum<String> findMaximum = new FindMaximum<String>(string1, string2, string3);
		String max = findMaximum.getMaximum();
		Assert.assertEquals(string3, max);
	}
	
	@Test
	public void testMaxInteger_PassingNIntegerParamter_ShouldReturnMaxInteger() {
		FindMaximum<Integer> findMaximum = new FindMaximum<Integer>(10, 30, 50, 20, 40);
		Integer expectedMax = 50;
		Integer max = findMaximum.getMaximum();
		Assert.assertEquals(expectedMax, max);
	}
	
	@Test
	public void testMaxFloat_PassingNFloatParamter_ShouldReturnMaxFloat() {
		FindMaximum<Float> findMaximum = new FindMaximum<Float>(10.2f, 30.6f, 20.5f, 50.1f, 80.4f, 11.6f);
		Float expectedMax = 80.4f;
		Float max = findMaximum.getMaximum();
		Assert.assertEquals(expectedMax, max);
	}
	
	@Test
	public void testMaxString_PassingNStringParamter_ShouldReturnMaxString() {
		FindMaximum<String> findMaximum = new FindMaximum<String>("Apple","Banana", "Peach", "Orange");
		String expectedMax = "Peach";
		String max = findMaximum.getMaximum();
		Assert.assertEquals(expectedMax, max);
	}
}
