package b_practice_tour.presentation;

import java.util.Scanner;

import b_practice_tour.service.Airline;
import b_practice_tour.service.Tour;
import b_practice_tour.service.Tourist;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	private Tour tour;
	// "현재 보유 금액:" // 현재 보유금액 출력
	// "현재 보유 마일리지:" // 현재 마일리지 출력

	// 번호 목적지 가격 마일리지
	// 1 미국행 300000 3000
	// 2 중국행 200000 2000
	// 3 일본행 150000 1500
	// 목적지 선택(번호입력):
	// 보유금액으로 티켓 구매 가능 여부를 확인하여 불가능하면
	// 현재 보유금액이 부족합니다. 라고 출력 후 반복종료
	// 각메뉴 선택시(switch문)) TourController의 메소드를 활용
	// “티케팅 후 잔액은: “ // 현재 보유금액 출력
	// ”티케팅 후 마일리지는: “ // 현재 마일리지 출력
	// 보유금액이 없을 때까지 반복 출력
	

	public void mainMenu() {
		while(true) {
			System.out.println("\n============KH항공사에 오신 고객님 환영합니다.==============");
			System.out.println();
		}
	}
}
