package com.mc.e_solution;

public class SoiThread implements Runnable {

	private Bottle bottle;
	School school = new School();
	Home home = new Home(school);
	
	public SoiThread(Bottle bottle) {
		super();
		this.bottle = bottle;
	}


	@Override
	public void run() {
		
		while(true) {
			
			System.out.println(Thread.currentThread().getName() + " : 간장 발견!");
			System.out.println(Thread.currentThread().getName() + bottle.input("간장") + " 냉장고에 넣는다!");
			home.leaveHome("간장소년");
		}

	}

}
