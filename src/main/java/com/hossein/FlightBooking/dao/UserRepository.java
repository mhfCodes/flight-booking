package com.hossein.FlightBooking.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hossein.FlightBooking.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	Optional<UserModel> findByUsername(String username);
}
