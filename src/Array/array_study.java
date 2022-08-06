package Array;

public class array_study {

	public static void main(String[] args) {
		// rashmi  mayur  veeransh
		
		//array declaration
		String name[]=new String[3];
		
		// array initilazation
		        name[0]="rashmi";
				name[1]="mayur";
				name[2]="veeransh";
				//name[3]="zade";  exception out of bounds
				System.out.println(name[0]);
				System.out.println(name[1]);
				System.out.println(name[2]);
				System.out.println("======");
				
				//or static coding within i<=2
				for(int i=0;i<=2;i++) {
				System.out.println(name[i]);
				}
				System.out.println("===");
				//or  by using dynamic coding normal sequence
				for(int i=0;i<=name.length-1;i++) 
				{
					System.out.println(name[i]);
			
				}
				System.out.println("=====");
				// reverse sequence
              for(int i=name.length-1;i>=0;i--)
             {
            	  System.out.println(name[i]);
	}
	}

}
