package com.mc.jdbc.member.dto;

import java.time.LocalDateTime;

public class Member {

	// DTO(Data Transger obkect)
	// 데이터 전송을 담당하는 객체
	// 테이블에 존재하는 컬럼을 속성으로 구현, getter/setter구현 하면 끝
	// DTO는 자바빈 규약을 따른다.

	// 자바빈 규약이란?(자바의 공통 인터페이스)
	// 1. 모든 필드변수는 private
	// 2. 반드시 기본생성자가 존재한다.
	// 3. 모든 필드변수는 getter/setter를 가진다.

	// `USER_ID`, `PASSWORD`, `EMAIL`, `GRADE`, `TELL`, `IS_LEAVE`, `REG_DATE`,
	// `RENTABLE_DATE` < 멤버테이블의 컬럼 가져옴

	// mysql : java
	// 문자열 타입 : String
	// 날짜 타입(timestamp) : timestamp
	// 숫자 : int, double
	// boolean : boolean

	private String userId;
	private String password;
	private String email;
	private String grade;
	private String tell;
	private boolean isLeave;
	private LocalDateTime regDate;
	private LocalDateTime rentableDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public boolean isLeave() {
		return isLeave;
	}

	public void setLeave(boolean isLeave) {
		this.isLeave = isLeave;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getRentableDate() {
		return rentableDate;
	}

	public void setRentableDate(LocalDateTime rentableDate) {
		this.rentableDate = rentableDate;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", password=" + password + ", email=" + email + ", grade=" + grade
				+ ", tell=" + tell + ", isLeave=" + isLeave + ", regDate=" + regDate + ", rentableDate=" + rentableDate
				+ "]";
	}
}
