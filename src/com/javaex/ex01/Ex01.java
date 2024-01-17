package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new DigitThread();
		thread.start();

		for (char ch = 'A'; ch <= 'z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}// main 메소드를 포함하는 클래스
