package com.Exception;

public class TryCatchException {

	public static void main(String[] args) {
		int i = 100;
		int j = 0;
		int data;
		try {
			data = i/j;
		}catch(Exception e) {
			System.out.println(i/(j+2));
		}

	}

}
