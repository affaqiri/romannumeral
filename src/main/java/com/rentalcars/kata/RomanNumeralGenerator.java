package com.rentalcars.kata;

public interface RomanNumeralGenerator {

	/**
	 * Converts an Arabic numeric to its Roman string equivalent.
	 */
	public String generate(int arabic);
	
	/**
	 * Converts a Roman numeral string to its Arabic numeric equivalent.
	 */
	public int parse(String roman);

}