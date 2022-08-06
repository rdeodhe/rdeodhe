package StarPatternProgrm;

public class eg11 {

	public static void main(String[] args) {
		// *****  1
		// ****   2
		// ***    3
		// **     4
		// *      5
		// **     6
		// ***    7
		// ****   8
		// *****  9
		//row 9 column 5 
		// 5th line mdhe star kmi nd vadhte
		
		int star=5;
		for(int i=1;i<=9;i++)
		{
			
			for(int j=1;j<=star;j++) //phily row 5th * he for loop
			{
				System.out.print("*");
			}
			// jo prynt i value row 4 to prynt kmi kra mg ++ kra
			System.out.println();
			if(i<=4)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
	}

}
