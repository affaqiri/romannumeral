package com.rentalcars.kata;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.rentalcars.kata.RomanConverters.*;

public class RomanConvertersTest {
	
	@Test
	public void convertToRomanNumerals() {
		assertEquals("I", convert(1).toRoman());
		assertEquals("II", convert(2).toRoman());
		assertEquals("III", convert(3).toRoman());
		assertEquals("IV", convert(4).toRoman());
		assertEquals("V", convert(5).toRoman());
		assertEquals("VI", convert(6).toRoman());
		assertEquals("X", convert(10).toRoman());
		assertEquals("XIX", convert(19).toRoman());
		
		assertEquals("MMMCMXCIX", convert(3999).toRoman());
	}
	
	@Test
	public void convertToArabicNumbers() {
		assertEquals(1, convert("I").toArabic());
		assertEquals(2, convert("II").toArabic());
		assertEquals(3, convert("IiI").toArabic());
		assertEquals(4, convert("IV").toArabic());
		assertEquals(5, convert("V").toArabic());
		assertEquals(6, convert("Vi").toArabic());
		assertEquals(10, convert("X").toArabic());
		assertEquals(19, convert("XIX").toArabic());
		
		assertEquals(3999, convert("MMMCMXCIX").toArabic());
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInvalidCharactersInRomanLiteral() {
		convert("LOL");
	}
	
	@Test(expected = NumberFormatException.class)
	public void convertEmptyStringToArabicNumber() {
		convert("");
	}
	
	@Test(expected = NumberFormatException.class)
	public void convertNullToArabicNumber() {
		convert(null);
	}
	
	@Test (expected = NumberFormatException.class)
	public void convertNegativeNumberToRomanNumeral() {
		convert(-1);
	}
	
	@Test (expected = NumberFormatException.class)
	public void convertZeroToRomanNumeral() {
		convert(0);
	}
	
	@Test (expected = NumberFormatException.class)
	public void convertOutOfRangeNumberToRomanNumeral() {
		convert(4000);
	}
	
}