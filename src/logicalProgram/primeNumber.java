package logicalProgram;

public class primeNumber {

	public static void main(String[] args)
	
		// TODO Auto-generated method stub
       //div  quotient 
       //modular reminder
	 //jy no la swatni bhag jate ni 1 bhag jate mnje prime
		
		// 12 --.>2---11 (2 pasun strt krne end 12-1=11ni equal nai phije mnun<= nai kel only>)
		
	{
		int num=12;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("number is not greater than zero then it is not prime number");
		}
		
		
		else
		{
			System.out.println("number is  greater than zero then it is  prime number");
		}
	}

}
