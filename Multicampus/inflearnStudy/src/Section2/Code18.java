package Section2;

import java.util.Scanner;

public class Code18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] data = new int[num];
		
		for (int i = 0; i < num; i++) {
			data[i] = num;
		}
		sc.close();

		for (int i = num - 1; i > 0; i--) {
			for (int j = 0; j < 1; j++) {
				if (data[j] > data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		} // for
		
		System.out.println("sorted data: ");
		for(int i = 0; i < num; i++) {
			System.out.println(data[i]);
		}
		

	} // main
} // class
