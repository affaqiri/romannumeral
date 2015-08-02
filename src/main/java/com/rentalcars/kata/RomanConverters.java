package com.rentalcars.kata;

public class RomanConverters {

	public static Arabic convert(int arabic) {
		return new Arabic(arabic);
	}
	
	public static Roman convert(String roman) {
		return new Roman(roman);
	}
	
}