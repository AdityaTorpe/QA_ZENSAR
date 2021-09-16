package org.Day5Qtn1;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Mailid {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maild id : ");
		String str = sc.nextLine();
		
        System.out.println(str.contains("@"));
        
    }
}