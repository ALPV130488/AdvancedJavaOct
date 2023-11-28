package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		1.Loading Driver class.
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		2.create a connection.
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","username","password");
		
//		3.create a statement.
		
		Statement stmt = conn.createStatement();
		
//		4.Executing the quires.
		
		stmt.execute("create table November(dateno number,day varchar2(15),month number,monthname varchar2(10))");
		
//		5.close the connection.
		
		conn.close();
		
		System.out.println("Table created....");
		
	}
	
}
