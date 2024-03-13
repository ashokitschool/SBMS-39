package in.ashokit;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Person;
import in.ashokit.entity.PersonPK;

public interface PersonRepo extends JpaRepository<Person, PersonPK>{

}
