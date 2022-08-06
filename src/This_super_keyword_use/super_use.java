package This_super_keyword_use;

public class super_use extends this_use {
	int b =20;
	//int c=30;
	static int e=89;

	public static void main(String[] args) {
		
		super_use s=new super_use();
		s.subtraction();
		
		
	}
	public void subtraction() 
	{
		int c=900;
		int b=1000;
		//int sub =b-800;
		//int sub1=c-700;
		
		//System.out.println("subtraction is "+sub);
		//System.out.println("subtraction is "+sub1);
		//int sub2=super.b-500;
		//int sub3=super.a-50;
	//	System.out.println("subtraction is "+sub3);
		//System.out.println("subtrction is "+sub2);
		
		int sub5=c-b; // 900-1000
		System.out.println("subtrction is "+sub5);
		
		int sub6=super.c-b; // b is this keyword global varible  80-1000
		System.out.println("subtr is "+sub6);
		
		int sub8=this.c-b; //900-20
		System.out.println("subtrction is "+sub8);
		
		
				
	}

}
