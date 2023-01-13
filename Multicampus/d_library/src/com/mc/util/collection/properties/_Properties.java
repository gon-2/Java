package com.mc.util.collection.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _Properties {

	// 1. properties
	// XML파일 입출력을 지원하면서 Key와 Value가 String으로 강제되는 고정된 Map이다

	// XML : Extensible Makrup Language
	// 확장 가능한 마크업 언어
	// Markup Language : 데이터를 저장하고 전달하기위해 디자인 된 언어, 미리 약속된 tag를 사용해 데이터를 저장하고 식별한다
	// XML은 확장가능한 마크업 언어이기 때문에, 언어차원에서 미리 정의된 tag는 없고, 사용자끼리 약속을 하면 됨

	// tag:
	// ex) <a>https://www.naver.com</a>
	// <a></a> : 태그
	// <a>: 여는태그 </a> : 닫는 테그
	// https://www.naver.com : 태그 사이에 있는 정보가 데이터가 된다.
	// id="t" : 태그의 속성
	// <a id ="t">https://www.naver.com</a> : 구체적인 속성과, 값을 가진 element

	public void studyPropreties() {

		Properties props = new Properties();

		// 저장
		props.setProperty("DATE", "202212151522");
		props.setProperty("DayOfWeek", "thurs");
		props.setProperty("time", "15:23");

		// 출력
		for (Object key : props.keySet()) {
			System.out.println(props.getProperty((String) key));
		}

		props.setProperty("Time", "17:50");
		System.out.println("//////////시간수정///////////");
		for (Object key : props.keySet()) {
			System.out.println(props.getProperty((String) key));
		}

		// 삭제
		props.remove("Time");
		System.out.println("//////////삭제///////////");
		for (Object key : props.keySet()) {
			System.out.println(props.getProperty((String) key));
		}
	}

	public void storeToXML() {
		Properties props = new Properties();

		// 저장
		props.setProperty("DATE", "202212151522");
		props.setProperty("DayOfWeek", "thurs");
		props.setProperty("time", "15:23");

		try (FileOutputStream fos = new FileOutputStream("prop.xml")) {
			props.storeToXML(fos, "date info");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void loadToXML() {
		Properties props = new Properties();
		
		try (FileInputStream fis = new FileInputStream("prop.xml")) {
			props.loadFromXML(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
