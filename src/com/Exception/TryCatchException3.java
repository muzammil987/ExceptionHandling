package com.Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw;
		try {
			pw = new PrintWriter("jtp.txt");
			pw.println("Saved");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
		System.out.println("File saved successfully");
		
		

	}
	
	

}
