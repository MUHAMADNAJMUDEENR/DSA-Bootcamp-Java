import java.util.Scanner;
public class AreaofIsoscelesTriangle
{
	public static double Area(double A, double B)
	{
		return 0.25 * B * (Math.sqrt(4 * Math.pow(A,2) - Math.pow(B,2)));
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A and B");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		System.out.println("Area of Isoceles Triangle" + Area(A,B));
		sc.close();
	}
}
