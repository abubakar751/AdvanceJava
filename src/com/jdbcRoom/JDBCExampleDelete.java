package com.jdbcRoom;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExampleDelete {

	public static void main(String[] args) {

		try {

			Connection connection = Connecton.getConnection();
			java.sql.PreparedStatement statement = connection.prepareStatement(JDBCConstant.DELETE_SQL_STRING);

			// Step 4: Execute the query and get the result set
			statement.setInt(1, 101); // Delete the row where id matches

			// Execute the DELETE query
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A record was deleted successfully!");
			}else {
				System.out.println("Record Not Found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
