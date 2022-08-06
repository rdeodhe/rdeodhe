package polymorphism;

public class method_overridding {

	public static void main(String[] args)
	{
		velocity_sub vs=new velocity_sub();
		vs.testing();
		
		velocity_super vvs=new velocity_super();
		vvs.testing();
		
		vs.testing();
		vs.testing();

	}

}
