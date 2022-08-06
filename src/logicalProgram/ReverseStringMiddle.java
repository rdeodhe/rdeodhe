package logicalProgram;

public class ReverseStringMiddle {

	public static void main(String[] args) 
	{
		// q---. even place or ending two word reverse kr

		
		//even string reverse love nd india 2 and 4
		
           
           //array[]={"I","LOVE","MY","INDIA"}
		//             1    2      3    4
		
		String a="I LOVE MY INDIA"; //index 3
		String[] array = a.split(" ");
          
		for(int i=0;i<=array.length-1;i++)
           {
        	  // if(i%2==0) //odd  1%2==0
        	   if(i%2!=0)// for even
        	   {
        		  String s =array[i];
        		  array[i]=reverse(s);
        	   }
        		   
           }
         for(int i=0;i<=array.length-1;i++)
         {
        	 System.out.println(array[i]);
         }
          }
//create method 
	public static String reverse(String input)
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
			
		}
		return rev;
	}
}
