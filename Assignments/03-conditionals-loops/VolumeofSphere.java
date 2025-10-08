import java.util.Scanner;
public class VolumeofSphere
{
	//Volume of Sphere = (4/3) × π × r³
	public static double volume(double r)
	{
		double volume = (4.0/3 * Math.PI * Math.pow(r,3));
		return volume;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double r = sc.nextDouble();
		System.out.printf("Volume of Sphere is: %.2f\n" , volume(r));
		sc.close();
	}
}
	
	
	