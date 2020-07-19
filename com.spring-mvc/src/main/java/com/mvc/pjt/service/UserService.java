package com.mvc.pjt.service;

import org.springframework.stereotype.Service;

import com.mvc.pjt.model.User;

@Service
public interface UserService {

	User register(User user);

}
