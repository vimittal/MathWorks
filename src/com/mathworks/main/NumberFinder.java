package com.mathworks.main;

import java.util.ArrayList;

public class NumberFinder {

	private NumberValidator[] validators;

	public NumberFinder(NumberValidator[] validators) {
		this.validators = validators;
	}

	public int[] getNumbers(int[] givenNumbers) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int number : givenNumbers) {
			boolean isValid = true;
			for (NumberValidator validator : validators)
				if (!validator.isValid(number)) {
					isValid = false;
					break;
				}
			if (isValid)
				result.add(number);
		}
		return convertIntegers(result);
	}

	public static int[] convertIntegers(ArrayList<Integer> integers) {
		int[] ret = new int[integers.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = integers.get(i).intValue();
		}
		return ret;
	}
}
