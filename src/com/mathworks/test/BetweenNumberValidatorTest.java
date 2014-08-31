package com.mathworks.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.mathworks.main.BetweenNumberValidator;
import com.mathworks.main.NumberValidator;

public class BetweenNumberValidatorTest {

	@Test
	public void shouldReturnTrueIfGivenNumberIsBetween5and10() {
		// given
		NumberValidator numberValidator = new BetweenNumberValidator(5, 10);
		int number = 6;

		// then
		assertTrue(numberValidator.isValid(number));
	}

	@Test
	public void shouldReturnFalseIfGivenNumberIsNotBetween5and10() {
		// given
		NumberValidator numberValidator = new BetweenNumberValidator(5, 10);
		int number = 2;

		// then
		assertFalse(numberValidator.isValid(number));
	}

}
