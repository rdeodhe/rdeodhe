package Parameter;

public class Without_parameter {

	public static void main(String[] args) 
	{
		display();//same class static method
		Without_parameter abc = new Without_parameter();
		abc.screen(); // same class non static
		without_Parameter_another_class .display1(); //another class static method
		without_Parameter_another_class  obj=new without_Parameter_another_class  ();
		obj.screen1();
	}

	public static void display() 
	{
		int a=10;
		int b=20;
	 int sum =a+b;
		System.out.println("addtion is "+sum);
	}
	public void screen() 
	{
		int c=24;
		int d=12;
		int div =c/d;
		System.out.println("subtraction is "+div);
	}
}
