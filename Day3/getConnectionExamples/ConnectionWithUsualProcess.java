package Day3.getConnectionExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionWithUsualProcess {
	public static void main(String[] args) {
		try {
			//1. Load the Driver manager
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Establish connection with the DB.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip");
			
			//3. Prepare environment for DB
			Statement statement = con.createStatement();
			
			//4. run the query
			int n = statement.executeUpdate("insert into studentdata (id, name) values (10,'sudip')");
			System.out.println(n+" data inserted");
			
			//5. Close costly resources
			con.close();
			statement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

