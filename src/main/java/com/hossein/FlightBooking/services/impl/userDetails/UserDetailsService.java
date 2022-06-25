package com.hossein.FlightBooking.services.impl.userDetails;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hossein.FlightBooking.controllers.viewModels.userDetails.UserDetailsViewModel;
import com.hossein.FlightBooking.dao.dataJpaRepos.userDetails.IUserDetailsRepository;
import com.hossein.FlightBooking.dto.userDetails.UserDetailsDto;
import com.hossein.FlightBooking.models.userDetails.UserDetailsModel;
import com.hossein.FlightBooking.services.userDetails.IUserDetailsService;

@Service
public class UserDetailsService implements IUserDetailsService {
	
	@Autowired
	private IUserDetailsRepository iUserDetailsRepository;

	@Override
	public List<UserDetailsViewModel> getAll(UserDetailsDto data) {
		return iUserDetailsRepository.getAll(data);
	}

	@Override
	@Transactional
	public long saveEntity(UserDetailsModel entity) {
		return this.iUserDetailsRepository.save(entity).getId();
	}

	@Override
	public UserDetailsViewModel loadByUserId(Long id) {
		UserDetailsDto dto = new UserDetailsDto();
		dto.setUserId(id);
		return this.iUserDetailsRepository.getAll(dto).get(0);
	}

}
