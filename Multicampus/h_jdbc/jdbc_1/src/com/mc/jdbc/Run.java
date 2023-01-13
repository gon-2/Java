package com.mc.jdbc;

import com.mc.jdbc.member.dao.MemberDao;
import com.mc.jdbc.member.dto.Member;

public class Run {

	// JAVA API(Application Programing Interface)
	// Java Database Connectivity Application Programing Interface(자바와 데이터베이스의 연계를 위한 프로그래밍 인터페이스)
	
	// jdbc 사용 이유 : 모든 데이터 베이스는 자신의 제품과 자바 어플리케이션간의 연결을 위해 JDBC API를 구현체를 제공.
	// 모든 데이터베이스가 JDBC API를 따르고 있기 때문에, 자바 개발자는 모든 데이터베이스를 공통된 형식으로 다룰 수 있다.
	public static void main(String[] args) {
		
		// select
		MemberDao memberDao = new MemberDao();
//		Member member = memberDao.userAuthenticate("admin", "1234");
//		System.out.println(member);
		
		//////////////////////////////////////////////////////////////////
		
		// insert
//		Member member2 = new Member();
//		member2.setUserid("super3");
//		member2.setPassword("1234");
//		member2.setEmail("super2@mc.com");
//		member2.setGrade("ROLE_ADMIN");
//		member2.setTell("010-0000-1113");
//		
//		int res = memberDao.insertMember(member2);
//		System.out.println(res);
		
		
		/////////////////////////////////////////////////////////////////////
		
		// update
//		int res = memberDao.changePassword("super", "abcd");
//		System.out.println(res);
		
		// Sql injection 공격
		// 데이터를 오염시키기 위한 목적으로 SQL쿼리를 주입하는 공격
//		int res = memberDao.changePassword("' or 1=1 or user_id = '", "melong you are idot"); // 모든 행을 바꿔버림
//		System.out.println(res);
		
		int res = memberDao.deleteUser("super");
		System.out.println(res);
		
	}
}
