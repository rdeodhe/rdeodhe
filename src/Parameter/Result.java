package Parameter;

public class Result {

	public static void main(String[] args) 
	{
		HSCResult("mayur", 70, 80, 90, 'A');
		System.out.println("  ");
		HSCResult("rashmi", 50, 60, 40, 'B');
		System.out.println("  ");
		HSCResult("veeransh", 30, 40, 50, 'c');
	}

	public static int HSCResult(String StudentName , int math,int chem , int phy, char grade)
	{
		
		int Total = math+chem+phy;
//		System.out.println("Result of " + StudentName + "\nmath: "+math +"\tchem: "+chem +"\tphy: "+phy+"\t Total:"+Total);
//      System.out.println(grade);System.out.println("student name is "+StudentName);
		System.out.println("marks is "+math );
		System.out.println("marks "+chem );
		System.out.println("marks "+phy );
		System.out.println("total is "+Total);
		System.out.println("grade is "+grade);
	    return Total;
	}
}
