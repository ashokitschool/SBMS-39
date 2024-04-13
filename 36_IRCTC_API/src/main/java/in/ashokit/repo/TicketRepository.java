package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
