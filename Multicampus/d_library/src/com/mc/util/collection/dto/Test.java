package com.mc.util.collection.dto;

import com.mc.util.collection.lambda.function.Predicate;

public class Test {

	private String subject;
	private String name;
	private int score;

	public Test(String subject, String name, int score) {
		super();
		this.subject = subject;
		this.name = name;
		this.score = score;
	}

	// 통과여부를 판단
	// 과목마다 통과 기준이 다르다
	// 통과기준을, 클래스를 인스턴스화 하는 쪽에서 결정해야함
	public boolean isPass(Predicate<Test> p) {

		return p.test(this);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Test [subject=" + subject + ", name=" + name + ", score=" + score + "]";
	}

}
