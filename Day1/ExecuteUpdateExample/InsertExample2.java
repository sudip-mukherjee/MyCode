package Day1.ExecuteUpdateExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample2 {
	public static void main(String[] args) {
		try {
			com.mysql.jdbc.Driver d = new  com.mysql.jdbc.Driver ();
			DriverManager.registerDriver(d);
			
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sudip");
			System.out.println("database connected");
			
			PreparedStatement prep = con.prepareStatement("insert into studentdata(id,name) values (7,'shyam')");
			
			int n = prep.executeUpdate();
			System.out.println(n+" data inserted");
			
			con.close();
			prep.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
