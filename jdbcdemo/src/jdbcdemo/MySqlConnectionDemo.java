package jdbcdemo;
import java.sql.*;

public class MySqlConnectionDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		//load & register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create a connection getConnection() of DM class
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","jazz");
			//create statement object
			stmt=con.createStatement();
			//execute a query & store in Resultset
			rs=stmt.executeQuery("select *from employees");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(5)+" "+rs.getString(8));
			}
			
			//System.out.println("Display specific record from a db");
			//rs.absolute(3); //move the cursor to 3rd row in rs
			//System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(5)+" "+rs.getString(8));
			con.close();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}

	}


