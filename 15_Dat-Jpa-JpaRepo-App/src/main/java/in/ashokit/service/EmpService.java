package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;

	public EmpService(EmpRepo repo) {
		this.empRepo = repo;
	}

	public void getAllEmps() {
		List<Employee> emps = empRepo.findAll();
		emps.forEach(e -> System.out.println(e));
	}
	
	public void getAllEmpsSort() {
		
		Sort sort = Sort.by("esalary").descending();
		
		List<Employee> emps = empRepo.findAll(sort);
		
		emps.forEach(e -> System.out.println(e));
		
	}

}







