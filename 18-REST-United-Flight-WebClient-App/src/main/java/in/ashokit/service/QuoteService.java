package in.ashokit.service;

import java.util.function.Consumer;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.Disposable;

@Service
public class QuoteService {

	public void getSyncQuote() {
		String url = "https://quoters.apps.pcfone.io/api/random";
		WebClient client = WebClient.create();
		   String block = client.get()
								.uri(url)
								.accept(MediaType.APPLICATION_JSON)
								.retrieve()
								.bodyToMono(String.class)
								.block();

		System.out.println(block);
	}

	public void getAsyncQuote() {
		String url = "https://quoters.apps.pcfone.io/api/random";
		WebClient client = WebClient.create();
		Disposable subscribe = client.get()
				.uri(url)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class)
				.subscribe(System.out::println);
		System.out.println("Request Sent...");

		
	}

}
