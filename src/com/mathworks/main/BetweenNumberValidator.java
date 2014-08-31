package com.mathworks.main;

public class BetweenNumberValidator implements NumberValidator {

	private int end;
	private int start;

	public BetweenNumberValidator(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public boolean isValid(int number) {
		return number >= start && number <= end;
	}

}
