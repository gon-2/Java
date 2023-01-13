package com.mc.file;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class B_BFileIO_1 {
	
	// 1.IO(Input, Output)
	// 입출력 : 외부자원(OS, DB서버, API서버 등등...)으로 부터
	//			자바의 프로그램(메모리)으로 데이터를 일겅 오거나, 또는 외부자원으로 데이터를보내는 것
	
	// 2. Stream
	//    데이터가 오가는 단방향 통로이다. 입력을 위한 InputStream, 출력을 위한 OutputStream이 존재
	//    Stream의 사용이 끝나면 반드시 Stream을 닫아 줘야한다.
	//	  만약 사용이 끝난 Stream을 닫지 않으면, JVM이 알아서 닫아준다. 그럼에도 반드시 수동으로 
	//	  닫아주는 것을 원칙으로 한다.
	
	// 3. Stream의 구분
	//    1. ByteStream : 데이터가 1바이트 단위로 입출력됨
	//    2. 문자스트림 : 데이터를 2바이트(Char 크기) 단위로 입출력됨
	//    
	//    - 기반스트림 : 실제로 외부자원과 데이터를 입출력 하는 스트림
	//    				 FileInputStream, FileOutoutStream
	
	//    - 보조스트림 :  기반스트림에 기능을 추가해주는 데코레이터
	
	//          		  BufferedInputStream, BufferedOutputStream
	//					  - 속도 향상을 위해 버퍼를 사용
	
	//					  ObjectInputStream, ObjectOutputStream
	//     				  - 객체를 직렬화 하기 위해 사용
	
	//					 InputStreamReder, OutputStreamWriter
	//					 - 바이트 기반의 스트림을 문자기반의 스트림으로 변환
	
	public void writerFile() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 : ");
		String fileName = sc.nextLine();
		System.out.println("파일 내용을 작성하세요: ");
		String contents = sc.nextLine();
		
		// tye_with-resource : 자동으로 닫을 수 있는 객체에 한해서, 자동으로 close 처리를 해주는 구문
		try(FileOutputStream fos = new FileOutputStream(fileName, true)){
			fos.write(contents.getBytes());
			System.out.println("파일 생성이 완료되엇습니다. 프로젝트를 새로고침 하세용");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
