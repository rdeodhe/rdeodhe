package polymorphism;

public class overloading_studing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading_studing abc =new overloading_studing();
		abc.add();
		abc.add(10, 20);
		abc.add(10, 20, 30);
	}
	public void add()
	{  int a =20;
	int b=30;
	int sum3=a+b;
		System.out.println("addtion is  "+sum3);
	}
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("addtion is "+sum);
	}
	public void add(int a, int b, int c)
	{ int sum1=a+b+c;
	System.out.println("addtion is "+sum1);
	}
	
	

}
