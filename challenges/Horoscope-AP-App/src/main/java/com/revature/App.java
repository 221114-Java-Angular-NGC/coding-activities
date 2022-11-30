package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.controller.UserController;
import com.revature.util.JDBConnectionUtil;

import io.javalin.Javalin;

public class App {
	public static void main(String[] args) {

		try {
			String sqlInit = "drop table if exists z_users; "
					+ "create table z_users(id serial primary key, username varchar(10), "
					+ "password varchar(255), email varchar(255), birthday timestamp, zodiac_sign varchar(20)); ";

			Connection conn = JDBConnectionUtil.getConnection();
			conn.prepareStatement(sqlInit).executeUpdate();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		Javalin app = Javalin.create().start(8080);

		app.get("/", ctx -> ctx.html("Hi"));
		app.post("/login", UserController.login);
		app.post("/users", UserController.createUser);
		app.before("/users/*", UserController.isLogin);
		app.get("/users/{id}", UserController.viewInfo);

	}

}
