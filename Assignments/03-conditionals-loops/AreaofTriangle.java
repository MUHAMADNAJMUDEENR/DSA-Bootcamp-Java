import java.util.Scanner;
public class AreaofTriangle
{
	public static double area(int A, int B)
	{
		double area = (0.5 * A * B);
		return area;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A,B:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("Area of Triangle:" + area(A,B));
	}
}
		
		
		
		