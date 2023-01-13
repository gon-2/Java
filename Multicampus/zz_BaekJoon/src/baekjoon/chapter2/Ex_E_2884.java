package baekjoon.chapter2;

import java.util.Scanner;

public class Ex_E_2884 {

	public static void main(String[] args) {
		// 기상시간 45분 전에 울리는 알람 맞추기
		Scanner in = new Scanner(System.in);

		int hour = in.nextInt(); // 시
		int min = in.nextInt(); // 분
		in.close();

		if (min < 45) {
			hour--; // 시(hour) 1 감소
			min = 60 - (45 - min); // 분(min) 감소
			if (hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + min);
		} else {
			System.out.println(hour + " " + (min - 45));
		}
	}
}
