import java.util.Scanner();
public class VolumeofCylinder
{
	//Volume of a cylinder = π × r² × h
	public static double volume (double r, double h)
	{
		double volume = Math.PI * Math.pow(r,2) * h;
		return volume;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius and Height:");
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		System.out.printf("Volume of Cylinder is %.2f\n:" , volume(r,h));
		sc.close();
	}
}
	