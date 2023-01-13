package com.mc.c_race_condition;

public class Run {

	public static void main(String[] args) {
		
		
		
		Bottle bottle = new Bottle();
		Thread coffee = new Thread(new CoffeeThread(bottle));
		Thread soi = new Thread(new SoiThread(bottle));
		
		coffee.setName("커피소녀");
		soi.setName("간장소년");
		
		coffee.start();
		soi.start();

	}

}
