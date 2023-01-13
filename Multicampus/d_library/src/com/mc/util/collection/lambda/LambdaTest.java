package com.mc.util.collection.lambda;

import com.mc.util.collection.lambda.function.Consumer;
import com.mc.util.collection.lambda.function.Function;
import com.mc.util.collection.lambda.function.Predicate;
import com.mc.util.collection.lambda.function.Supplier;

public class LambdaTest {

	public void testConsumer(Consumer<String> c) {
		String msg = "LambdTest.testConsumer";
		c.accept(msg);
	}
	
	public void testSupplier(Supplier<String> s) {
		System.out.println( "LambdaTest.testSupplier" + s.get());
	}
	
	public void testPredicate(Predicate<Integer> p) {
		int i = (int)(Math.random()*100);

		if(p.test(i)) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
	}
	
	public void testFunction(Function<String> f) {
		System.out.println(f.apply("LambdaTest", ".testFunction"));
	}
}
