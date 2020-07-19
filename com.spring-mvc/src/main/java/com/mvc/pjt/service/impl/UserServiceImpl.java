package com.mvc.pjt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.pjt.dao.UserDao;
import com.mvc.pjt.model.User;
import com.mvc.pjt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
//	UserDao userDao = new UserDaoImpl();
	
	@Override
	public User register(User user) {
		if (user.getUsername() != null || user.getPassword() != null) {
			User userResp = userDao.saveUser(user);
			return userResp;
		}
		return null;
	}

}
