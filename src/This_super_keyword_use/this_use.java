package This_super_keyword_use;

public class this_use {
 
	int a=70; // global variable
	int b=40;
	 int c=80;
	public static void main(String[] args)
	{
	this_use t=new this_use();
			t.addtion();
	
	}
	public void addtion() 
	
	{
		int a=30; //local variable
		
		int sum = a+800; //30+800
		System.out.println("addition is "+sum);
		int sum1=this.a+800;  // to call global varible 70+800
		System.out.println("addision is "+sum1);
	}

}
