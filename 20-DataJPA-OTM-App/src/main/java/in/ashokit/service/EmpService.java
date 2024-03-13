package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private AddrRepo addrRepo;

	public void deleteEmp() {
		empRepo.deleteById(1); // childs + parent
	}

	public void getAddress() {
		addrRepo.findById(1); // child + parent
	}

	public void getEmp() {
		Optional<Emp> findById = empRepo.findById(1); // only parent
		if (findById.isPresent()) {
			Emp emp = findById.get();
			List<Address> addrList = emp.getAddrList();
		}
	}

	public void saveEmployee() {

		Emp e = new Emp();
		e.setEname("Orlen");
		e.setEsal(12000.00);

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setCountry("India");
		a1.setType("Present");

		Address a2 = new Address();
		a2.setCity("GNT");
		a2.setState("AP");
		a2.setCountry("India");
		a2.setType("Permanent");

		// association
		a1.setEmp(e); // setting parent to child
		a2.setEmp(e); // setting parent to child

		e.setAddrList(Arrays.asList(a1, a2)); // setting childs to parent

		// save parent record
		empRepo.save(e); // parent + childs

	}

}
