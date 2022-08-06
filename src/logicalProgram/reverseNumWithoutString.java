package logicalProgram;

public class reverseNumWithoutString {

	public static void main(String[] args) {
		// 123 --. 321
		
//		System.out.println(10/2);
//		System.out.println(10%2);
//		
//		System.out.println(11/2);  
//		System.out.println(11%2);

//		System.out.println(123/10);
//		System.out.println(123%10);
		
//		System.out.println(12%10);
//		System.out.println(1%10);
		int num =123; // 
		int revNum =0;
		for(int i=num;i>0;i=i/10)  //123,12,1
			
			// i>=0 zero peksh otha = 0 yener tr 0 nai hav mnun i>0)
		// 10 divide el mnun ans 3 2 1 yenr mnun i%10
		{
			int rem=i%10;//3,2,1
			//0+3-->3
			//3+2=5
			//5+1=6
			// System.out.println(rev);  output 3 2 1 but we want  in one line 321
		//revNum=revNum+rem;
		//0+3-->3
		//3+2=5
		//5+1=6
			revNum=revNum*10+rem;
			       //0+3=3
					//30+2=32
					//320+1=321
		
		}
		System.out.println("orignal number is "+num);
		System.out.println("reverse number is "+revNum);
	}

}
