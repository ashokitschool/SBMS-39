package in.ashokit.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Customer;
import in.ashokit.repo.CustomerRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerRepo crepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Customer c = crepo.findByUname(username);

		return new User(c.getUname(), c.getPwd(), Collections.emptyList());

	}

}











