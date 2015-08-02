package com.rentalcars.kata;

/**
 * A basic implementation of the RomanNumeralGenerator using the fluent API
 * interface approach delegating the real conversion to @class RomanConverters
 * and its related classes.
 * 
 * @author ahmad
 */
public class BasicRomanNumeralGenerator implements RomanNumeralGenerator {

	public String generate(int arabic) {
		return RomanConverters.convert(arabic).toRoman();
	}

	public int parse(String roman) {
		return RomanConverters.convert(roman).toArabic();
	}

}