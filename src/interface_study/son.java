package interface_study;

public class son implements father,mother{

	public static void main(String[] args) 
	{
		son s=new son();
		s.bike();
		s.car();
		s.care();
		s.help();
		s.money(); //father mother money method  complete in son method thats why it son method
	// but we give body to the mother , father then error found then create to default
	// but again we confuse konchi money method ahe father mother thts why we use super keyword
	
	// caleed static method statci metod la override or duplicate nai kru shakt
		father.rules();
		mother.rules();
	}

	@Override
	public void care() {
		
		System.out.println("mother  care method completed in  son class");
	}

	@Override
	public void help() {
		
		System.out.println("mother help methodcompleted in  son class");
	}

	@Override
	public void car() {
		
		System.out.println("father car method completed in  son class");
	}

	@Override
	public void bike() {
		
		System.out.println("father bike method completed in  son class");
	}

	@Override
	public void money() 
	{
		father.super.money();
		mother.super.money();
		
	}

}
