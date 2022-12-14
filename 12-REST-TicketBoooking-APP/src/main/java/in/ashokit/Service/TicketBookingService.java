package in.ashokit.Service;

import org.springframework.stereotype.Service;

import in.ashokit.reqBinding.Passenger;
import in.ashokit.resBinding.Ticket;

@Service
public class TicketBookingService {

	public Ticket bookTicket(Passenger passenger) {
		
		System.out.println(passenger);
		
		Ticket ticket=new Ticket();
		ticket.setPnr(56544654);
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTocketAmount(1444.50);
		
		
		return ticket;
		
	}
	
}
