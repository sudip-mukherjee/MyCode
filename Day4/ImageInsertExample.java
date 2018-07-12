package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ImageInsertExample {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=sudip");
			PreparedStatement pstmt = con.prepareStatement("insert into image values(?,?)");
			FileInputStream fp = new FileInputStream("E:\\20160515.jpg");
			pstmt.setInt(1, 01);
			pstmt.setBinaryStream(2, fp);
			int n = pstmt.executeUpdate();
			System.out.println(n);






		} catch (SQLException | ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		}


	}

}
