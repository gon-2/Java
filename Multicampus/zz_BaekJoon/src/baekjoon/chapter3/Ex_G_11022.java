package baekjoon.chapter3;

import java.util.Scanner;

public class Ex_G_11022 {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
		//x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));

		}
	}
}
