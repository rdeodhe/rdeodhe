package string_study;

public class string_method13to16 {

	public static void main(String[] args) {
		// indexoff method
		//same char avaible in one word 
		 
		String state = "Maharashtra"; //
		 System.out.println(state.indexOf('a'));
		 System.out.println(state.indexOf('s'));
		 System.out.println(state.indexOf('a', 4));
		System.out.println(state.indexOf("Mahar", 5));
		System.out.println("========");
		
		//lastindexoff // last char value/index
		System.out.println(state.lastIndexOf('h'));
		System.out.println(state.lastIndexOf('a'));
		System.out.println(state.lastIndexOf("har"));
		System.out.println(state.lastIndexOf('r', 10));
		System.out.println(state.lastIndexOf("rash",8));
		
		System.out.println("========");
		
		//replace method
		
		String city="pune";
		System.out.println(city.replace('p','q')); //single char 
		System.out.println(city.replace("pu", "du"));//char sequence
		
		String city1= "pune wardha nagpur";
 		
		System.out.println(city1.replaceAll(" ", "-")); // regex char or space asen use krtne
	    System.out.println(city.replaceFirst("pune", "jejuri"));
		System.out.println("====");
		//split method
	    // by using array 
	    String name=" I LOVE MY INDIA";
	   String obj[]=name.split(" ");
	   
	   for(int i=0;i<=obj.length-1;i++)
	   {
		   System.out.println(obj[i]);
	   }
	   System.out.println("====");
	   // this_is_my_country
	   
	   String n= "this_is_my_country";
	   String AR[]=n.split("_");
	   for(int i=0;i<=AR.length-1;i++)
	   { 
		   System.out.println(AR[i]);
	   }
	   
		
	}

}
