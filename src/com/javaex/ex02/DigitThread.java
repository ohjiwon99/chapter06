package com.javaex.ex02;

public class DigitThread extends Thread {

	// 메소드
	public void run() {
		for (int i = 0; i < 300; i++) {

			System.out.println(i);
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println();
			}

		}

	}

}
