import java.util.Scanner;
public class Volumeofcone
{
	//(1/3) * π * r² * h
	public static double volume (double r, double h)
	{
		double volume = ((1.0/3) * Math.PI * Math.pow(r, 2) * h);
		return volume;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the R and H:");
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		System.out.println("Volume of cone is %2f\n:" + volume(r,h));
		sc.close();
	}
}