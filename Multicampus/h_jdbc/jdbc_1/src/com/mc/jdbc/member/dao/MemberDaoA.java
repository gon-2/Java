package com.mc.jdbc.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mc.jdbc.member.dto.Member;

public class MemberDaoA {

	// MVC2 패턴
	// Model
	// DAO(Data Access Object)
	
	//Persistence Layet
	// 영속성 계층 : 데이터를 영구적으로 저장하기 위해 DB와 상호작용 하는 Layer
	
	// 필요한 데이터를 DBMS에 요청
	// DBMS로 부터 읽어온 데이터를 어플리케이션 내에서 사용하기 적합한 형태로 파싱
	public class MemberDao{
		
		// 사용자 인증{
		public Member userAuthenticate(String userId, String password) {
			
			Member member = null;
			
			// DBMS와의 연결(session)을 관리
			// transaction 관리를 위한 메서드를 가진 객체
			// transaction 시작 시 Connection 객체 생성
			// transaction 종료 시 Connectio을 닫음( close())
			Connection conn = null;
			
			// 쿼리 전송용 객체	
			// select, insert, update, delete 같은 구문을 수행하기 위한 객체
			// 데이터베이스에 전달할 sql문을 작성
			Statement stmt = null;
			
			
			// Select 쿼리의 결과로 반환된 데이터들의 집합
			// DBMS로 부터 조회된 데이터를 읽어오는 객체
			ResultSet rset = null;
			
			
			
				try {
					
					// JDBC 코딩 순서
					// 1. jdbc driver 객체를 JVM에 등록
					// Reflection을 사용해 원하는 DBMS의 드라이버 객체를 JCM에 등록할 수 있다.
					// 인스턴스 생성을 문자열로 하고, 메서드나 필드에 접근할 수 있는기술
					// private 같은 객체지향프로그래밍의 원칙을 위해 만든 자바의 규칙을 무시하고 메서드나 속성등을 사용할수 있어
					// 가능하면 사용하지 않는 것이 좋다.
					
					// 우리가 사용할 DBMS의 Driver 클래스를 JVM에 등록
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// 2. 데이터베이스와 연결
					// jdbc:mysql//<ip>:<port>/<database이름>?queryString
					String url = "jdbc:mysql://localhost:3306/bookmanager?useUnicode=true&characterEncoding=utf8";
					conn = DriverManager.getConnection(url, "bm", "123qwe!@#QWE");
					
					// 3. 쿼리 전송용 객체 생성
					stmt = conn.createStatement();
					
					// 3-1. 쿼리 작성
					String query = "select * from member where user_id = '" + userId + "' and password = '" + password +"'";
					
					// 3-2. 쿼리 실행
					rset = stmt.executeQuery(query);
					
					// resultSet에서 각 row를 한 줄씩 읽어오는 코드
					while(rset.next()) {
						member = new Member();
						member.setUserId(rset.getString("user_id"));
						member.setPassword(rset.getString("password"));
						member.setGrade(rset.getString("grade"));
						member.setTell(rset.getString("tell"));
						member.setEmail(rset.getString("email"));
						member.setLeave(rset.getBoolean("is_leave"));
						member.setRegDate(rset.getTimestamp("reg_date").toLocalDateTime());
						member.setRentableDate(rset.getTimestamp("rentable_date").toLocalDateTime());
					}
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						//역순으로 닫아줘야함 
						rset.close();
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			return member;
		}
		
		public int insertMember(Member member) {
			
			// DBMS와의 연결(session)을 관리
			// transaction 관리를 위한 메서드를 가진 객체
			// transaction 시작 시 Connection 객체 생성
			// transaction 종료 시 Connection을 닫음 (close()) 
			Connection conn = null;
			
			// 쿼리 전송용 객체
			// select, insert, update, delete같은 구문을 수행하기 위한 객체
			// 데이터 베이스에 전달할 sql문을 작성
			Statement stmt = null;
			int res = 0;
			
			// 우리가 사용할 DBMS의 Driver 클래스를 JVM에 등록
			try {
				Class.forName(null);
				String url = "jdbc:mysql://localhost:3306/boolkmanager?useUnicode=true&characterEncording=uth8";
				conn = DriverManager.getConnection(url, "bm", "123qwe!@#QWE");
				
				// 3. 쿼리 전송용 객체 생성
				stmt = conn.createStatement();
				
				String sql = "insert into member(user_id, password, email, grade, tell, rentable_date)" + " values('"
						+ member.getUserId() + "'," + "'" + member.getPassword() + "'," + "'" + member.getEmail() + "',"
						+ "'" + member.getGrade() + "'," + "'" + member.getTell() + "'," + " now() " + ")";
				res = stmt.executeUpdate(sql);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return res;
		}
		
		// userId의 비밀번호를
		// 매개변수로 받아온 password로 수정하는 코드를 작성하시오
		public int changepassword(String userId, String password) {
			
			// DBMS와의 연결(session)을 관리
			// transaction 관리를 위한 메서드를 가진 객체
			// transaction 시작 시 Connection 객체 생성
			// transaction 종료 시 Connection을 닫음 (close())
			Connection conn = null;
			
			// SQL Injection 공격을 방어할 수 있는 쿼리 전송용 객체
			PreparedStatement psmt = null;
			
			int res = 0;
			try {
				Class.forName("com.mysql.jc.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3366/bookmanager?userUnicode=true&characterEncoding=utf8";
				conn = DriverManager.getConnection(url, "bm", "123qwe!@#QWE");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			return 0;
		}
		
		
	}
	
}
