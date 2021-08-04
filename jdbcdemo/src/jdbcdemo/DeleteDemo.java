package jdbcdemo;
import java.sql.*;
public class DeleteDemo {

	public static void main(String[] args) {
		Connection con;
        Statement stmt;
        int cnt=0;
        
        try {
        	con=ConnectionUtil.createConnection();
        	String sq1="Delete from candidates where rtrim(last_name)" //rtrim removes xtra spaces
        			+"LIKE \'K%g\';"; //delete candidate name starting with k and ending with g
        	String sql1="Delete from candidates where id=101;";
        	
        	stmt=con.createStatement();
        	cnt=stmt.executeUpdate(sql1);
        	if(cnt >0) {
        		System.out.println(cnt+" Rcords Deleted");
        		}
        	else {
        		System.out.println("record not found");
        	}
        	con.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        	
        }
	}

}
