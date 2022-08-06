package casting;

public class final_upcasting {

	public static void main(String[] args) {
		//we call the son properties for father
	
	upcasting_father f=new upcasting_father();
	f.car();
	f.bike();
	
	upcasting_son s= new upcasting_son();
	s.bike();
	s.car();
	s.education();
	 System.out.println("========"); //upcasting progrm
	upcasting_father f1=new upcasting_son();
	f1.bike();f1.car();
	
	
	//upcasting_son s1=new upcasting_father() not possible
			
	}
	 
}
