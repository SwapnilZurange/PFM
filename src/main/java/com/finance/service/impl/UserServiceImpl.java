package com.finance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.entity.Users;
import com.finance.exception.ResourceNotFoundException;
import com.finance.repo.UserRepository;
import com.finance.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Users createUser(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Users getUser(Long id) {
		Optional<Users> users = userRepository.findById(id);
		return users.orElseThrow(() -> new ResourceNotFoundException(
				"User not found with user id '\" + id + \"', Please Enter Valid UseId"));
	}

}
