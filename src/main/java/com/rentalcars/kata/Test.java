package com.rentalcars.kata;

class Test {

	public static void main(String[] args) {
		BasicRomanNumeralGenerator basicRomanNumeralGenerator = new BasicRomanNumeralGenerator();
		
		long startTime = System.currentTimeMillis();

		for (int i = 1; i < 3999; i++) {
			System.out.println(i + " --> " + basicRomanNumeralGenerator.generate(i));
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Conversion operation took : " + (endTime - startTime) + " ms.");
	}

}