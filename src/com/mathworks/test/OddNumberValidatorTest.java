package com.mathworks.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.mathworks.main.NumberValidator;
import com.mathworks.main.OddNumberValidator;

public class OddNumberValidatorTest {

	@Test
	public void shouldReturnTrueIfGivenNumberIsOdd() {
		// given
		NumberValidator numberValidator = new OddNumberValidator();
		int number = 3;

		// then
		assertTrue(numberValidator.isValid(number));
	}

	@Test
	public void shouldReturnFalseIfGivenNumberIsEven() {
		// given
		NumberValidator numberValidator = new OddNumberValidator();
		int number = 4;

		// then
		assertFalse(numberValidator.isValid(number));
	}
}
