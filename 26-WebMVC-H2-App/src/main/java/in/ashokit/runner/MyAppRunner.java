package in.ashokit.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Contact;
import in.ashokit.repo.ContactRepo;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	private ContactRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Contact c1 = new Contact();
		c1.setName("John");
		c1.setPhno(123456l);

		Contact c2 = new Contact();
		c2.setName("Smith");
		c2.setPhno(3223456l);

		repo.saveAll(Arrays.asList(c1, c2));

	}

}
