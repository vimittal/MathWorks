package com.mathworks.main;

public class PrimeNumberValidator implements NumberValidator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathworks.main.NumberValidator#isValid(int)
	 */
	@Override
	public boolean isValid(int number) {
		if (number == 1)
			return false;
		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
