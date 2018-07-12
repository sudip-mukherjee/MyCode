package Day1.ExecuteUpdateExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "sudip");
			
			String query = "delete from studentdata where id = 1";
			PreparedStatement prep = con.prepareStatement(query);
			
			int n = prep.executeUpdate();
			System.out.println(n+" data deleted");
			
			con.close();
			prep.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}
}
