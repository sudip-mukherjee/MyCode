package Day1.ExecuteUpdateExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","sudip");
			
			Statement statement = con.createStatement();
			String query = "update studentdata set name='rakesh' where id=3 ";
			
			int n = statement.executeUpdate(query);
			System.out.println(n+" data updated");
			
			con.close();
			statement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
