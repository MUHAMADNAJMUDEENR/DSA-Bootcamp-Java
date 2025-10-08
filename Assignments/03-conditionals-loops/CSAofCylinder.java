import java.util.Scanner();
public class CSAofCylinder //Curved Surface Area of a Cylinder
{
	//CSA = 2 × π × r × h //radius and height 
	public static double csa (double r, double h)
	{
		double volume = 2 * Math.PI * r * h;
		return volume;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = sc.nextDouble();
		System.out.println("Enter the height:");
		double h = sc.nextDouble();
		System.out.printf("Curved surface area of cylinder is: %.2f\n", csa(r,h) );
		sc.close();
	}
}

	