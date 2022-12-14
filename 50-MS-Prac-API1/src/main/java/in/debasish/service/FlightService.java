package in.debasish.service;

import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.debasish.binding.Flights;

@Service
public class FlightService {

	String endPoint = "http://mu.mulesoft-training.com/essentials/united/flights/";

	RestTemplate rt = new RestTemplate();

	// CASE 1
	public void getFlight1() {

		ResponseEntity<String> responseEntity = rt.getForEntity(endPoint, String.class);
		String body = responseEntity.getBody();
		System.out.println(body);

	}
	// CASE 2
	public void getFlight2() {

		HttpHeaders header=new HttpHeaders();
		header.add("Accept", "application/json");
		HttpEntity entity=new HttpEntity<>(header);
		ResponseEntity<Flights> re=rt.exchange(endPoint, HttpMethod.GET, entity, Flights.class);
		Flights body = re.getBody();
		System.out.println(body);
	}
	
}
