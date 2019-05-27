package example;

public class Example {
	public int increase(int value) {
		if (value == Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Can't increase MAX_VALUE");
		}
		return ++value;
	}

	public int negate(int value) throws Exception {
		if (value == Integer.MIN_VALUE) {
			throw new Exception("Can't negate MIN_VALUE");
		}
		return -value;
	}

	/**
	 * Get the largest value in an array
	 * 
	 * @param values an array of int
	 * @return its largest value
	 * 
	 * @throws IllegalArgumentException
	 */
	public int largestValue(int[] values) {
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException("xxx");
		}

		int value = values[0];
		for(int i = 1; i < values.length; i++) {
			if(values[i] > value) {
				value = values[i];
			}
		}

		return value;
	}
	
	/**
	 * Find the max product between a couple of values
	 *  in array 
	 * 
	 * Ex: [1,2,3] -> 6
	 * 	   [1,3,1,2] -> 6
	 * 	   [-2,3,1,2] -> 6
	 * 
	 * @param values an array
	 * @return the largest product
	 * 
	 * @throws IllegalArgumentException
	 * 				if not enough values in input
	 */
	public int largestMultCouple(int[] values) {
		
		return Integer.MIN_VALUE;
	}
}
