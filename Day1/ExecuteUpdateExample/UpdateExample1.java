package Day1.ExecuteUpdateExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample1 {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sudip");
			System.out.println("connected to database");
			
			String query = " update studentdata set name='priya' where id=1 ";
			PreparedStatement prep = con.prepareStatement(query);
			
			int n = prep.executeUpdate();
			System.out.println(n+" data updated");
			
			con.close();
			prep.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
