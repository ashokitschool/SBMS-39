package in.ashokit.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MsgServiceTest {
	
	@Autowired
	private MsgService service;
	
	@Test
	public void testWelcome() {
		String welcomeMsg = service.getWelcomeMsg();
		assertNotNull(welcomeMsg);
	}
	
	@Test
	public void testGreet() {
		String greetMsg = service.getGreetMsg();
		assertNotNull(greetMsg);
	}

}
