package com.mathworks.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.mathworks.main.BetweenNumberValidator;
import com.mathworks.main.NumberFinder;
import com.mathworks.main.NumberValidator;
import com.mathworks.main.OddNumberValidator;
import com.mathworks.main.PrimeNumberValidator;

public class NumberFinderTest {

	@Test
	public void shouldReturnListOfPrimeNumbersFromGivenNumbers() {
		// given
		PrimeNumberValidator validator = new PrimeNumberValidator();
		NumberFinder primeNumbersFinder = new NumberFinder(
				new NumberValidator[] { validator });
		int[] givenNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15 };
		int[] expected = { 2, 3, 5, 7, 11, 13 };

		// when
		int[] actual = primeNumbersFinder.getNumbers(givenNumbers);

		// then
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldReturnListOfOddNumbersFromGivenNumbers() {
		// given
		OddNumberValidator validator = new OddNumberValidator();
		NumberFinder primeNumbersFinder = new NumberFinder(
				new NumberValidator[] { validator });
		int[] givenNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15 };
		int[] expected = { 1, 3, 5, 7, 9, 11, 13, 15 };

		// when
		int[] actual = primeNumbersFinder.getNumbers(givenNumbers);

		// then
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldReturnListOfOddPrimeNumbersFromGivenNumbers() {
		// given
		PrimeNumberValidator primeNumberValidator = new PrimeNumberValidator();
		OddNumberValidator oddNumberValidator = new OddNumberValidator();
		NumberFinder primeNumbersFinder = new NumberFinder(
				new NumberValidator[] { primeNumberValidator,
						oddNumberValidator });
		int[] givenNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15 };
		int[] expected = { 3, 5, 7, 11, 13 };

		// when
		int[] actual = primeNumbersFinder.getNumbers(givenNumbers);

		// then
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldReturnListOfNumbersBetween5and10FromGivenNumbers() {
		// given
		NumberValidator validator = new BetweenNumberValidator(5, 10);
		NumberFinder primeNumbersFinder = new NumberFinder(
				new NumberValidator[] { validator });
		int[] givenNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15 };
		int[] expected = { 5, 6, 7, 8, 9, 10 };

		// when
		int[] actual = primeNumbersFinder.getNumbers(givenNumbers);

		// then
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldReturnListOfOddPrimeNumbersBetween2and31FromGivenNumbers() {
		// given
		BetweenNumberValidator betweenNumberValidator = new BetweenNumberValidator(
				2, 31);
		PrimeNumberValidator primeNumberValidator = new PrimeNumberValidator();
		OddNumberValidator oddNumberValidator = new OddNumberValidator();
		NumberFinder primeNumbersFinder = new NumberFinder(
				new NumberValidator[] { betweenNumberValidator,
						primeNumberValidator, oddNumberValidator });
		int[] givenNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 34, 35 };
		int[] expected = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };

		// when
		int[] actual = primeNumbersFinder.getNumbers(givenNumbers);

		// then
		assertArrayEquals(expected, actual);
	}

}
