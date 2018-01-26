package com.Exercise;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.gjt.mm.mysql.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		String sql = "select * from user order by id asc";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username,
					password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.print(rs.getInt(1) + "  ");
				System.out.print(rs.getString(2) + "  ");
				System.out.print(rs.getString(3) + "  ");
				System.out.println(rs.getString(4) + "  ");
			}
			rs.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
