package com.mc.util.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mc.util.collection.dto.Test;

public class Run {

	// Stream 데이터 처리 연산을 제공
	public static void main(String[] args) {

		// Stream 생성
		Stream<Integer> iStream = Stream.<Integer>builder().add(11).add(12).add(13).add(14).build();
//		System.out.println(iStream.getClass());

		
		List<Test> list = new ArrayList<>();
		list.add(new Test("국어", "권용구", 90));
		list.add(new Test("영어", "권용구", 70));
		list.add(new Test("수학", "권용구", 65));
		list.add(new Test("과학", "권용구", 46));
		
		
		
//		Stream<Test> lStream = list.stream(); // 스트림 객체로 받는거
//		lStream.sorted((a,b) -> a.getSubject().compareTo(b.getSubject())).collect(Collectors.toList()); // 과목정렬
//		System.out.println("1. sort");
//		for (Test test : list) {
//			System.out.println(test);
//		}
		
		System.out.println("1. sort");
		list = list.stream()													// stream 객체 생성
				.sorted((a,b) -> a.getSubject().compareTo(b.getSubject()))		// intermediate operation,  가공, 중간연산 :stream 내부에서 연산을 수행
				.collect(Collectors.toList()); 									// terminal operation, 결과, 연산의 결과 값을 받는 작업을 수행
	
	
		//2. forEach는 return 타입이 void 이다
		// 메서드 참조
		// lambda의 구현코드가 특정메서드를 호출하는 용도로 사용될때
		// :: 을 사용해서 코드를 축약할 수 있다.
		// a -> System.out.println(a)
		// System.out.println ::println
		System.out.println("2.foreach");
		list.stream().forEach(a -> System.out.println(a));
		list.stream().forEach(System.out::println);
		
		
		//3. filter
		// 	조건에 맞는 요소만 필터링하기 위해 사용
		System.out.println("3.filter");
		// 시험점수가 70점 이상인 요소만 담긴 list를 반환(필터링)
		list = list.stream()
				.filter(a -> a.getScore() >= 70).collect(Collectors.toList());
		
		list.stream().forEach(System.out::println);
		
		// 4. map
		System.out.println("4. map");
		
		// Test List에서 학생들의 성만 추출하여 저장한 List를 만드세요
//		List<String >res = list.stream().map(a -> a.getName().substring(0,1).collect(Collectors.toList());
		
		//5. reduce
		System.out.println("5. reduce");
		//.reduce(T. identity, BinaryOperator<T> accumulator)
		// 누적연산을 시작하기 위한 초기값
		Integer res = iStream
				.reduce(0, (a,b) -> {
					System.out.println("기준 값 : " + a);
					System.out.println("요소 값 : " + b);
					return a+b;});
	}
}
