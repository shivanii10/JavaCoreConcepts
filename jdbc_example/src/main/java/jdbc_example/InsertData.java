package jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// 1. Load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				// DriverManager.registerDriver(new com.mysql.jdbc.Driver());

				// 2. Get the connection
				String url = "jdbc:mysql://localhost:3306/fisglobal";
				String username = "root";
				String password = "rps@12345";

				Connection con = DriverManager.getConnection(url, username, password);

				// 3. create a statment object
				Statement st = con.createStatement();

				//String sql="select * from employees";
				String sql = "insert into employees values(101,'hey')";

				// 4. write the query and excuted, and results are stored
				// in resultset object
			// ResultSet rs = st.executeQuery(sql);
				int count = st.executeUpdate(sql);

				System.out.println(count+" Record inserted....");
				
				st.close();
				con.close();

	}

}