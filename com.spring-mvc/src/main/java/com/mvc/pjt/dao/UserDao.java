package com.mvc.pjt.dao;

import org.springframework.stereotype.Repository;

import com.mvc.pjt.model.User;

@Repository
public interface UserDao {

	User saveUser(User user);

}
