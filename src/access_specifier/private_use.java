package access_specifier;

public class private_use {

	public static void main(String[] args) 
	{
		private_use p=new private_use();
		p.test();
		p.test1();
		p.test2();
		p.test3();
		

	} 
	private void test()
	{
		System.out.println("this is private method ");
	}
	 void test1()
	 {
		 System.out.println("this is dafult method ");
		 }
	 
	protected void test2()
	{
		System.out.println("this is protected method ");
		}
	
	public void test3() {
		System.out.println("this is public  method ");
		}
	}
	


