package jdbcdemo;

import java.sql.Connection;

import java.sql.DriverManager;

public class EmployeeConnection {
	public static Connection createConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/training","root","jazz");
		return con;
	}

}
