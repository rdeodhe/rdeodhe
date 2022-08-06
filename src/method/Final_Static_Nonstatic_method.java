package method;

public class Final_Static_Nonstatic_method {

	 
	public static void main(String[] args) 
	{
	     details();     //static method called
	
		Final_Static_Nonstatic_method Mother = new Final_Static_Nonstatic_method();
	Mother.Info();
                   // non static method called
	
	AnotherClass_static_nonstatic.family();//static method called another class
	
	
	AnotherClass_static_nonstatic members = new AnotherClass_static_nonstatic();
	members.Class(); // non static method called another class
	
	
	}
   public static void details() 
   {
	   System.out.println("Madhuri");
	   
   }
	public void Info() 
	{
		System.out.println("Zade");
	}
	
}
