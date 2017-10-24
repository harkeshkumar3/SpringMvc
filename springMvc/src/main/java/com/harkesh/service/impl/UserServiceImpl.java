package com.harkesh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harkesh.dao.UserDao;
import com.harkesh.model.User;
import com.harkesh.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements	UserService {

	@Autowired
	
	UserDao userDao;
	@Override
	public void create(User user) {
		
		userDao.create(user);
		// TODO Auto-generated method stub
		
	}

}
