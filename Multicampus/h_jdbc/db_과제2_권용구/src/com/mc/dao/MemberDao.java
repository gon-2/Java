package com.mc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mc.dto.Member;
import com.mc.exception.DataAccessException;
import com.mc.util.DBTemplate;


public class MemberDao {

	private DBTemplate dbt = DBTemplate.getInstance();

	public Member userAuthenticate(String userId, String password) {
		Member member = null;
		String query = "select * from member where user_id = '" + userId + "' and password = '" + password + "'";
		
		try(Connection conn = dbt.getConnection(); Statement stmt = conn.createStatement()){
			try(ResultSet rset = stmt.executeQuery(query)){
				while(rset.next()) {
					member = generateMember(rset);
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return member;
		
	}
	
	
	
	
	//insert
	public int insertMember(Member member) {
		// DB연결
		Connection conn = null;
		// 쿼리 전송 및 공격 방어
		PreparedStatement pstmt = null;
		int res = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/member_db?useUnicode=true&characterEncoding=utf8";
			conn = DriverManager.getConnection(url, "member_db", "123qwe!@#QWE");

			String sql = "INSERT INTO member(USER_ID, PASSWORD, EMAIL, GRADE, TELL, IS_LEAVE) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getGrade());
			pstmt.setString(5, member.getTell());
			pstmt.setString(6, member.isLeave() ? "Y" : "N");
			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			dbt.rollback(conn);
			throw new DataAccessException();
		} finally {
			dbt.close(pstmt);
		}

		return res;
	}
	
	
	
	private Member generateMember(ResultSet rset) throws SQLException {
		//USER_ID, PASSWORD, EMAIL, GRADE, TELL, IS_LEAVE
		Member member = new Member();
		member.setUserId(rset.getString("USER_ID"));
		member.setPassword(rset.getString("PASSWORD"));
		member.setEmail(rset.getString("EMAIL"));
		member.setGrade(rset.getString("GRADE"));
		member.setTell(rset.getString("TELL"));
		member.setLeave(rset.getBoolean("IS_LEAVE"));
		return member;
	}

}
