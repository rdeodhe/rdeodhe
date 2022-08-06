package StarPatternProgrm;

public class eg8 {

	public static void main(String[] args) {
		//   *
		//  ***
		// *****
		//*******
//column 7 row 4 space string psun mojne starting 3 kmi ahe 
		// 1st je asen tech star ghen
		//space kami hot ahe ni star wadht ahe 2 ni mnun last step
		
		
		int space=3;
		int star =1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}

}
