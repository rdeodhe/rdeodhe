package polymorphism;

public class final_overriding_test {

	public static void main(String[] args) {
		
		overridding_father f=new overridding_father();
		f.money();
		
		overridding_son s=new overridding_son();
		s.money();
		s.bike();
		
	}

}
