package jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Get the connection
		String url = "jdbc:mysql://localhost:3306/fisglobal";
		String username = "root";
		String password = "rps@12345";// rps@12345

		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "insert into employees values(?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Enter emp id");
		int id = sc.nextInt();
		System.out.println("Enter firstname");
		String name = sc.next();

		
		pst.setInt(1, id);
		pst.setString(2, name);

		
		int k = pst.executeUpdate();
		System.out.println(k+" Record inserted...");
		
		pst.close();
		con.close();
		
		

	}

}