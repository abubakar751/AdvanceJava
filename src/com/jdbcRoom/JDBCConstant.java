package com.jdbcRoom;

public class JDBCConstant {

	public JDBCConstant() {
		super();
	}
	
	public static final  String INSERT_SQL_STRING = "INSERT INTO jd_example (id, name, age) VALUES (?, ?, ?)";
	
	public static final String FETCH_SQL_STRING = "SELECT id, name, age FROM jd_example";
	
	public static final String UPDATE_SQL_STRING = "UPDATE jd_example SET name = ? WHERE id = ?";
	
	public static final String DELETE_SQL_STRING = "DELETE FROM jd_example WHERE id = ?";
	
	public static final String jdbcURL = "jdbc:mysql://localhost:3306/jdbc_example?useSSL=false";
	public static final String username = "root";
	public static final String password = "root";

}