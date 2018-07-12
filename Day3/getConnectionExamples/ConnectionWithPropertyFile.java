package Day3.getConnectionExamples;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionWithPropertyFile {
	public static void main(String[] args) {
		try {
			//1. Load the Driver manager
			Class.forName("com.mysql.jdbc.Driver");
			
			Properties prop = new Properties();
			FileReader fr = new FileReader("conf/config.properties");
			prop.load(fr);
			
			//2. Establish connection with the DB.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",prop);
			
			//3. Prepare environment for DB
			Statement statement = con.createStatement();
			
			//4. run the query
			int n = statement.executeUpdate("insert into studentdata (id, name) values (9,'sudip')");
			System.out.println(n+" data inserted");
			
			//5. Close costly resources
			con.close();
			statement.close();
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}

