package com.mc.util.collection.lambda.function;

@FunctionalInterface
public interface Supplier<T> { // 받는 값은 없지만 반환하는 값은 있음
	
	T get();

}
