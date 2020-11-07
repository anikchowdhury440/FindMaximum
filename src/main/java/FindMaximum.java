
public class FindMaximum<E extends Comparable<E>> {
	
	E[] values;
	
	public FindMaximum(E ...values) {
		this.values = values;
	}
	
	public static <E extends Comparable<E>> E getMaximum(E[] values) {
		
		E max = values[0];
		for(E value : values) {
			if(value.compareTo(max) > 0) {
				max = value;
			}
		}
		return max;
	}
	
	public E getMaximum() {
		return FindMaximum.getMaximum(values);
	}
}
