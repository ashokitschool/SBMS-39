package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Customer;
import in.ashokit.repo.CustomerRepo;
import in.ashokit.service.JwtService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private CustomerRepo crepo;

	@Autowired
	private PasswordEncoder pwdEncoder;

	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JwtService jwt;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to ashokit";
	}

	@PostMapping("/login")
	public ResponseEntity<String> loginCheck(@RequestBody Customer c) {
		
		UsernamePasswordAuthenticationToken token = 
				new UsernamePasswordAuthenticationToken(c.getUname(), c.getPwd());

		try {
			Authentication authenticate = authManager.authenticate(token);

			if (authenticate.isAuthenticated()) {
				String jwtToken = jwt.generateToken(c.getUname());
				return new ResponseEntity<>(jwtToken, HttpStatus.OK);
			}

		} catch (Exception e) {
			//logger
		}

		return new ResponseEntity<String>("Invalid Credentials", HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer customer) {
		
		// duplicate check

		String encodedPwd = pwdEncoder.encode(customer.getPwd());
		customer.setPwd(encodedPwd);

		crepo.save(customer);

		return "User registered";
	}

}





