package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Service.TicketBookingService;
import in.ashokit.reqBinding.Passenger;
import in.ashokit.resBinding.Ticket;

@RestController
public class TrainController {
	
	@Autowired
	private TicketBookingService service;

	@PostMapping(value = "/book",
			produces = {"application/json","application/xml"},
			consumes = {"application/json","application/xml"})
	public ResponseEntity<Ticket> bookedTicked(@RequestBody Passenger passenger){
	
		
		Ticket bookTicket = service.bookTicket(passenger);
		System.out.println(bookTicket);
		return new ResponseEntity<>(bookTicket,HttpStatus.CREATED);
	}
}
