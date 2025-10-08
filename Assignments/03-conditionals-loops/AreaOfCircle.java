import java.util.Scanner;
public class AreaOfCircle
{
	public static double area(double radius)
	{
		double pi = Math.PI;
		double area = (pi * (radius * radius));
		return area;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius:");
		double radius = sc.nextDouble();
		
		System.out.println("Area of circle is %2f\n"+ area(radius));
		sc.close();
	}
}
