package com.mc.exception.runtime;

import java.util.Scanner;

public class _Exception {

	// Compile Exception : 컴파일 시점에발생하는 예외, 이클립스가 빨간 줄로 표시해주는 예외
	// Runtime Exception : 실행되는 상황에서 발생하는 예외

	// Checked Exception : 코드로 예외발생을 차단할 수 없기 때문에, 예외처리를 강제하는 exception
	// Unchecked Exception : 코드로 예외발생을 차단할 수 있기 때문에, 예외처리를 강제하지 않는 Exception

	// 예외처리 방법
	// try - catch문 : try블록에 예외가 발생할 수 있는 코드를 작성, catch블록에 예외처리에 필요한 코드를 작성한다.
	// try-catch-finally : try블록에 예외가 발생할 수 있는 코드를 작성, catch블록에 예외처리에 필요한 코드를 작성한다.
	// finally 블록에 예외 발생 ㅕ부와 상관없이 수행 되어야 하는 코드를 작성

	public void arithEx() {

		// AritmeticException : 수학적으로 예외적인 상황이 되었을때 발생되는 예외
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 제수 : 나누는 수, 피제수 : 나누어 지는 수
			System.out.println("피제수 하나를 정수로 입력하세요.");
			int num = sc.nextInt();
			int random = (int) (Math.random() * 4);

			if (random == 0) {// 예외처리
				System.out.println("앗 0이나와서 다시 입력해주세요.");
				continue;
			}

			int result = num / random;
			System.out.println("나누어진 몫은 " + result + "입니다.");

		}
	}

	// 2. try-catch 방법으로 예외처리
	public void arithEx2() {

		// AritmeticException : 수학적으로 예외적인 상황이 되었을때 발생되는 예외
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 제수 : 나누는 수, 피제수 : 나누어 지는 수
			System.out.println("피제수 하나를 정수로 입력하세요.");
			int num = sc.nextInt();

			try {
				int random = (int) (Math.random() * 4);
				int result = num / random;
				System.out.println("나누어진 몫은 " + result + "입니다.");

			} catch (ArithmeticException e) {
				System.out.println("앗 0이나와서 다시 입력해주세요.");
				continue;
			}

		}
	}

	// 2. try-catch-finally 방법으로 예외처리
	public void arithEx3() {

		// AritmeticException : 수학적으로 예외적인 상황이 되었을때 발생되는 예외
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 제수 : 나누는 수, 피제수 : 나누어 지는 수
			System.out.println("피제수 하나를 정수로 입력하세요.");
			int num = sc.nextInt();

			try {
				int random = (int) (Math.random() * 4);
				int result = num / random;
				System.out.println("나누어진 몫은 " + result + "입니다.");

			} catch (ArithmeticException e) {
				System.out.println("앗 0이나와서 다시 입력해주세요.");
				continue;
			} finally {
				System.out.println("============================================");
			}

		}
	}

	// try문 안에서 여러 종류의 예외가 발생할 때 처리하는 방법
	public void studyMultiException() {
		try {
			// ClassCastException : 형변환 가정에서 문제가 생겼을 떄 발생
			Object obj = new Object();
//			String str = (String) obj;

			// ArrayindexOutOfBoundsException
			int[] arr = new int[2];
			arr[2] = 3;

			// NullPointException : 레퍼런스에 주소값 대신 null이 들어가 있는데 참조를 시도할 경우 발생하는 예외
			String nulStr = null;
			nulStr.equals("A");

//		} catch (NullPointerException e) {
//			System.out.println("예외가 발생했습니다!");
//			System.out.println(e.getMessage());
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("예외가 발생했습니다!");
//			System.out.println(e.getMessage());
//			
//		} catch (ClassCastException e) {
//			System.out.println("예외가 발생했습니다!");
//			System.out.println(e.getMessage());
//		}
//		} catch (Exception e) { // 다형성을 이용해 try블록에서 발생하는 모든 예외에 대해 일괄적인 에외처리를 사용
//			System.out.println("뀨잉");
//			System.out.println(e.getMessage());
//		}

			// 자바 7(1.7) 부터 지원
		} catch (ClassCastException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("뀨잉");
			System.out.println(e.getMessage());
		}
	}

}
