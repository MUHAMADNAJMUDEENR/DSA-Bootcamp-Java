import java.util.Scanner;
public class OddorEven {
	public static void oddoreven(int a)
	{
		if(a % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		oddoreven(a);
		sc.close();
	}
}

		