package string_study;

public class String_method_6to12 {

	public static void main(String[] args) 
	{
		//contains method checks squence and case sensitive means capital and small char check 
     String k ="katraj";
      System.out.println(k.contains("ka"));
     System.out.println(k.contains("Ka")); // case sensitive
      System.out.println(k.contains("tj"));
				
		boolean Name = k.contains("kj");
		System.out.println(k.contains("kj"));
		System.out.println("=======");
	
	//isEmpty method()  if length is zero then result is true
		String p="test";
		String q=" ";
		String r=null;
		String s="";
		System.out.println(p.length());
		//System.out.println(r.length());  // null pointer exception it is not possible
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		System.out.println(s.isEmpty());
		//System.out.println(r.isEmpty());  //error bcz null exception
		System.out.println("=======");
		
		//is blank if whitespace result true ,1 or 2 char result false
	 System.out.println(p.isBlank());
	 System.out.println(q.isBlank());
	 System.out.println(s.isBlank());
	 //System.out.println(r.isBlank());
	 System.out.println("=======");
	 
	 //charAT method()
	 String country ="INDIA"; // length of string o to 4
	 System.out.println(country.charAt(1));
	 System.out.println(country.charAt(3));
	 //System.out.println(country.charAt(6)); string_index_out_of_boundry
	// System.out.println(country.charAt(-1));
	 System.out.println("=======");
	 
	 //endsWith() sqence of char with end char
	  System.out.println(country.endsWith("A"));
	 System.out.println(country.endsWith("india"));
	 System.out.println(country.endsWith("INDIA"));
	 System.out.println("=======");
	 
	 //startWith method() start with which char
	 System.out.println(country.startsWith("IN"));
	 System.out.println(country.startsWith("in"));
	 System.out.println(country.startsWith("A"));
	 System.out.println("=======");
	 //startWith prefix toffset
	 System.out.println(country.startsWith("I", 4));
	 System.out.println(country.startsWith("I", 4));
	 System.out.println("=======");
	 
	 //subString method()
	 
	 String fullName ="rashmi mayur zade";
	 
			 
	System.out.println(fullName.substring(7));

	System.out.println(fullName.substring(11, 17));
	System.out.println("=======");
	
	//concat method() 2 and more than 2  string
	String	x = " Pune";
	String y =" Wardha";
	String z =" nagpur";
	System.out.println(x.concat(y));
	System.out.println(y.concat(x));
	System.out.println(z.concat(y));
	//or
	System.out.println(x.concat(" Wardha"));
	
	
	}

}
