package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer ticketId);
	
	public List<Ticket> getTickets();

}
