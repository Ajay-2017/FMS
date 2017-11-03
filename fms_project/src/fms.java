import java.util.*;
public abstract class fms {

private ArrayList<student>student_list = new ArrayList<student>();	
	
public static void main(String[] args)
{
	student s1 = new student();
    s1.input_console();	
}
void input_console()
{
	System.out.println("Welcome to FMS....");
	Scanner scan = new Scanner(System.in);
	String input = new String();
	
	while(true)
	{
		
		input = scan.nextLine();
		String tocken[] = input.split("\\s");
		
		
		if("?".equals(tocken[0]))
		{
			display_menu_fms();
		}
		if("exit".equals(tocken[0]))
		{
			scan.close();
			return;
		}
		if("register".equals(tocken[0]))
		{
			student s1 = new student();
			student_list.add(s1);
			s1.registration(tocken[1]);
			
		}
	}
}
abstract void registration(String name);
void display_menu_fms()
{
	System.out.println("For initial Registration register<space>student_name"
			+ "\nFor Register complaint complaint<space>"
			+ "student_name");
}
}
class student extends fms
{
	void registration(String name)//student name is passed as argument
	{
		//fetch further details from the user
		
	}
	
}
