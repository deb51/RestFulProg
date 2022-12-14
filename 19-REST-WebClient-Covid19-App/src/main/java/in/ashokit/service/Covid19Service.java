package in.ashokit.service;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Covid19Response;
import in.ashokit.binding.CovidData;

@Service
public class Covid19Service {

	public void getCovidDataInString() {
	WebClient client = WebClient.create();
	
					  CovidData[] response = client.get()
										 .uri("https://covid-19-data.p.rapidapi.com/country/code?code=IN")
										 .header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
										 .header("x-rapidapi-key", "65e5e3963bmshfb870ccb39cd843p197c9ejsncc8f71057421")
										 .retrieve()
										 .bodyToMono(CovidData[].class)
										 .block();
					
					Stream.of(response).forEach(System.out::println);
					
	}
	
	public void getCovidDataInBinding() {
	WebClient client2 = WebClient.create();
	
				String block    = client2.get()
										 .uri("https://covid-19-data.p.rapidapi.com/country/code?code=IN")
										 .header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
										 .header("x-rapidapi-key", "65e5e3963bmshfb870ccb39cd843p197c9ejsncc8f71057421")
										 .retrieve()
										 .bodyToMono(String.class)
										 .block();
					
					System.out.println(block);
					
	}
}
