package baekjoon.chapter3;

import java.util.Scanner;

public class Ex_H_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		int cnt = sc.nextInt();
		String star = "★";
		for(int i = 0; i < cnt; i++	) {
			System.out.println(star);
			star += "★";
		}
	}
}
