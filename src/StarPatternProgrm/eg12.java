package StarPatternProgrm;

public class eg12 {

	public static void main(String[] args) {
		//* 
		//**
		//***
		//****    4
		//*****   5
		//****    6
		//***
		//**
		//*
		//row 9 coloumn 5
		int star=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}
}
