package logicalProgram;

public class factorialNumber {

	public static void main(String[] args) {
		// ekdi no eg 4 -1 krt jane tyche factorial ni srvnch multiplaction
		//4---> 4*3*2*1
		
		int num=10;
		int fact=1;
		for(int i=num;i>=1;i--) // 4 *3*2*1
		{
			fact=i*fact;
//			4*1=4;
//			3*4=12;
//			2*12=24;
//			1*24=24;
		}
		
		
		System.out.println("factorial number is "+fact);
		
}
}
