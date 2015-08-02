package com.rentalcars.kata.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rentalcars.kata.BasicRomanNumeralGenerator;
import com.rentalcars.kata.RomanArabicLiteral;

/**
 * A very very basic API service exposing our Roman numeral converters.
 * 
 * Jersey is used as the implementation of JAX-RS.
 * 
 * This basic service does not perform checking the validity of the input
 * parameters, informing client about exceptional cases, supporting other return
 * such as JSON.
 * 
 * No dependencies on Spring REST or other third party libraries.
 * 
 * @author ahmad
 */
@Path("/api")
public class RomanNumeralService {

	BasicRomanNumeralGenerator basicRomanNumeralGenerator;
	
	public RomanNumeralService() {
		basicRomanNumeralGenerator = new BasicRomanNumeralGenerator();
	}
	
	/**
	 * Exceptional and error cases are ignored in this simple example.
	 */
	@GET
	@Path("ator/{arabic}")
	@Produces(MediaType.APPLICATION_XML)
	public Response convertArabicToRoman(@PathParam("arabic") int arabic) {
		
		String roman = basicRomanNumeralGenerator.generate(arabic);
		
		/**
		 * For simplicity and automatic generation of XML, i use the POJO
		 * initially not created for this purpose RomanArabicLiteral.
		 */
		RomanArabicLiteral result = new RomanArabicLiteral(arabic, roman);
		
		return Response.status(200).entity(result).build();
	}
	
	/**
	 * Exceptional and error cases are ignored in this simple example.
	 */
	@GET
	@Path("rtoa/{roman}")
	@Produces(MediaType.APPLICATION_XML)
	public Response convertRomanToArabic(@PathParam("roman") String roman) {
		
		int arabic = basicRomanNumeralGenerator.parse(roman);
		
		/**
		 * For simplicity and automatic generation of JSON, i use the POJO
		 * initially not created for this purpose RomanArabicLiteral.
		 */
		RomanArabicLiteral result = new RomanArabicLiteral(arabic, roman);
		
		return Response.status(200).entity(result).build();
	}
	
}