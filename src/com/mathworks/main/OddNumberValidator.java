package com.mathworks.main;

public class OddNumberValidator implements NumberValidator {

	@Override
	public boolean isValid(int number) {
		if (number % 2 == 0)
			return false;
		return true;
	}

}
