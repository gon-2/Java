package com.mc.j_inner;

public class Car {

	private String name;
	private int price;
	private String size;

	// getter/setter 를 사용하지않고 inner 클래스를 사용해서 속성 초기화
	// 가급적, 외부클래스 안에서만 inner instance클래스를 사용하는 편이 좋다
	// 바깥에서 inner instance클래스를사용할 경우, 내부 클래스가 외부클래스를 
	public class Builder { // class는 Builder 얖에 () 안면안됨
		

		public Builder name(String name) {

			// 필드변수에 접근해서 초기화
			// 내부 클래스에서 외부 클래스의 필드에 접근할때는 외부클래스의 이름을 명시해주어야함
			Car.this.name = name;

			return this;
		}

		public Builder price(int price) {
			Car.this.price = price;
			
			return this;
		}

		public Builder size(String size) {

			Car.this.size = size;

			return this;
		}

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", size=" + size + "]";
	}

}
