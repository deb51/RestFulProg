package in.debasish.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

	public String getQuoat() {
		String endPoint = "https://quoters.apps.pcfone.io/api/random";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity(endPoint, String.class);
		String body = responseEntity.getBody();

		return body;
	}
}
