package com.hossein.FlightBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hossein.FlightBooking.models.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
