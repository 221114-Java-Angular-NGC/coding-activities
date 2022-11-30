package com.revature.services;

import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.models.User;
import com.revature.util.HoroscopeUtil;

public class UserServicesImpl implements UserService {
	
	private static UserDAO dao;
	
	

	public UserServicesImpl() {
		super();
		dao = new UserDAOImpl();
	}
	
	public UserServicesImpl(UserDAO userDAO) {
		dao = userDAO;
	}
	

	@Override
	public boolean registar(User user) {
		// TODO Auto-generated method stub
		return dao.registar(user) != 0 ? true : false;
	}

	@Override
	public boolean login(String user_name, String pass_word) {
		// TODO Auto-generated method stub
		return dao.login(user_name, pass_word);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User viewInfo(int id) {
		User user = dao.viewInfo(id);
		if(user.getUserName() != null) {
		return user;
		}
		return null;
	}

	@Override
	public String getHoroscope(String sign) {
		// TODO Auto-generated method stub
		return null;
	}

}
