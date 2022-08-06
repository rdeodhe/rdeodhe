package string_study;

public class string_method1to5 {

	public static void main(String[] args) {
		// length method 
		//length =(maxIndex)+1
		// max index=length -1
        // length start from zero
		//{object.lenghth} object =variable  length=string method name 
	    // index= 0 to 5  length =6 6 charter in rashmi word
		//OR by using refrance code
		
		//Length method
		String name ="rashmi";
		
		System.out.println(name.length()); 
		 //or
		int a = name.length();
		System.out.println(a);
		
		String obj = "mayur";
		System.out.println(obj.length());
		System.out.println("========");
		
		// toUpperCase method
		System.out.println(name.toUpperCase());
	
		
		String b = name.toUpperCase();
		System.out.println(b);
		System.out.println("======");
		
		//toLowerCase
		System.out.println(name.toLowerCase());
		String c = name.toLowerCase();
		System.out.println(c.toLowerCase());
		System.out.println("=======");
		
		// equal to checks content or  same sequence of char 
		//== method  memory location check krte same aaasen tr true
		
	 String e = "mayur";  //same memory location madhe save( mayur same) 
	 String f = "mayur";
	 String r="MAYUR";
	 String g = new String("mayur");  // diffrent memory location mdhe save hoen manun 
	 //ouput false
	 String h = new String ("mayur");
	String i = new String ("MAYUR");	
	     System.out.println(e==r);
		System.out.println(e==f);
		System.out.println(f==e);
		System.out.println(e==g);
		System.out.println(g==f);
		System.out.println(g==h);
		System.out.println(h==i);
		//equalto  check squeance of char 
	System.out.println("=======");
    System.out.println(e.equals(f));
	System.out.println(e.equals(g));
	System.out.println(e.equals(i));  // checking case sensitive capitl and small
	System.out.println(g.equals(i));
	
	 boolean result = e.equals(g);
	 System.out.println(result);
	 
	 boolean result1 = e.equals(i);
	 System.out.println(result1);
	 System.out.println("=======");
	
	 //equal Ignore case 
	 //squence and case sencitivity and capital letter
	 
	String city= "Wardha";
	String dist ="wardha";
	String village ="Wardha";
	
	System.out.println(city.equals(dist));
	System.out.println(city.equalsIgnoreCase(dist));
	System.out.println(city.equalsIgnoreCase(village));
	
	
	
	
	}  

}
