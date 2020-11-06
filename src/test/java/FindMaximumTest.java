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
	
	@Test
	public void testMaxString_PresentAtFirstPosition_ShouldReturnSameString() {
		String string1 = "Peach", string2 = "Banana", string3 = "Apple";
		FindMaximum findMaximum = new FindMaximum();
		String max = findMaximum.getMaximum(string1, string2, string3);
		Assert.assertEquals(string1, max);
	}
	
	@Test
	public void testMaxString_PresentAtSecondPosition_ShouldReturnSameString() {
		String string1 = "Banana", string2 = "Peach", string3 = "Apple";
		FindMaximum findMaximum = new FindMaximum();
		String max = findMaximum.getMaximum(string1, string2, string3);
		Assert.assertEquals(string2, max);
	}
	
	@Test
	public void testMaxString_PresentAtThirdPosition_ShouldReturnSameString() {
		String string1 = "Banana", string2 = "Apple", string3 = "Peach";
		FindMaximum findMaximum = new FindMaximum();
		String max = findMaximum.getMaximum(string1, string2, string3);
		Assert.assertEquals(string3, max);
	}
}
