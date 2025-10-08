import java.util.Scanner;
public class TSAofCube //Total Surface Area of Cube
{
	//Total Surface Area (TSA) of a Cube = 6 × a²
	public static double tsa (double area)
	{
		return 6 * Math.pow(area, 2);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area:");
		double area = sc.nextDouble();
		System.out.printf("Total surface area of Cube is: %.2f\n",tsa(area));
		sc.close();
	}
}
	