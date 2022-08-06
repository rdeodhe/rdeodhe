package Control_statment;

public class switch_statement {

	public static void main(String[] args) {
		
		         // Year 1--> Welcome to 1st year engg
				// Year 2--> Welcome to 2nd year engg
				// Year 3--> Welcome to 3rd year engg
				// Year 4--> Welcome to 4th year engg
				// Year default--> Please enter year between 1-4
           int year=4;
           switch(year) 
           {
           case 1:System.out.println("welocme to year 1st engg");
           break;
           case 2:System.out.println("welocme to year 2nd engg");
           break;
           case 3:System.out.println("welocme to year 3rd engg");
           break;
           case 4:System.out.println("welocme to year 4th engg");
           break;
           default:System.out.println("plz enter year between 1-4");
           
           }
        // PNQ--> Welcome to Pune AirPort
   		// BOM--> Welcome to Mumbai AirPort
   		// NGP--> Welcome to Nagpur AirPort
            
           String city = "RPN";
           
           
           switch(city)
           {
           case "PNQ":System.out.println("welocme to pune airpot");
           break;
           case "BOM":System.out.println("welocme to mumbai airpot");
           break;
           case "NGP":System.out.println("welocme to nagpur airpot");
           break;
           default:System.out.println("welcome to city between pune, mumbai, nagpur");
           break;
           }
            
	}

}
