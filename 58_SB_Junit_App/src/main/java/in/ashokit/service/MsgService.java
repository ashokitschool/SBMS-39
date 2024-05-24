package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String msg = "Welcome to Ashok IT";
		return msg;
	}

	public String getGreetMsg() {
		String msg = "Good Morning..!!";
		return msg;
	}

}
