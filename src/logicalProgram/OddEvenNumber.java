package logicalProgram;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		//given no is odd or even //% it give reminder baki kiti ahe
		//eg 10%2= 0 eg 10/2= 5
		
		//System.out.println(11/2);
		//System.out.println(11%2);
		
		//reminder is zero then it is even no. and  if non zero then it it odd
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int a = sc.nextInt();
	
		if(a%2==0)  // eg a value 10%2 o/p means reminder zero if statement true
		{
			System.out.println("number is even no");
		}
		else
		{
			System.out.println("no is odd no ");
		}
	}

}
