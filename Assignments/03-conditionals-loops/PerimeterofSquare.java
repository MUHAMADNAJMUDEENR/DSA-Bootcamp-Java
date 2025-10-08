import java.util.Scanner;
public class PerimeterofSquare
{
	//Square and rhombus formula is same 4*a
	public static int perimeter(int a)
	{
		return 4 * a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int a = sc.nextInt();
		System.out.println("Perimeter of square:" + perimeter(a));
		sc.close();
	}
}
