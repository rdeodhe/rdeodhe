package Array;

public class integerstudy {

	public static void main(String[] args) {
		//1 to 5
		int num[]=new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=3;
	    num[3]=4;
	    num[4]=5;
	   System.out.println(num[0]);
	    System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
System.out.println("=====");
	
		
	for(int j=0;j<=num.length-1;j++)
	{
		System.out.println(num[j]);
	  }
	System.out.println("=====");
	
	for(int i=num.length-1;i>=0;i--)
	{
		System.out.println(num[i]);
	}
	}
		
	}

