package Array;

public class chararray {

	public static void main(String[] args) {
		/// a b c d 
		char grade[]=new char[4];
		grade[0]='a';
		grade[1]='b';
		grade[2]='c';
		grade[3]='d';
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println("===========");
		
		for(int i=0;i<=3;i++)  //(i<= index)0 to 3 and length 4
			
		{
			System.out.println(grade[i]);
					}
		System.out.println("========");
		
		for (int i=0;i<=grade.length-1;i++)
		{
			
			System.out.println(grade[i]);
			
		}
      System.out.println("=======");
		for(int i=grade.length-1;i>=0;i--)
		{
			
			System.out.println(grade[i]);
		}	
		
		}

}
