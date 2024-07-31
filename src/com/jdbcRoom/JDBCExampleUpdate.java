package com.jdbcRoom;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class JDBCExampleUpdate {

	public static void main(String[] args) {

		PreparedStatement selectStatement = null;
		PreparedStatement updateStatement = null;
		ResultSet resultSet = null;

		try {

			java.sql.Connection connection = Connecton.getConnection();
			// Step 3: Create a statement for fetching data
			selectStatement = (PreparedStatement) connection.prepareStatement(JDBCConstant.FETCH_SQL_STRING);

			// Step 4: Execute the query and get the result set
			resultSet = selectStatement.executeQuery();

			// Step 5: Process the result set and update data
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String age = resultSet.getString("age");

				System.out.println("ID: " + id + ", NAME " + name + ", AGE: " + age);

				// Step 6: Create a statement for updating data
				updateStatement = (PreparedStatement) connection.prepareStatement(JDBCConstant.UPDATE_SQL_STRING);

				// Set parameters for the UPDATE query
				updateStatement.setString(1, "SAMEER"); // Update column1 to "new_value"
				updateStatement.setInt(2, 102); // Update the row where id matches

				// Execute the UPDATE query
				int rowsUpdated = updateStatement.executeUpdate();
				if (rowsUpdated > 0) {
					System.out.println("An existing record was updated successfully!");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
