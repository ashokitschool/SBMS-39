package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

	@Query("from Employee")
	public List<Employee> getAllEmpsHQL();

	@Query("from Employee where eid=:id")
	public Employee getEmpById(Integer id);
	
	@Query(value = "select * from employee", nativeQuery = true)
	public List<Employee> getAllEmpsSQL();

	// select * from employee where ename=:ename
	public List<Employee> findByEname(String ename);

	// select * from employee where esalary=:esalary
	public List<Employee> findByEsalary(Double salary);

	// select * from employee where esalary >= :esalary
	public List<Employee> findByEsalaryGreaterThanEqual(Double salary);
}
