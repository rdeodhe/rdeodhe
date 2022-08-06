package interface_study;

public interface mother
{
void care();
void help();
default void money()
{
	System.out.println("mother money");
}
 static void rules()
 {
	 System.out.println("mothers rules");
 }
}
