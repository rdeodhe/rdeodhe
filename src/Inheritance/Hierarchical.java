package Inheritance;

public class Hierarchical {

	public static void main(String[] args) 
	{
		father f=new father();
		f.bike();
		f.info();
		
		dauther d= new dauther();
		d.bike();
		
		d.girl();
		d.info();
		
		son2 s=new son2();
	s.bike();
	s.info();
	s.goodthing();
	
	son2.bad();
	dauther.habbit();
	}

}
