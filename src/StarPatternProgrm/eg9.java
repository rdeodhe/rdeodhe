package StarPatternProgrm;

public class eg9 {

	public static void main(String[] args) {
		//     *
		//    * *
		//   * * * 
		//  * * * * 
		//row =4 column 4 
		int space=3;
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star=star+1;
		}
	
	
	}

}
