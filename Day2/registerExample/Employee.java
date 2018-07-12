package Day2.registerExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders", "root", "sudip");
			
			Statement statement = con.createStatement();
			int n = statement.executeUpdate("insert into employee values (1,'sudip','M',97359226)");
			System.out.println(n+" data inserted");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
