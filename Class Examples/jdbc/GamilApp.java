package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GamilApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username", "password");
		String username = null;
		String password = null;
		long contact = 0;
		int userid = 0;
		System.out.println("**************Gmail Application**********");
		while (true) {
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Exit");

			Scanner scan = new Scanner(System.in);
			int option = scan.nextInt();

			switch (option) {
			case 1:
				System.out.println("Register Here");

				System.out.println("Enter UserName");
				username = scan.next();
				System.out.println("Enter password");
				password = scan.next();
				System.out.println("Enter Contact");
				contact = scan.nextLong();
				userid = (int) (contact - 1000000);
				PreparedStatement psmt = conn.prepareStatement("insert into gmail values(?,?,?,?)");
				psmt.setInt(1, userid);
				psmt.setString(2, username);
				psmt.setString(3, password);
				psmt.setLong(4, contact);
				int result = psmt.executeUpdate();
				if (result > 0)
					System.out.println("Registration Success!!!Try with login");
				else
					System.out.println("Registration failed!!!....");
				break;
			case 2:
				System.out.println("Enter UserName");
				username = scan.next();
				System.out.println("Enter password");
				password = scan.next();
				PreparedStatement psmt1 = conn.prepareStatement("select * from gmail where username=? and password=?");
				psmt1.setString(1, username);
				psmt1.setString(2, password);

				ResultSet result1 = psmt1.executeQuery();
				if (result1.next()) {
					System.out.println("Login Success");
					System.exit(0);
				} else
					System.out.println("Invalid Credentials");
				break;

			default:
				scan.close();
				conn.close();
				System.out.println("Thank You !!!");
				System.exit(0);
				break;
			}
		}
	}

}
//create table gmail(userid int,username varchar(20),password varchar(20),contact int(12));
