import java.util.Scanner;
public class PerimeterofCircle
{	
	//Using Math.PI or 3.14
	public static double perimeter(double radius)
	{
		return 2 * Math.PI * radius;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		System.out.println("Perimeter of circle:" + perimeter(radius));
		sc.close();
	}
}
