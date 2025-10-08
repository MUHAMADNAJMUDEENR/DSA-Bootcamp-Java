import java.util.Scanner;
public class VolumeofPyramid
{
	//Volume of a pyramid = (1/3) × Base Area × Height
	public static double volume(double Base, double height)
	{
		double volume = (1.0/3) * Base * height;
		return volume;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Area:");
		double base_area = sc.nextDouble();
		System.out.println("Enter the Height:");
		double Height = sc.nextDouble();
		System.out.printf("Volume of pyramid %.2f\n : " , volume(base_area,height));
		sc.close();
	}
}