package com.rentalcars.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * A base class for storing common data structure for the arabic and roman
 * subclasses.
 * 
 * @author ahmad
 */
public class BaseRomanArabic {

	/**
	 * A simple static non modifiable list for storing roman literal symbols and
	 * their equivalent arabic value.
	 * 
	 * Beside storing the basic single character symbols such as M, D, C, L,
	 * etc. it is better to include in this list combined symbols such as CM,
	 * CD, XC, etc. this will help us write simple algorithms and avoid
	 * unnecessary checks in code to see whether we should add or subtract (in
	 * case of these combined symbols) values during the transformations. These
	 * combined numbers are very limited so for the sake of simplicity and
	 * clarity, it is better to add them in our data structure rather dealing
	 * with them in our algorithm.
	 */
	@SuppressWarnings("serial")
	protected static final List<RomanArabicLiteral> ROMAN_ARABIC_LITERALS = new ArrayList<RomanArabicLiteral>() {		
		{
			add(new RomanArabicLiteral(1000, "M"));
			add(new RomanArabicLiteral(900, "CM"));
			add(new RomanArabicLiteral(500, "D"));
			add(new RomanArabicLiteral(400, "CD"));
			add(new RomanArabicLiteral(100, "C"));
			add(new RomanArabicLiteral(90, "XC"));
			add(new RomanArabicLiteral(50, "L"));
			add(new RomanArabicLiteral(40, "XL"));
			add(new RomanArabicLiteral(10, "X"));
			add(new RomanArabicLiteral(9, "IX"));
			add(new RomanArabicLiteral(5, "V"));
			add(new RomanArabicLiteral(4, "IV"));
			add(new RomanArabicLiteral(1, "I"));
		}
	};
	
}