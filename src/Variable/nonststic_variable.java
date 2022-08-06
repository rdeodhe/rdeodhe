package Variable;

public class nonststic_variable 
{
 int a = 20;
 
	public static void main(String[] args) {
		nonststic_variable  obj =new nonststic_variable();
		obj.display();
		System.out.println("value of a is "+obj.a);
		
		nonststic_variable  anc =new nonststic_variable ();
		anc.dis1();
		
	}
 public void display() 
 {
	 int b =3;
	 int c =50;
	 int d =40;
	 System.out.println("value of b is "+b );
	 System.out.println("value of a "+a);
	 System.out.println("value of c is "+c );
	 System.out.println("value of d is "+d );
	 System.out.println("=================" );
	
}
  public void dis1() 
  {
	  char grade = 'b';
	  System.out.println("grade is "+grade);
  }
}
