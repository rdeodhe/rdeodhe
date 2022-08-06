package logicalProgram;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		//palimdrome means reverse and orinal string is display same 
		//output eg.mom =mom dad=dad
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter a string");
		
		String orignal = sc.next();
		String reverse = "";
		
		for (int i = orignal.length()-1;i>=0;i--) 
		{
			reverse=reverse+orignal.charAt(i);
		}
		System.out.println("orig nal string is "+orignal );
		System.out.println("reverse string is "+reverse);
		
		if(orignal.equals(reverse)) 
		{
			System.out.println("given string is palidrome");
		
		}
		else
		{
			System.out.println("given string is not palidrome");
		}
		
	}

}
