
public class FindMaximum<E extends Comparable<E>> {
	
	E value1, value2, value3;
	
	public FindMaximum(E value1, E value2, E value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
	public static <E extends Comparable<E>> E getMaximum(E value1, E value2, E value3) {
		E max = value1;
		if(value2.compareTo(max) > 0) {
			max = value2;
		}
		if(value3.compareTo(max) > 0) {
			max = value3;
		}
		return max;
	}
	
	public E getMaximum() {
		return FindMaximum.getMaximum(value1, value2, value3);
	}
}
