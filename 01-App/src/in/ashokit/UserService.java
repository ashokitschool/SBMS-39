package in.ashokit;

public class UserService{
	
	public void printUserName(Integer id) {
		
		UserDao dao = new UserDao();
		String uname = dao.getUserNameById(id);
		System.out.println(uname);
	}
}
