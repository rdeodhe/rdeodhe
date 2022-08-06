package Constructor;

public class UserdefinedWithZreroparamete 
{
	int a;
	int b;
	
	
	public UserdefinedWithZreroparamete()       // zero parameter
	{
		 a=10;
		 b=20;
	}

	public static void main(String[] args) 
	{
		UserdefinedWithZreroparamete obj = new UserdefinedWithZreroparamete();
		obj.MyMethod();
		
		UserdefinedWithZreroparamete abc= new UserdefinedWithZreroparamete();
		abc.MyMethod();
		
	}
   public void MyMethod()  
   {
	  int sum =a+b; 
	  System.out.println("addtion is "+sum);
	  
	  int sub=a-b;
	  System.out.println("subtration is "+sub);
	   
   }
	
	
}
// zero parameter kdhi hoto jeva method call krto main string mdhe teva tithe vale assign nai 
// krt tyla zero paramter obj = new cls name() ethe