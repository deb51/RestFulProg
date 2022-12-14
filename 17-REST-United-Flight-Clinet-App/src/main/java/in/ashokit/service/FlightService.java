package in.ashokit.service;

import java.awt.PageAttributes.MediaType;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Flight;
import in.ashokit.binding.Flights;

@Service
public class FlightService {

	public void getUnitedFlight() {
		RestTemplate rt = new RestTemplate();

		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";

		// APPROACH 1

		/*
		 * ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		 * String body = responseEntity.getBody(); System.out.println(body);
		 */

		// APPROACH 2
		/*
		 * ResponseEntity<Flights> responseEntity = rt.getForEntity(url, Flights.class);
		 * Flights body = responseEntity.getBody(); List<Flight> flights
		 * =body.getFlights();
		 * 
		 * System.out.println(flights);
		 */

		// APPROACH 3

		
		  HttpHeaders headers = new HttpHeaders(); //
		 // headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		  headers.add("Accept", "application/json");
		  
		  HttpEntity entity = new HttpEntity<>(headers);
		  
		  ResponseEntity<Flights> responseEntity = rt.exchange(url, HttpMethod.GET, entity, Flights.class); 
		  Flights body = responseEntity.getBody();
		  
		  System.out.println(body);
		 

	}
}
