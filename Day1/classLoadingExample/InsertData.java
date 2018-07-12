package Day1.classLoadingExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip");
			System.out.println("database connected");
			
			Statement statement = con.createStatement();
			int n = statement.executeUpdate("insert into student values(16,'Ram')");
			System.out.println(n+" data is inserted");
			
			
			con.close();
			statement.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
