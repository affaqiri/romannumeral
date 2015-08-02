package com.rentalcars.kata;

/**
 * This class is used to convert a Roman number to their equivalent Arabic
 * number in a fluent interface approach.
 * 
 * @author ahmad
 */
public class Roman extends BaseRomanArabic {

	private String roman;
	
	public Roman(String roman) {
		if (roman == null || roman.length() == 0) {
			throw new NumberFormatException("Empty string does not define a roman numeral.");
		}
		/**
		 * For clarity purposes, it is better to check for the validity of the
		 * Roman Numeral in constructor during the initial creation of the
		 * instance.
		 */
		if (!isValidRomanLiterals(roman)) {
			throw new NumberFormatException("Roman numeral contains invalid characters.");
		}
		this.roman = roman.toUpperCase();
	}
	
	/**
	 * This method suppose that the Roman numeral represented by this class is
	 * valid.
	 * 
	 * @return an Arabic representation of the Roman numeral represented by this
	 *         class.
	 */
	public int toArabic() {
		int arabic = 0;
		
		for (RomanArabicLiteral romanArabicSymbol : ROMAN_ARABIC_LITERALS) {
			while (roman.startsWith(romanArabicSymbol.getRoman())) {
				arabic += romanArabicSymbol.getArabic();
				roman = roman.substring(romanArabicSymbol.getRoman().length());
			}
		}
		
		return arabic;
	}
	
	/**
	 * Check whether the Roman Numeral contains valid Roman symbols. This is a
	 * basic syntactic check for valid characters.
	 */
	private boolean isValidRomanLiterals(String roman) {
		return roman != null && roman.toUpperCase().matches("[MDCLXVI]*");		
	}
	
	/**
	 * TODO checks the overall semantic validity of the Roman literal.
	 * 
	 * Example: XIXX should not be a valid Roman numeral.
	 */
	@SuppressWarnings("unused")
	private boolean isValidRomanNumeral(String roman) {
		return false;
	}
	
}