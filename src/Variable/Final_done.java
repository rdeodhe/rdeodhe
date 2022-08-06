package Variable;

public class Final_done {

	
	static int a =10;
	int b=20;
	
	public static void main(String[] args)
	{
		Final_done abc = new Final_done();
		abc.display(); // non static 
		System.out.println("value of bis "+abc.b); 
		
		System.out.println("value of a is "+a);//same class static method
		
		System.out.println("value of c "+Final_done_another.c); // diff class with static variable
	
		Final_done_another su=new Final_done_another();
		
		System.out.println("value of f is "+su.f);
	 
		
		
	}
 public void display() //non static 
 {
	 int d=23;
	 System.out.println("value of d "+d);
	
 }
 
}
