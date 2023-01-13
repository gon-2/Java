package baekjoon.chapter4;

import java.util.Scanner;

public class Ex_B_10871 {
	public static void main(String[] args) {

		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때,
		// A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < x) {
				System.out.print(arr[j] + " ");
			}
		}

	}
}
