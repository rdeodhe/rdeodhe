package Variable;

public class static_variable {

	static int a=10; // gobal variable
	
	public static void main(String[] args) 
	{
		static_variable abc =new static_variable();  //local variable call 
		abc.display();
		System.out.println("value of a is "+a); // same class
		System.out.println("value of p is "+static_variable_another_class.p);//diif class
		
		
		}
   public void display()
   {
	   int b=20;  // local variable
	   System.out.println("the value of "+a);
	   System.out.println("the value of "+b);
	   
	   
   }
}
