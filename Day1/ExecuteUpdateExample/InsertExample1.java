package Day1.ExecuteUpdateExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertExample1 {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded driver");
			
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sudip");
			System.out.println("connected to database");
			
			 Statement statement = con.createStatement();
			 
			 int n = statement.executeUpdate("insert into studentdata values(1,'sudip')");
			 System.out.println(n +" data inserted");
			 
			 con.close();
			 statement.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
