package baekjoon.chapter1;

import java.util.Scanner;

public class Ex_J_2588 {

	public static void main(String[] args) {
//		세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int iNum = sc.nextInt();
		String sNum = sc.next();
		
//		System.out.println("iNum: " + iNum);
//		System.out.println("sNum: " + sNum);
		
		System.out.println(iNum * (sNum.charAt(2) - '0')); // (sNum.charAt(2) - '0') -> 아스키코드로 변환 ex)0 : 48
		System.out.println(iNum * (sNum.charAt(1) - '0'));
		System.out.println(iNum * (sNum.charAt(0) - '0'));
		System.out.println(iNum * Integer.parseInt(sNum));
		
		
	}

}
