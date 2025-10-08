import java.util.Scanner;
public class PerimeterofEquilateralTriangle
{
	public static int perimeter(int a)
	{
		return 3 * a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the area:");
		int a = sc.nextInt();
		System.out.println("perimeter of Equilateral Triangle:"+ perimeter(a));
		sc.close();
	}
}
