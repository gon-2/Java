package com.mc.util.collection.lambda.function;

@FunctionalInterface // 람다식이라고 알려주는거
public interface Predicate<T> {

	boolean test(T t); // 오버라이드 해야하는 메서드가 하나임 두개 선언 하면 에러남

}
