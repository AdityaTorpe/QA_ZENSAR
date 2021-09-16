package org.Day5Qtn1;
import java.util.Scanner;
public class Stringchck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string 1 : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter a string 2 : ");
		String str2 = sc.nextLine();
		
		boolean str = str1.equals(str2);
		System.out.println("Two strings are equal :" +str);
	}
}
