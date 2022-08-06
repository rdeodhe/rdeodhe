package logicalProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// prime no = asa no je fkt 1 or swtnich divde hote
		
	//123---. 1cube 1^3+2^3+3^3=1+8+27=36
		//153 -----> 1^3+5^3+3^3= 1+125+27=153
	
	int orignalNum=153;
	int armstrongNum=0;
	for(int i=orignalNum;i>0;i=i/10) // 153 ,15 , 1  153/10,15/10,1
	{
		int rem =i%10;//3,5,1
		armstrongNum = armstrongNum+(rem*rem*rem); //0+(3^3+3^3+3^3)
		//27=0+27
		//152=27+125
		//153=152+1
	}
	if (orignalNum==armstrongNum)
	{
		System.out.println("given number is "+orignalNum+" is armstrongNum number");
	}
	else {
		System.out.println("given number is "+orignalNum+" isnot armstrongNum number");
	}
	
	}

}
