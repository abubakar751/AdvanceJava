package com.jdbcRoom;

import com.mysql.jdbc.Connection;

public class JDBCExampleInsert extends JDBCConstant {

	public static void main(String[] args) {

	
		java.sql.PreparedStatement preparedStatement = null;
		try {
			Connection connection = (Connection) Connecton.getConnection();
		
			// Step 3: Create a statement
			preparedStatement = connection.prepareStatement(JDBCConstant.INSERT_SQL_STRING);

			// Step 4: Set parameters for the INSERT query
			preparedStatement.setString(1, "105");
			preparedStatement.setString(2, "ABRAR");
			preparedStatement.setString(3, "24");

			// Step 5: Execute the statement
			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new record was inserted successfully!");
			}else {
				System.out.println("Unable to insert");
			}

		} catch (Exception exception) {
			System.out.println(exception);
		}

	}

}
