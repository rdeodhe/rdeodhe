package logicalProgram;

public class primeNumEG_2 {

	public static void main(String[] args) {
		// 11--->2---10
		int num=11;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				// 11%2=0 condtn true then if loop excute then counter increse
			{
				count++;
				break;
			}
		}
		if(count==1) // counter more then 1 asen or zero
		{
			System.out.println("it is not prime number");
		}
		else
		{
			System.out.println("it is prime number");
		}
	}

}
