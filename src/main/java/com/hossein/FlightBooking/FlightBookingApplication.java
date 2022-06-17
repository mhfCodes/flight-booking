package com.hossein.FlightBooking;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hossein.FlightBooking.dao.RoleRepository;
import com.hossein.FlightBooking.dao.UserRepository;
import com.hossein.FlightBooking.models.Roles;
import com.hossein.FlightBooking.models.UserModel;

@SpringBootApplication
public class FlightBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(UserRepository userRepo, RoleRepository roleRepo) {
		
		return args -> {
			
			Roles adminRole = new Roles("ROLE_ADMIN");
			Roles passengerRole = new Roles("ROLE_PASSENGER");
			
			roleRepo.saveAll(List.of(adminRole, passengerRole));
			
			UserModel adminUser = new UserModel("admin@gmail.com", "admin", "123456", adminRole);
//			UserModel passengerUser1 = new UserModel("johndoe@gmail.com", "abcd1234", passengerRole);
//			UserModel passengerUser2 = new UserModel("janedoe@gmail.com", "abcd1234", passengerRole);
//			UserModel passengerUser3 = new UserModel("alexmahoon@gmail.com", "abcd1234", passengerRole);
//			UserModel passengerUser4 = new UserModel("mikeshinoda@gmail.com", "abcd1234", passengerRole);
//
//			userRepo.saveAll(List.of(adminUser));
			
			
		};
	}

}
