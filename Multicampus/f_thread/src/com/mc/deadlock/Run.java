package com.mc.deadlock;

public class Run {

	public static void main(String[] args) {
		
		
		School school = new School();
		Home home = new Home(school);
		school.setHome(home);
		
		Bottle bottle = new Bottle();
		Thread coffee = new Thread(new CoffeeThread(school, bottle));
		Thread soi = new Thread(new SoiThread(bottle, home));
		
		coffee.setName("커피소녀");
		soi.setName("간장소년");
		
		coffee.start();
		soi.start();

	}

}
