package com.mathworks.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mathworks.main.NumberValidator;
import com.mathworks.main.PrimeNumberValidator;

public class PrimeNumberValidatorTest {

	@Test
	public void shouldReturnTrueIfGivenNumberIs2() {
		// given
		NumberValidator numberValidator = new PrimeNumberValidator();
		int number = 2;

		// then
		assertTrue(numberValidator.isValid(number));
	}

	@Test
	public void shouldReturnTrueIfGivenNumberIs1() {
		// given
		NumberValidator numberValidator = new PrimeNumberValidator();
		int number = 1;

		// then
		assertFalse(numberValidator.isValid(number));
	}

	@Test
	public void shouldReturnTrueIfGivenNumberIsPrime() {
		// given
		NumberValidator numberValidator = new PrimeNumberValidator();
		int number = 13;

		// then
		assertTrue(numberValidator.isValid(number));
	}

	@Test
	public void shouldReturnFalseIfGivenNumberIsNotPrime() {
		// given
		NumberValidator numberValidator = new PrimeNumberValidator();
		int number = 15;

		// then
		assertFalse(numberValidator.isValid(number));
	}

}
