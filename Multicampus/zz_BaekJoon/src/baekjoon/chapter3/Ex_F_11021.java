package baekjoon.chapter3;

import java.util.Scanner;

public class Ex_F_11021 {

	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println("Case #" + (i + 1) + ": " + (a+b));
			
		}
	}

}
