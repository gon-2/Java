package baekjoon.chapter3;

import java.util.Scanner;

public class Ex_D_25304 {

	public static void main(String[] args) {
		//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 
		//일치하지 않는다면 No를 출력한다.
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();

		int cnt = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < cnt; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();

			sum += price * num;
		}

		if (sum == total) System.out.println("Yes");
		else System.out.println("No");

	}

}
