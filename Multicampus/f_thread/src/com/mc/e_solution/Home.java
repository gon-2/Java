package com.mc.e_solution;

public class Home {

	private School school;

	public Home(School school) {
		super();
		this.school = school;
	}

	public synchronized void goToHome(String name) {
		System.out.println(name + "집으로 갑니다.....");
	}
	
	public synchronized void leaveHome(String name) {
		System.out.println(name + "이(가) 집을 떠나 학교에 갑니다.");
		school.goToScool(name);
	}
	
	
}
