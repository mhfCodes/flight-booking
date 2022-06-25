package com.hossein.FlightBooking.dao.dataJpaRepos.userDetails;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hossein.FlightBooking.dao.custom.userDetails.IUserDetailsCustomRepository;
import com.hossein.FlightBooking.models.userDetails.UserDetailsModel;

public interface IUserDetailsRepository extends JpaRepository<UserDetailsModel, Long>, IUserDetailsCustomRepository {

}
