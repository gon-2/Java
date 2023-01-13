package com.mc.j_inner;

public class Book {
	
	private String name;
	private int price;
	private String author;
	
	private Book(Builder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.author = builder.author;
	}
	
	//inner static 클래스를 사용해서 속성을 초기화
	public static class Builder{
		
		private String name;
		private Integer price;
		private String author;
		
		public Builder name(String name) {
			//inner static 클래스는 외부 클래스의 인스턴스변수에 접근이 불가능
			//외부클래스의 인스턴스 없이도 내부클래스를 인스턴스화 할 수 있기 때문.
			this.name = name;
			return this;
		}
		
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		
		public Book builder() {
			//builder 메서드 호출시에 name, price, author 속성이 모두 초기화 되지 않았다면 예외를 발생 시켜보자.
			return new Book(this);
		}
	}
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
	

}
