package com.mc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTemplate {

	private static final DBTemplate INSTANCE = new DBTemplate();

	private DBTemplate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static DBTemplate getInstance() {
		return INSTANCE;
	}

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/member_db?useUnicode=true&characterEncoding=utf8";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, "member_db", "123qwe!@#QWE");
			conn.setAutoCommit(false); // auto commit 종료
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close(ResultSet rset) {
		try {

			if (rset != null && !rset.isClosed())
				rset.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(PreparedStatement pstmt) {
		try {
			if(pstmt != null && !pstmt.isClosed()) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(ResultSet rset, PreparedStatement pstmt) {
		close(rset);
		close(pstmt);
	}

}
