package baekjoon.chapter2;

import java.util.Scanner;

public class Ex_G_2480 {

	public static void main(String[] args) {
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

		Scanner sc = new Scanner(System.in);
		 
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
 
		// 만약 모든 변수가 다른 경우
		if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			int dice;
			// 만약 dice1 > dice2 라면
			if (dice1 > dice2) {
				// dice3 > dice1 > dice2 라면
				if (dice3 > dice1) {
					dice = dice3;
				} 
				// dice1 > (dice2, dice3)
				else {
					dice = dice1;
				}
			}
			// dice2 > dice2 라면	
			else {
				// dice3 > dice2 > dice1 라면
				if (dice3 > dice2) {
					dice = dice3;
				}
				// dice2 > (dice1, dice2)
				else {
					dice = dice2;
				}
			}
			System.out.println(dice * 100);
		}
		// 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
		else {
			// 3개의 변수가 모두 같은 경우
			if (dice1 == dice2 && dice1 == dice3) {
				System.out.println(10000 + dice1 * 1000);
			}
			else {
				// dice1이 dice2혹은 dice3랑만 같은 경우
				if(dice1 == dice2 || dice1 == dice3) {
					System.out.println(1000 + dice1 * 100);
				}
				// dice2이 dice3랑 같은 경우
				else {
					System.out.println(1000 + dice2 * 100);
				}
			}
		}
	}
}
