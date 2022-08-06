package interface_study;

public interface father 
{

	void car();
	void bike();
	default void money()
	{
		System.out.println("mother money");
		}
	 static void rules()
	 {
		 System.out.println("father rules");
	 }
}
