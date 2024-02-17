package in.ashokit.service;

import in.ashokit.dao.IUserDao;

public class UserServiceImpl implements UserService {
	
	private IUserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl:: 0-param :: Constructor");
	}
	
	public UserServiceImpl(IUserDao userDao) {
		System.out.println("UserServiceImpl:: param :: Constructor");
		this.userDao = userDao;
	}

	@Override
	public String getName(int id) {
		return userDao.findName(id);
	}

}
