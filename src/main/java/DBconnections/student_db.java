package DBconnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class student_db {
	
	private static String Driver = "com.mysql.cj.jdbc.Driver";
	
	private static String Url = "jdbc:mysql://localhost:3306/studentdatabase";
	
	private static String Username = "root";
	
	private static String Password = "root";
	
	private static Connection conn;
	
	public static Connection getconnection(){
		
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url, Username, Password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	

}
