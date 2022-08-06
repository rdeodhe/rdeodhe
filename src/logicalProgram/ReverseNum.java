package logicalProgram;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args)
	{
		//no convert string that string convert num
		
		
  int num =123;
       String stringnum = Integer.toString(num); // convert num to strig
       String reverse = "";
     
       for(int i=stringnum.length()-1;i>=0;i--) 
       {
    	  reverse= reverse+stringnum.charAt(i);
       }
       System.out.println(reverse);
       //convert strng to num i.e integer
       
       
      int reverseNum = Integer.parseInt( reverse);
      System.out.println("orignal no is "+num);
      System.out.println("reverse number is "+reverseNum);
	}

}
