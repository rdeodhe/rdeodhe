package abstract_study;

public class test_cc extends test_abstract{

	public static void main(String[] args) 
	{
		test_cc cc=new test_cc();
		cc.test();
		cc.test1();
		cc.test2();
		cc.smple();

	}
	public void smple()
	{
		System.out.println("this sample method of cc class");
	}
	@Override
	public void test() {
		System.out.println("this test method abstract class");
		
	}
	
		
		// test_cc extends to abstract class then we will show error on test class then show 
		// two availability like add unimplemented method or test as abstract class 
		// click on unimplemented 
		
	


}
