package logicalProgram;

import java.util.Scanner;

public class RecerseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the string value");
		//we want string in reverse thats why return type string 
		//scrent shot takent in mob for eg
		
		String a = sc.next();// orinal string
		String b = "";// reverse string
		
		//apply for loop index 0 1 2 3 that why we wriiten in greater than 0 and i--
		
		for(int i=a.length()-1;i>=0;i--) 
		{
			//a.charAt(i)
			b=b+a.charAt(i);  // +b and store in same variable
			
			
		}
		System.out.println("plz enter the string value "+a);
		System.out.println("plz enter the string value "+b);
	}

}
