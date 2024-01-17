package com.javaex.ex01;

import java.util.Iterator;

public class DigitThread extends Thread {

	// 필드
	// 생상자
	// 메소드
	public void run() {
		for (int i = 0; i < 300; i++) {

			System.out.println(i);
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println();
			}}}}// 숫자를 출력하는 스레드 클라스

		