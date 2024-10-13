package com.finance.service;

import com.finance.entity.Users;

public interface UserService {

	public Users createUser(Users user);

	public Users getUser(Long id);
}
