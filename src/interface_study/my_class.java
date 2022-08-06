package interface_study;

public class my_class implements My_interface {

	public static void main(String[] args) 
	{
		my_class RD=new my_class();
		RD.test();
		RD.test1();
		RD.mymethod();
	}

	@Override
	public void test() {
		System.out.println("hi this incomplte to complete");
		
	}

	@Override
	public void test1()
	{
		
		System.out.println("hi this incomplte to complete");
	}

	public void mymethod()
	{
		System.out.println("my method of my class");
	}
}
