package baekjoon.chapter2;

import java.util.Scanner;

public class Ex_A_1330 {

	public static void main(String[] args) {
//		A가 B보다 큰 경우에는 '>'를 출력한다.
//		A가 B보다 작은 경우에는 '<'를 출력한다.
//		A와 B가 같은 경우에는 '=='를 출력한다.
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
//		System.out.println(a);
//		System.out.println(b);
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
			
		}
	
	}
	

}
