package in.ashokit.dao;

public class UserDaoImpl implements IUserDao {
	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl::Constructor");
	}

	@Override
	public String findName(int id) {

		// db logic comes here

		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		}

		return null;
	}

}
