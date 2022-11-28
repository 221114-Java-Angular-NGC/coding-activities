package com.revature.services;

import com.revature.models.User;

public interface UserService {

	boolean registar(User user);
	boolean login(String user_name, String pass_word);
	boolean delete(int id);
	boolean update(User user);
	User viewInfo(int id);
	String getHoroscope(String sign);
}
