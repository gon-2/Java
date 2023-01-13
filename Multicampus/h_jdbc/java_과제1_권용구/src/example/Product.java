package example;

import java.util.Objects;

public class Product {

	private String brand;
	private String productUID;
	private String color;
	private int price;

	public Product() {

	}

	public Product(String brand, String productUID, String color, int price) {
		super();
		this.brand = brand;
		this.productUID = productUID;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductUID() {
		return productUID;
	}

	public void setProductUID(String productUID) {
		this.productUID = productUID;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productUID);
	}

	@Override
	public boolean equals(Object o) {
		

		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		return price == product.price && Objects.equals(productUID, product.productUID);
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", productUID=" + productUID + ", color=" + color + ", price=" + price + "]";
	}

}
