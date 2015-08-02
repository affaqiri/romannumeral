package com.rentalcars.kata;

/**
 * This class is used to convert an Arabic number to their equivalent Roman
 * numeral in a fluent interface approach.
 * 
 * @author ahmad
 */
public class Arabic extends BaseRomanArabic {

	private int arabic;
	
	public Arabic(int arabic) {
		if (arabic < 1) {
			throw new NumberFormatException("Only positive numbers are supported in roman numeral.");
		}
		if (arabic > 3999) {
			throw new NumberFormatException("Numbers greater than 3999 are not supported in roman numeral.");
		}
		this.arabic = arabic;
	}
	
	public String toRoman() {
		StringBuilder romanStringBuilder = new StringBuilder();
		
		for (RomanArabicLiteral romanArabicSymbol : ROMAN_ARABIC_LITERALS) {
			while (arabic >= romanArabicSymbol.getArabic()) {
				romanStringBuilder.append(romanArabicSymbol.getRoman());
				arabic -= romanArabicSymbol.getArabic();
			}
		}
		
		return romanStringBuilder.toString();
	}

}