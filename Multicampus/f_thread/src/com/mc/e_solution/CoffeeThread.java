package com.mc.e_solution;

public class CoffeeThread implements Runnable {
	
	private Bottle bottle;
	School school = new School();
	Home home = new Home(school);

	public CoffeeThread(Bottle bottle) {
		super();
		this.bottle = bottle;
	}



	@Override
	public void run() {

		while (true) {
			school.leaveSchool("커피소녀");
			System.out.println(Thread.currentThread().getName() + " : 커피 발견!");
			System.out.println(Thread.currentThread().getName() + bottle.input("커피") + " 마신다!");
		}

	}

}
