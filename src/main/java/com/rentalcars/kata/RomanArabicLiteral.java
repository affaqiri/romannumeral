package com.rentalcars.kata;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * This class represents a simple pair consisting of a Roman literal symbol and
 * its equivalent Arabic numeric value.
 * 
 * @author ahmad
 */
@XmlRootElement(name = "RomanNumeral")
public class RomanArabicLiteral {

	@XmlElement
	private int arabic;
	
	@XmlElement
	private String roman;
	
	/**
	 * Required by JAXB
	 */
	public RomanArabicLiteral() {
	}
	
	public RomanArabicLiteral(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}

	public int getArabic() {
		return arabic;
	}

	public String getRoman() {
		return roman;
	}
	
}