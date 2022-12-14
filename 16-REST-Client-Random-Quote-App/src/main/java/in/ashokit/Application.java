package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.QuoteResponse;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		String url="https://quoters.apps.pcfone.io/api/random";
		
		RestTemplate temp=new RestTemplate();
		
		/*
		 * ResponseEntity<String> responseEntity = temp.getForEntity(url, String.class);
		 * String body = responseEntity.getBody(); System.out.println(body);
		 */
		 
		
		
		  ResponseEntity<QuoteResponse> responseEntity = temp.getForEntity(url,QuoteResponse.class);
		  QuoteResponse response = responseEntity.getBody();
		  System.out.println(response);
		 
	
	}

}
