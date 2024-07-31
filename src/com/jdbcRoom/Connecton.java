package com.jdbcRoom;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Connecton {

	private static Connection con = null;

	public static java.sql.Connection getConnection() {

		try {
			if (con == null) {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection(JDBCConstant.jdbcURL, JDBCConstant.username, JDBCConstant.password);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}
}
