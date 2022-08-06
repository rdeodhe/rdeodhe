package Inheritance;

public class multi_level {

	public static void main(String[] args)
	{
		grandmother g=new grandmother();
		g.keys();
		g.keys();
		grandmother.age();
		
		mother1 m=new mother1();
		m.name();
		m.sirname();
		m.keys();
		m.keys();
		mother1.age();
		
		son1 s=new son1();
		s.keys();
		s.keys();
		s.name();
		s.sirname();
		s.books();
		son1.age();
		son1.angry();
		

	}

}
