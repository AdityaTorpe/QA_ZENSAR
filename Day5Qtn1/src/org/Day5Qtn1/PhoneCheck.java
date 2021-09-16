package org.Day5Qtn1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

class PhoneCheck {
    
    
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Phone numbder  : ");
		String s = sc.nextLine();

 
        
        if (isValid(s))
 
            
            System.out.println("Valid Number");
        else
 
            
            System.out.println("Invalid Number");
 
       
    }

	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	
}