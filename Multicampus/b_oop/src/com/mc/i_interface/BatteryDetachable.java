package com.mc.i_interface;

// 인터페이스는 다른 시스템이 결합되기 위해 지켜야 하는 약속
// 인터페이스는 인터페이스를 구현하는 모든 클래스들이 지켜야하는 공통의규약
// 상속은 단일 상속만 가능하지만, 인터페이스 구현은 다중 구현이 가능하다.

// 인터페이스 -> 클래스 : 구현
// 인터페이스 -> 인터페이스 : 상속

// 인터페이스의 구현은 추상클래스의 상속과 마찬가지로 추상메서드에 대한 구현과, 타입을 물려준다.
// 인터페이스 끼리의 상속은 다중 상속이 가능하다.

public interface BatteryDetachable {

	// 인터페이스의 필드변수는 묵시적으로 public static final 이다.
	String INFO = "베터리를 탈 부착할 수 있는 제품입니다.";

	// 인터페이스의 인스턴스 메서드는 묵시적으로 public abstract메서드이다.
	void detacheBattery();

	void attacheBattery();

	// 인터페이스의 클래스 메서드는 protected를 제외하고 접근 제한자 사용가능
	// private은 자바 9(1.9)버전부터 사용가능
	public static void printInfo() {
		System.out.println(INFO);
	}
	
	// 자바 8(1.8)버전 이후로 default도입
	// 인터페이스 내에서 구현부를 가진 인스턴스 메서드
	default void upgradeBattery() {
		System.out.println("배터리를 업데이트 합니다.");
	}
	
	

}
