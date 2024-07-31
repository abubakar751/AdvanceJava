package com.jdbcRoom;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExampleFetch {

	public static void main(String[] args) {
		java.sql.PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			Connection connection = Connecton.getConnection();

			// Step 3: Create a statement
			preparedStatement = connection.prepareStatement(JDBCConstant.FETCH_SQL_STRING);

			// Step 4: Execute the query and get the result set
			resultSet = preparedStatement.executeQuery();

			// Step 5: Process the result set
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String age = resultSet.getString(3);

				System.out.println("ID: " + id + ", NAME: " + name + ", AGE: " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
