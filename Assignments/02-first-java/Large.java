import java.util.Scanner;
public class Large
{
	public static int largest(int a, int b)
	{
		if ( a >= b)
			return a;
		else 
			return b;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(largest(a,b));
		sc.close();
	}
}