package in.ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.reqBinding.TicketRequestBinding;
import in.ashokit.resBinding.TicketResponseBinding;

@Service
public class TicketBookingService {

	
	public void bookTicket() {
		TicketRequestBinding ticketInput=new TicketRequestBinding("15/11/2021", "Debasish", "BBS", "Das", "NDLS");
		
		WebClient client=WebClient.create();
		
	    TicketResponseBinding block = client.post()
											.uri("http://localhost:9090/book")
											.accept(MediaType.APPLICATION_JSON)
											.body(BodyInserters.fromValue(ticketInput))
											.retrieve()
											.bodyToMono(TicketResponseBinding.class)
											.block();
											
											
											
		System.out.println(block);
		
		
	}
}
