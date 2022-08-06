package StarPatternProgrm;

public class eg5 {

	public static void main(String[] args) {
		//       *
		//      **
		//     ***
		//    ****
		//   *****
//row 5 column 5
		//four space and then *
		//space kami star, vadhat outer row vadht ahe
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++ )
			{
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
		}
	}

}
