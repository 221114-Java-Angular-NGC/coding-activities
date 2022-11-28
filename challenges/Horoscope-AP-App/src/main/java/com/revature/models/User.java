package com.revature.models;

import java.time.LocalDate;
import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class User {

	String userName;
	String passWord;
	int id;
	LocalDate birthDay;
	String zodiacSign;
	String eMail;
	
	public User(String userName, String passWord, int id, LocalDate birthDay, String zodiacSign, String eMail) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.id = id;
		this.birthDay = birthDay;
		this.zodiacSign = zodiacSign;
		this.eMail = eMail;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getZodiacSign() {
		return zodiacSign;
	}

	public void setZodiacSign(String zodiacSign) {
		this.zodiacSign = zodiacSign;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", id=" + id + ", birthDay=" + birthDay
				+ ", zodiacSign=" + zodiacSign + ", eMail=" + eMail + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDay, eMail, id, passWord, userName, zodiacSign);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birthDay, other.birthDay) && Objects.equals(eMail, other.eMail) && id == other.id
				&& Objects.equals(passWord, other.passWord) && Objects.equals(userName, other.userName)
				&& Objects.equals(zodiacSign, other.zodiacSign);
	}
	
	
	
	
	
	
}
