package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;
import in.ashokit.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EmailUtils emailUtils;

	@Override
	public boolean saveUser(User user) {
		User savedUser = userRepo.save(user);
		if (savedUser.getUid() != null) {
			String subject = "Your Account Created - Ashok IT";
			String body = "<h1>Congratulations, welcome to board..</h1>";
			emailUtils.sendEmail(user.getEmail(), subject, body);
		}
		return true;
	}

	@Override
	public User getUser(String email, String pwd) {
		return userRepo.findByEmailAndPwd(email, pwd);
	}

}
