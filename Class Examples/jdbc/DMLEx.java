package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		1)loading the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");
//		3)creating the statement 
		Statement stmt = conn.createStatement();
//		4)executing query DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery(),all-->executeBatch()
		//int result = stmt.executeUpdate("insert into products values(112,'apple',19000,'laptop')");
//		int result = stmt.executeUpdate("update products set productprice=productprice+1000 where productname='apple'");
//		int result = stmt.executeUpdate("delete from products");
		
			stmt.addBatch("insert into products values(112,'apple',19000,'laptop')");
			stmt.addBatch("insert into products values(113,'samsung',29000,'mobile')");
			stmt.addBatch("insert into products values(114,'dell',28000,'laptop')");
			stmt.addBatch("insert into products values(115,'oppo',48000,'mobile')");
		
			int result[]=stmt.executeBatch();
			
//		5)close the connection
		conn.close();
		System.out.println(result[0]+" : Records Inserted....");

	}

}
