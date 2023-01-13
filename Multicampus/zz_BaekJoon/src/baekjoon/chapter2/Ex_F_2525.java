package baekjoon.chapter2;

import java.util.Scanner;

public class Ex_F_2525 {
	public static void main(String[] args) {
		// 오리구이를 시작하는 시각과 오븐구이를 하는데 필요한 시간이 분단위로 주어졌을때
		// 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 시 : 23
		int b = sc.nextInt();  // 분 : 48
		int c = sc.nextInt(); // 소요시간 : 25
		
		int min = (60 * a + b) + c; // 시간 -> 분
		int hour = (min / 60) % 24; // min / 이때 min / 60 = 24가 나온다 시간은 24 == 0 이기 때문에 한번더 24로 나눈뒤 나머지 값을 구해 0 이 되게 만든다
		
		int min2 = min % 60;
		
		System.out.println(hour + " " + min2);

		
	}
}
