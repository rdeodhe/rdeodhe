package Control_statment;

public class else_if {

	public static void main(String[] args) {
		// if marks is less than 40 then he is failed
		//if marks is greater than 60 but less than 70 he is in second class
		//if marks is greater than 80 or less than 90 he is first
int marks=83;
if(marks<=60)
{
	System.out.println("he is failed");
}
	
	else if(marks>=60& marks<66)
	{
		System.out.println("he is in second class");
	}
	else if(marks>=80 & marks <90) 
	{
		System.out.println("he has first rank");
	
	}
	else 
	{ System.out.println("he is failed"); 
	}
		  

		
	}

}
