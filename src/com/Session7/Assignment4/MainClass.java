package com.Session7.Assignment4;

import java.util.Scanner;

public class MainClass {

	/*
	 * Main Objective : Handle StringIndexOutOfBound Exception. It will occur whenever an index is invoked of a string,
	 * which is not in the range.
	 * 
	 * Program Description 
	 * Print reverse of a given String value.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		
	
		String temp = new String(); 
		for (int i= str.length()-1; i >=-1; i--)
		{
			try {
				temp = temp+ str.charAt(i);
			} catch (StringIndexOutOfBoundsException e) {

				System.out.print("Reverse String is:" + temp);
				
				System.out.println("\nWarning: String have only "+str.length() + " characters");
			}
			
		}
		
	}
}

