import java.util.Scanner;
public class  AreaofEquilateralTriangle
{
	//(√3 / 4) * a²
	public static double area (double A)
	{
		double area = (Math.sqrt(3)/4) * Math.pow(A,2);
		return area;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length:");
		double A = sc.nextDouble();
		System.out.println("Area of Equilateral Triangle: " + area(A));
		sc.close();
	}
}