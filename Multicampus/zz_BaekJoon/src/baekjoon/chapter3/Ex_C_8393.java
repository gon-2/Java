package baekjoon.chapter3;

import java.util.Scanner;

public class Ex_C_8393 {
	public static void main(String[] main) {

		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += i;
		}
		System.out.println(result);

	}
}
