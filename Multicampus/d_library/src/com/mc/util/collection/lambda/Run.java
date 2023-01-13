package com.mc.util.collection.lambda;

import com.mc.util.collection.dto.Test;
import com.mc.util.collection.lambda.function.Predicate;

public class Run {
	public static void main(String[] args) {

		LambdaTest lt = new LambdaTest();

		// 화살표 함수(익명함수, 람다표현식 다 같은말이다)
		// (args...) -> {}

		// 1. 매개변수가 하나 밖에 없을 경우 매개변수의 괄호를 생략할수있다.
		// 2. 코드블록에 코드가 한 줄인 경우 메서드으 ㅣ코드블록을 생략할 수 있다.
		// 3. 화살표함수에서 매개변수의 타입은 생략할 수 있다.(Functional Interface에 이미 타입이 지정되어 있기 때문에 생략
		// 가능)

		lt.testConsumer(msg -> System.out.println(msg));

		// 4. 코드블록에 return문 밖에 없는 경우 메서드의 코드블록과 return 예약어를 생략 할 수 있다.

		lt.testSupplier(() -> " => 공급받은 문자열");

		lt.testPredicate(i -> {
			System.out.println(i + "의 홀짝여부 판단");
			return i % 2 == 0;
		});

		lt.testFunction((a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return a + b;
		});

		Test kor = new Test("국어", "권용구", 99);
		Test math = new Test("수학", "권용구", 85);

		System.out.println("국어 시험에 통과했니?");
		System.out.println(kor.isPass(t -> {
			return t.getScore() >= 70;
		}));

		System.out.println("수학 시험에 통과했니?");

		System.out.println(math.isPass(new Predicate<Test>() {

			@Override
			public boolean test(Test t) {

				return t.getScore() >= 30;
			}
		}));

	}
}
