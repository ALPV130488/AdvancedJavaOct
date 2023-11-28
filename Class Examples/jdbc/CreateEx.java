package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		1)loading the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username", "password");
//		3)creating the statement 
		Statement stmt = conn.createStatement();
//		4)executing query DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery()
		stmt.execute("create table products (productid number,productname varchar2(10),productprice number,producttype varchar2(10))");
//		5)close the connection
		conn.close();
		
		
		System.out.println("Table Created....");

	}

}
