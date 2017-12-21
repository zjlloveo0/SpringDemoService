package com.test.service;

import java.util.List;

import com.test.entity.User;

public interface IUserBiz {
	List<User> findUser(User user);
	int insertUser(User user);
}
