package Day5.UserInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInputExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sudip");
			Statement stmt = con.createStatement();
			
			System.out.println("Enter 1: To insert,\nEnter 2: To delete,\nEnter 3: To Update,\nEnter 4: To fetch");
			
			Scanner sc = new Scanner(System.in);
			int ip = sc.nextInt();
			
			if(ip==1){
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter branch");
				String branch = sc.next();
				String query = "insert into studentdata values("+id+","+"'"+name+"'"+","+"'"+branch+"'"+")";
				int n = stmt.executeUpdate(query);
				System.out.println("data inserted successfully");
			}
			
			else if(ip==2) {
				System.out.println("which id you want to delete ?");
				int id = sc.nextInt();
				String query = "delete from studentdata where id="+id;
				stmt.executeUpdate(query);
				System.out.println(" data deleted deleted");
			}
			else if(ip==3) {
				System.out.println("which id you want to update");
				int id = sc.nextInt();
				System.out.println("what you want to update ? 1.name or 2.branch ");
				int change = sc.nextInt();
				if(change==1) {
					System.out.println("enter name ");
					String name = sc.next();
					String query ="update studentdata set name='"+name+"'where id="+id;
					System.out.println("updated");
				}else {
					System.out.println("enter branch ");
					String branch=sc.next();
					String query = "update studentdata set branch="+"'"+branch+"'"+" where id="+id;
					System.out.println("updated");
				}
	
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
