package com.revature.controller;

import java.sql.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.revature.models.LoginTemplate;
import com.revature.models.User;
import com.revature.services.UserService;
import com.revature.services.UserServicesImpl;
import com.revature.util.HoroscopeUtil;

import io.javalin.http.Handler;
import io.javalin.http.HttpStatus;

public class UserController {
	
	private static UserService uServ = new UserServicesImpl();
	
	public static Handler createUser = ctx -> {
		
		String body = ctx.body();
		
		ObjectMapper om = new ObjectMapper();
		om.registerModule(new JavaTimeModule());
		
		User user = om.readValue(body, User.class);
	
		Date date = Date.valueOf(user.getBirthDay());
		
		user.setZodiacSign(HoroscopeUtil.findZodiac(date));
		
		if(uServ.registar(user)) {
			ctx.html("its worked");
			ctx.status(HttpStatus.CREATED);
		} else {
			ctx.html("it no work");
			ctx.status(HttpStatus.NOT_FOUND);
		}
			
		
	};
	
	public static Handler viewInfo = ctx -> {
		
		int id = Integer.parseInt(ctx.pathParam("id"));
		User user = uServ.viewInfo(id);
		if(user != null) {
		ctx.json(user);
		ctx.status(HttpStatus.OK);
		} else {
			ctx.html("<h1>NO</h1>");
			ctx.status(HttpStatus.NOT_FOUND);
			
		}
	};
	
	public static Handler login = ctx -> {
		String body = ctx.body();
		//Basic username:password 
		//username:password -> bob:B0B -. string[] {username, password}
		ObjectMapper om = new ObjectMapper();
		LoginTemplate login = om.readValue(body, LoginTemplate.class);
		if(uServ.login(login.getUsername(), login.getPassword())) {
			
		ctx.cookieStore().set("currentUser", login.getUsername());
		ctx.html("logged in");
		
		} else {
			ctx.status(HttpStatus.NOT_FOUND);
		}
				
	};
	
	public static Handler isLogin = ctx -> {
		String cookie = ctx.cookieStore().get("currentUser");
		if(cookie == null) {
			ctx.redirect("/");
		}
	};

}
