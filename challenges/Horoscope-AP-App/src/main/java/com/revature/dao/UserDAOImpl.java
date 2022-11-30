package com.revature.dao;

import java.sql.*;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.models.User;
import com.revature.util.JDBConnectionUtil;

public class UserDAOImpl implements UserDAO {
	public static Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	Connection conn = JDBConnectionUtil.getConnection();

	
	@Override
	public int registar(User user) {
		//we do try statement
		try {
			
			//state our sql statement 
			String sql = "insert into z_users (username, password, email, birthday, zodiac_sign) values (?,?,?,?,?)";
			
			//sql statement
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//filling in the ? with actual values
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassWord());
			pstmt.setString(3, user.geteMail());
			pstmt.setDate(4, Date.valueOf(user.getBirthDay()));
			pstmt.setString(5, user.getZodiacSign());
			
			//execute the sql query
			pstmt.executeUpdate();
			//gives us the generated key
			ResultSet rs = pstmt.getGeneratedKeys();

			rs.next();
						
			return rs.getInt("id");


			
		}catch(SQLException e) {
			//checking for exception 
			logger.info("Exception occured in UserDAOImpl registar()");
			System.out.print(e.getMessage());
		}
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String user_name, String pass_word) {
		
		// checking to see if user_name and pass_word are not null
		if(user_name == null || pass_word == null) {
			logger.info("User_name or Pass_word were null...");
			return false;
		}
		
		//get userName
		User user = getByUserName(user_name);
		
		//checking if username and password are the exact same
		if(user_name.equals(user.getUserName())  && pass_word.equals(user.getPassWord()) ) {
			logger.info("Correct User_name or Pass_word");
			return true;
		}
		logger.info("incorrect login User_name or Pass_word");

		
		return false;
	}

	@Override
	public boolean delete(int id) {
		try {
		String sql = "DELETE FROM z_users WHERE id = ?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
		
		
		} catch(SQLException e) {
			logger.debug(e.getMessage());
		}
		
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User viewInfo(int id) {
		try {
			User user = new User();
			//state our sql statement to find user by id
			String sql = "Select * From z_users where id = ?";
			
			//sql statement
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//filling in the ? with actual values
			pstmt.setInt(1, id);
			
			
			

			//gives us the generated key
			ResultSet rs = pstmt.executeQuery();

			
			
			rs.next();
			
			user.setUserName(rs.getString("username"));
			user.setPassWord(rs.getString("password"));
			user.seteMail(rs.getString("email"));
			user.setBirthDay(rs.getDate("birthday").toLocalDate());
			user.setZodiacSign(rs.getString("zodiac_sign"));
			
			return user;


			
		}catch(SQLException e) {
			//checking for exception 
			logger.info("Exception occured in UserDAOImpl registar()");
			System.out.print(e.getMessage());
		}
		
		// TODO Auto-generated method stub
		
		return null;
	}
	

	@Override
	public String getHoroscope(String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByUserName(String userName) {
		
try {
			User user = new User();
			//state our sql statement to find username
			String sql = "Select * From z_users where username = ?";
			
			//sql statement
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//filling in the ? with actual values
			pstmt.setString(1, userName);
			
			
			

			//gives us the generated key
			ResultSet rs = pstmt.executeQuery();

			
			
			rs.next();
			
			//this method grabs the username and the password that it is comparing to "userName"
			user.setUserName(rs.getString("username"));
			user.setPassWord(rs.getString("password"));
			user.seteMail(rs.getString("email"));
			user.setBirthDay(rs.getDate("birthday").toLocalDate());
			user.setZodiacSign(rs.getString("zodiac_sign"));
			
			return user;


			
		}catch(SQLException e) {
			//checking for exception 
			logger.info("Exception occured in UserDAOImpl registar()");
			System.out.print(e.getMessage());
		}
		
		// TODO Auto-generated method stub
		
		return null;
	}

}
