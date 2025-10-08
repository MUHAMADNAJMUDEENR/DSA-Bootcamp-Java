import java.util.Scanner;
public class PerimeterofRectangle
{
	public static double perimeter(double length, double width)
	{
		return 2 * (length + width);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and width:");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		System.out.println(perimeter(length, width));
		sc.close();
	}
}
