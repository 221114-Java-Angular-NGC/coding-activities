package com.revature.dao;

import com.revature.models.User;

public interface UserDAO {

	int registar(User user);
	User getByUserName(String userName);
	boolean login(String user_name, String pass_word);
	boolean delete(int id);
	boolean update(User user);
	User viewInfo(int id);
	String getHoroscope(String sign);
}
