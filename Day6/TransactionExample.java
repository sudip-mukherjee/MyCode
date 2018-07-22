package Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String query1="update account set bal=bal-1000 where id = 1";
		String query2="update account set bal=bal+1000 where id = 2";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip");
			stmt = con.createStatement();
			
			con.setAutoCommit(false);
			stmt.executeUpdate(query1);
			stmt.executeUpdate(query2);
			System.out.println("successful");
			
			con.commit(); // make it disable and run again, database will not be changed.
			
		} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
	}

}
