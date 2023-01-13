package com.mc.file;

import java.util.Scanner;

public class D_PrintWriter {

	public void printWriter() {
		
		//System.in : 표준입출력장치(키코드)로 부터 데이터를 입력 받는 스트림
		// System.out : 표준 출력장치(모니터)로 데이터를 출력하는 스트림
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 : ");
		String fileName = sc.nextLine();
		System.out.println("파일내용을 작성하세요 : ");
		String contents = sc.nextLine();
		
		//try-with-resource : 자동으로 닫을 수 있는 객체에서 
	}	
	
	
}
