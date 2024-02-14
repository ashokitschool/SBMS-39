package in.ashokit;

public class UserDao {
	
	public String getUserNameById(Integer id) {

		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else {
			return null;
		}

	}

}
