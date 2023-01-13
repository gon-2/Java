package baekjoon.chapter3;

import java.util.Scanner;

public class Ex_J_10952 {

	public static void main(String[] args) {
		// a, b가 0 0 이 들어오기 전까지 a + b 연산프로그램을 만드시오
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(!(a == 0 && b == 0)) {
				System.out.println(a + b);
			}else {
				break;
			}
		}
	}
}
