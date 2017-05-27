package com.dj.ConnectionPool;

public class Test {
	public static void main(String[] args) {
		for (int i = 1; i <2; i++) {
			new MyThread1().start();
		}
	}
}