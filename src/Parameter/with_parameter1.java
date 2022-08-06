package Parameter;

public class with_parameter1 {

	public static void main(String[] args) 
	{
		info("sunil",23,'a');
		with_parameter1 abc = new with_parameter1();
		abc.display('d', 349.430, false);
		
		
	}
  public static void info(String StudentName, int rollno,char grade) 
  {
	  System.out.println("Student name is "+StudentName);
	  System.out.println("rollno is "+rollno);
	  System.out.println("grade name is "+grade);

  }
  public void display(char a,double b, boolean c)
  {
	   System.out.println("value a is "+a);
	   System.out.println("value b is "+b);
	   System.out.println("value c is "+c);
  }
}
