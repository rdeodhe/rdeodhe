package Array;

public class without_new_keyword_shortcutmethod {

	public static void main(String[] args) {
		
			String name[]={"ram","laxman","sita"};
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		 System.out.println("====");
		char grade[]= {'a','b','c'};
		for (int j=0;j<=grade.length-1;j++)
		{
			System.out.println(grade[j]);
		}
		System.out.println("=====");
		
		int rollno[]= {11,12,13,14};
		for (int j=0;j<=rollno.length-1;j++)
		{
			System.out.println(rollno[j]);
		}
		System.out.println("=====");
		for(int j=rollno.length-1;j>=0;j--)
		{
			System.out.println(rollno[j]);
		}
		System.out.println("======");
		
		float percentage[]= {99.13f,21.23f,32.45f};
		
			for(int i=-0;i<=percentage.length-1;i++)
			{
			System.out.println(percentage[i]);	
		}

	}

}
