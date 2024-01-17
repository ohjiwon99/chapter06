package com.javaex.ex03;

public class DigitThreadImpl implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i <=0; i++) {
			System.out.println(i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
