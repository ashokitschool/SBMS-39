package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping(
			value = "/ticket",
			consumes = "application/json",
			produces = "application/json"
	)
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p){
		Ticket ticket = service.bookTicket(p);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(
			value="ticket/{tid}",
			produces = "application/json"
	)
	public ResponseEntity<Ticket> getTicket(@PathVariable("tid") Integer tid){
		Ticket t = service.getTicket(tid);
		return new ResponseEntity<>(t, HttpStatus.OK);
	}

	@GetMapping(
			value="/tickets",
			produces = "application/json"
	)
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> tickets = service.getTickets();
		return new ResponseEntity<>(tickets, HttpStatus.OK);
	}
	
}









