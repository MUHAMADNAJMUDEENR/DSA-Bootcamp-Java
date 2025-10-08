import java.util.Scanner;
public class PerimeterofParallelogram
{
	public static double perimeter(double a, double b)
	{
		return 2 * (a + b);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A and B");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		System.out.println("Perimeter of parallelogram:" + perimeter(A,B));
		sc.close();
	}
}
