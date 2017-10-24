package com.harkesh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.harkesh.dao.UserDao;
import com.harkesh.model.User;

@Repository
public class UserDaoImpl implements	UserDao {
	@Autowired
	public SessionFactory sessionFactory;
	
	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void create(User user) {
		currentSession().save(user);
		// TODO Auto-generated method stub
		
	}

}
