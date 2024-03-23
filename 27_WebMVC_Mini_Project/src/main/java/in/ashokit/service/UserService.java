package in.ashokit.service;

import in.ashokit.entity.User;

public interface UserService {
	
	public boolean saveUser(User user);
	
	public User getUser(String email, String pwd);

}
