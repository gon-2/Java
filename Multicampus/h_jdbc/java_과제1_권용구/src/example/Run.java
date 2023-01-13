package example;

public class Run {

	public static void main(String[] args) {

		Product product1 = new Product("다이슨", "V10", "빨간색", 960000);
		Product product2 = new Product("다이슨", "V10", "빨간색", 960000);

		
		// 1. toString()
		System.out.println(product1);
		System.out.println(product2);
		
		// 2. equals()
		System.out.println(product2.equals(product1));

	}

}
