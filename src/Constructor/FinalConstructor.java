package Constructor;

public class FinalConstructor 
{
         int a;
         int b;
         
     public FinalConstructor()  // zero parameter
     {
    	a=10;
    	b=20;
     }    
       public FinalConstructor(int x) // single parameter
       {
    	   a=x;
       }
         public FinalConstructor(int y ,int z)  // double parameter
         {
        	a=y;
        	b=z;
         }
	public static void main(String[] args) 
	{
		FinalConstructor abc=new FinalConstructor();
		abc.add();
		FinalConstructor obj = new FinalConstructor(20);
		obj.sub();
		FinalConstructor efg =new FinalConstructor(30,20);
		efg.mul();
	}

	public void add() 
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	public void sub() 
	{
		int sub=a-b;
		System.out.println("sub is "+sub);
	}
	public void mul()
	{
		int mul =a*b;
		System.out.println("mul is "+mul);
	}
	

}
