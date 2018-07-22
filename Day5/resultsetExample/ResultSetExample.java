package Day5.resultsetExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {
	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip" );
			Statement stmt = con.createStatement();
			String query = "select id,name from studentdata where branch='btm' ";
			
			/*ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id);
				System.out.println(name);
			}*/
			
			boolean bool = stmt.execute(query);
			if(bool) {
				ResultSet rs = stmt.getResultSet();
				while(rs.next()) {
					int id =rs.getInt(1);
					String name = rs.getString(2);
					System.out.println(id+"  "+name);
				}
			}else {
				int n = stmt.executeUpdate(query);
				System.out.println(n);
			}
			
			
			
						
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

}
