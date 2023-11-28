package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		1)loading the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");
//		3)creating the statement 
		Statement stmt = conn.createStatement();
//		4)executing query DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery()
		
		ResultSet result=stmt.executeQuery("select * from products");
		
//		5)close the connection
		System.out.println("proId | proName | proPrice | proDesc");
		while(result.next())
		{
			
System.out.println(result.getInt("productid")+"     "+result.getString("productname")+"      "+result.getInt("Productprice")+"     "+result.getString("producttype"));
		}
		conn.close();
	

	}

}
