package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {
	Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","jazz");	
			//create scrollable resultset
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery("select * from skills");
			while(rs.next())
            {
    System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
	System.out.println("**Display records from bottom***");
	rs.afterLast(); //read from bottom to top
	while(rs.previous())
    {
System.out.println(rs.getInt(1)+"  "+rs.getString(2));
    }
System.out.println("***Display 3rd record*****");
rs.absolute(3);//move cursor to 3rd record
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

System.out.println("***Display 2nd record*****");
rs.relative(-1); //move the cursor to 2nd from current 3rd pos record
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

System.out.println("***Display 1st record*****");
rs.first();//move the cursor to first record
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

System.out.println("***Display last record*****");
rs.last();//move the cursor to first record
System.out.println(rs.getInt(1)+"  "+rs.getString(2));

rs.absolute(4);
System.out.println("current cursor position: "+rs.getRow());

rs.last();
System.out.println("total no. of records: "+rs.getRow());
con.close();
		}
			
catch(Exception e){ 
 System.out.println(e);
                }  
}
	}