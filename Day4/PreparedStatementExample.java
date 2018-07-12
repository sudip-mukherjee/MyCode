package Day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	
	public static void main(String[] args) {
		try {
			//1. load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip");
			PreparedStatement prepareStatement = conn.prepareStatement("insert into studentdata  values (?,?)");
			prepareStatement.setInt(1, 10);
			prepareStatement.setString(2, "mahi");
			int n = prepareStatement.executeUpdate();
			System.out.println(n);
			
			conn.close();
			prepareStatement.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
