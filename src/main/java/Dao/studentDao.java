package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Models.student;

public class studentDao {
	
	private Connection conn;

	public studentDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addstudent(student stu) {
		
		boolean b = false;
		
		try {
			String sql = "insert into student(name,branch,email,password,phonenum) values(?,?,?,?,?)";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setString(1, stu.getName());
			pmst.setString(2, stu.getBranch());
			pmst.setString(3, stu.getEmail());
			pmst.setString(4, stu.getPassword());
			pmst.setLong(5, stu.getPhonenum());
			
			int i = pmst.executeUpdate();
			
			if (i>0) {
				b = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
		
	}

}
