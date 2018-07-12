package Day2.registerExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee2 {
	public static void main(String[] args) {
		try {
			com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders", "root", "sudip");
			Statement statement = con.createStatement();
			int n = statement.executeUpdate("insert into employee values(2,'ram','M',35974516)");
			System.out.println(n+" data inserted");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
