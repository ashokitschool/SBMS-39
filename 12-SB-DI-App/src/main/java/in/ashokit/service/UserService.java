package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public UserService() {
	}

	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getName(int id) {
		String findName = userDao.findName(id);
		System.out.println("Name ::" + findName);
	}

}
