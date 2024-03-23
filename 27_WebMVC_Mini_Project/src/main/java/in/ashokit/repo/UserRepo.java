package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmailAndPwd(String email, String pwd);

}
