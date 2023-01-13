package baekjoon.chapter4;

import java.util.Scanner;

public class Ex_A_10807 {

	public static void main(String[] args) {
		// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (v == arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
