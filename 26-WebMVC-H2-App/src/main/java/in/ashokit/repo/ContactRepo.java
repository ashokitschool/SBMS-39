package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
