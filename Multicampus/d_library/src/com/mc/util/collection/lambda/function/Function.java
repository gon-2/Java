package com.mc.util.collection.lambda.function;

@FunctionalInterface
public interface Function<T> {
	
	T apply(T t, T u);	
}
