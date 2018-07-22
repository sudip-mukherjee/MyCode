package Day6;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadataExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip");
			
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println("----- Database MetaData -----");
			System.out.println("db driver name : "+dmd.getDriverName());
			
			
			Statement stmt = con.createStatement();
			boolean execute = stmt.execute("select * from studentdata");
			if(execute) {
				ResultSet rs = stmt.getResultSet();
				ResultSetMetaData rmd = rs.getMetaData();
				System.out.println("----- ResultSet MetaData -----");
				int columnCount = rmd.getColumnCount();
				System.out.println("total column : "+columnCount);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
