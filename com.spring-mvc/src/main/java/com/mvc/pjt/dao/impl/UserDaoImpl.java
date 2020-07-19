package com.mvc.pjt.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.pjt.dao.UserDao;
import com.mvc.pjt.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource datasource;
	  
	@Autowired
	JdbcTemplate jdbcTemplate;
	  
	@Override
	public User saveUser(User user) {
//		String sql = "insert into users values(?,?,?,?,?,?,?)";
		return user;
	}

}
