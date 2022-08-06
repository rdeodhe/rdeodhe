package Array;

public class multidimention_array {

	public static void main(String[] args) {
		//row and coloum [2][2]
char grade[][]= new char[2][2];
grade[0][0]='E';
grade[0][1]='F';
grade[1][0]='G';
grade[1][1]='H';
System.out.print(grade[0][0]+" ");
System.out.println(grade[0][1]);
System.out.print(grade[1][0]+" ");
System.out.println(grade[1][1]);
System.out.println("=====");

for(int i=0;i<=grade.length-1;i++)//row o
{
	for(int j=0;j<=grade.length-1;j++)//for coloum
	{
		System.out.print(grade[i][j]+" "); 
	}
	System.out.println();
	}

	}

}
