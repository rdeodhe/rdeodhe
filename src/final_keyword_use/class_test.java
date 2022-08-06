package final_keyword_use;

public class class_test {

	public static void main(String[] args) {
		
	int a=10;
	a=a+20;

	System.out.println("value of a "+a);
	
	final int b=30;
	//b=b+20;// (20) its found error bcz of if we make any variable as final then we cant update 
	//value again final variable is b 
	int sum =a+b;
			
	}
	public void sample()
	{
		System.out.println("its a demo method of class test");
	}

}
