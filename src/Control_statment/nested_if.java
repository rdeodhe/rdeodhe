package Control_statment;

public class nested_if {

	public static void main(String[] args) {
		// if user name correct then enter password
		// enter password then login success
		// password is correct login successful if
		//else password is incorrected then enter correct username
		
		String name="facebook";
	 String password="rash@12";
		if(name=="facebook") 
	{
			System.out.println("enter password");
		
		if(password=="rash@12")
		{
		 System.out.println("login success");	
		}
		else
		{
			System.out.println("password is incorrect");
		}
		
	}
		else
		{
			System.out.println("please enter correct username");
		}
		
	}

}
