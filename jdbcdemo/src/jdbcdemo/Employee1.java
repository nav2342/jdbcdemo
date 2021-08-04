package jdbcdemo;
import java.sql.*;
public class Employee1 {
	
	    Connection con;
	    PreparedStatement ps;
	    Statement st;
	    ResultSet res;
	   
	    public Connection getConnection()
	    {
			return con;
	         
	    }
	    
	    public void insertEmployee(String name, String city, String contactno)
	    {
	int count;
			
			try {
				con=EmployeeConnection.createConnection();
			String  str="Insert into employee values("+ "'" + name + "','" + city + "','" + contactno + "')";
			st=con.createStatement();
			
	count =st.executeUpdate(str);//return no of records
			if(count >0)
			{
				System.out.println("Record Inserted Successfully");
				
			}
			
			//count total no of records in table
			String str1="SELECT COUNT(name) FROM employee";
			res=st.executeQuery(str1);
			int cnt=0;
			while(res.next())
			{
				 cnt=res.getInt(1);
				
			}
			System.out.println("Total no of records is :"+cnt);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	       
	    }
	    
	    public void getEmployee1()
	    {
	    	try {
				con=EmployeeConnection.createConnection();
				st=con.createStatement();
				res=st.executeQuery("SELECT * from employee");
						while(res.next())
						{
							System.out.println(res.getString(1)+"\t"+res.getString(2)
							+"\t"+res.getString(3));
						}
	    	}
	    	catch (Exception ex)
			{
		System.out.println(ex);
			}
						
					
	    }
	    public void updateEmployee1(String name,String city)
	    {
	    	int count;
	    	try {
				con=EmployeeConnection.createConnection();
			String  str="update employee set city=" + "'" + city + "' where name='" + name +  "'";
			st=con.createStatement();
			
	count =st.executeUpdate(str);//return no of records
			if(count >0)
			{
				System.out.println("Record updated Successfully");
				
			}
	    	}
	    	catch (Exception ex)
			{
		System.out.println(ex);
			}
	    	
	    }
	   
	    public void deleteEmployee1(String name)
	    {
	    	int count;
	    	try {
				con=EmployeeConnection.createConnection();
			String  str="delete from employee where name='" + name +  "'";
			st=con.createStatement();
			
	count =st.executeUpdate(str);//return no of records
			if(count >0)
			{
				System.out.println("Record Deleted Successfully");
				
			}
	    	}
	    	catch (Exception ex)
			{
		System.out.println(ex);
			}
	    
	    }

	}

