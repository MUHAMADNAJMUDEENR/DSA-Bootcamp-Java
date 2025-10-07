import java.util.Scanner;
public class GreetName
{
	public static void greet(String name)
	{
		System.out.println( " Hello ! " + name );
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(" Enter your name:");
		greet(name);
		sc.close();
	}
}