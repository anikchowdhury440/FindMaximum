import java.util.Arrays;

public class FindMaximum<E extends Comparable<E>> {
	
	E[] values;
	
	public FindMaximum(E ...values) {
		this.values = values;
	}
	
	public static <E extends Comparable<E>> E getMaximum(E[] values) {
		Arrays.sort(values);
		int size = values.length;
		E max = values[size-1];
		printMax(values, max);
		return max;	
	}
	
	public E getMaximum() {
		return FindMaximum.getMaximum(values);
	}
	
	public static <E> void printMax(E[] values, E max) {
		System.out.print("Maximum of ");
		for(E value: values) {
			System.out.print(value + " ");
		}
		System.out.println("is " + max);
	}
}
