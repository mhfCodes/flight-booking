package com.hossein.FlightBooking;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hossein.FlightBooking.dao.dataJpaRepos.infrastructure.RoleRepository;
import com.hossein.FlightBooking.dao.dataJpaRepos.infrastructure.UserRepository;
import com.hossein.FlightBooking.models.infrastructure.Roles;
import com.hossein.FlightBooking.models.infrastructure.UserModel;

@SpringBootApplication
public class FlightBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(UserRepository userRepo, RoleRepository roleRepo) {
		
		return args -> {
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			
			Roles adminRole = new Roles("ROLE_ADMIN");
			Roles passengerRole = new Roles("ROLE_PASSENGER");
			
			roleRepo.saveAll(List.of(adminRole, passengerRole));
			
			UserModel adminUser = new UserModel("admin@gmail.com", "admin", passwordEncoder.encode("123456"), adminRole);
			UserModel passengerUser1 = new UserModel("johndoe@gmail.com", "john_doe", passwordEncoder.encode("abcd1234"), passengerRole);
			UserModel passengerUser2 = new UserModel("janedoe@gmail.com", "jane_doe", passwordEncoder.encode("abcd1234"), passengerRole);
			
			userRepo.saveAll(List.of(adminUser, passengerUser1, passengerUser2));
			
			
		};
	}

}
