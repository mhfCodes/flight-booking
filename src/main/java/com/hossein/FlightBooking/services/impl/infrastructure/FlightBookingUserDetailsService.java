package com.hossein.FlightBooking.services.impl.infrastructure;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hossein.FlightBooking.dao.dataJpaRepos.infrastructure.UserRepository;
import com.hossein.FlightBooking.models.infrastructure.UserModel;

@Service
public class FlightBookingUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel userModel = this.userRepo.findByUsername(username)
									.orElseThrow(() -> new IllegalArgumentException("Username Not Found"));
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(userModel.getRole().getRoleName()));
		User user = new User(userModel.getUsername(), userModel.getPassword(), authorities);
		return user;
	}
	
}
