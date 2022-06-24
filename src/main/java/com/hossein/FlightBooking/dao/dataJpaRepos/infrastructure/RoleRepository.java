package com.hossein.FlightBooking.dao.dataJpaRepos.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hossein.FlightBooking.models.infrastructure.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
