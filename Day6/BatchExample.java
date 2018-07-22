package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExample {
	public static void main(String[] args) {
		Connection con=null; 
		Statement stmt = null;
		String inqry = "insert into studentdata values (9,'rakesh','btm')";
		String upqry = "update studentdata set name='dhoni' where id=87 ";
		String delqry = "delete from studentdata where id='1'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sudip");
			 stmt = con.createStatement();
			 
			 stmt.addBatch(inqry);
			 stmt.addBatch(upqry);
			 stmt.addBatch(delqry);
			 int[] batch = stmt.executeBatch();
			 System.out.println(batch.length);
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
