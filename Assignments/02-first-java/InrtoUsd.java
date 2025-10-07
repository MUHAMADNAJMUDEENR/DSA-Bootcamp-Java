import java.util.Scanner;

public class InrtoUsd
{
	public static double inr_usd(double inr)
	{
		double usd = 88.72;
		return inr/usd;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the INR");
		double inr = sc.nextDouble();
		System.out.pritnln("usd : " + inr_usd(inr));
		sc.close();
	}
}

		