import java.util.Scanner;
public class VolumeofPrism
{
	public static double volume(double base, double height)
	{
		double volume = base * height ;
		return volume;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height:");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Volume of prism is:" + volume(base,height));
		sc.close();
	}
}
