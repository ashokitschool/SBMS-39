package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.PersonRepo;
import in.ashokit.entity.Person;
import in.ashokit.entity.PersonPK;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	public void getPerson() {

		PersonPK pks = new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("JIKJ2135YU");

		Optional<Person> findById = personRepo.findById(pks);

		if (findById.isPresent()) {
			Person person = findById.get();
			System.out.println(person);
		}

	}

	public void savePerson() {

		PersonPK pks = new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("JIKJ2135YU");

		Person p = new Person();
		p.setName("Ashok");
		p.setGender("Male");
		p.setEmail("ashok@gmail.com");

		// setting primary keys
		p.setPersonPk(pks);

		personRepo.save(p);

		System.out.println("person saved...");
	}

}
