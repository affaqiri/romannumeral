package com.rentalcars.kata.api.client;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.rentalcars.kata.RomanArabicLiteral;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * A very simple jersey client for sending requests to server.
 * 
 * @author ahmad
 */
public class JerseyClient {

	public static void main(String[] args) throws Exception {
		callServiceAndOutputResult("http://localhost:9090/api/ator/4");
		callServiceAndOutputResult("http://localhost:9090/api/rtoa/III");
	}
	
	private static void callServiceAndOutputResult(String URI) throws JAXBException {
		Client client = Client.create();
		
		WebResource webResource = client.resource(URI);
		
		ClientResponse response = webResource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
		
		RomanArabicLiteral result = response.getEntity(RomanArabicLiteral.class);
		
		JAXBContext context = JAXBContext.newInstance(RomanArabicLiteral.class);
		Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    
	    m.marshal(result, System.out);
	}
	
}