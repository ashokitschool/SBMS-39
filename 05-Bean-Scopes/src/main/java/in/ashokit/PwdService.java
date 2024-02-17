package in.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService() {
		System.out.println("PwdService :: Constructor");
	}

	public String encodePwd(String pwd) {

		Encoder encoder = Base64.getEncoder();

		byte[] encodedPwd = encoder.encode(pwd.getBytes());

		return new String(encodedPwd);
	}
}
