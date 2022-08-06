package StarPatternProgrm;

public class eg6 {

	public static void main(String[] args) {
         // *****
		//   ****
		//    ***
		//     **
		//      *
		            //row 5 col 5;
		//phile space khalun bghne
		int space=0; // vrun vichr krne
		int star=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=star;m++)
			{
				System.out.print("*");
			}
			star--;
			space++;
			System.out.println();
		}
	}

}
