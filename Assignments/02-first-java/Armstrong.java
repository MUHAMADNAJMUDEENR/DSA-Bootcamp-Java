import java.util.Scanner;

public class Armstrong
{
	public static boolean armstrong (int number)
	{
		int original = number;
		int sum = 0;
		int n = String.valueOf(number).length();
		while (number > 0)
		{
			int digit = number % 10;
			sum += Math.pow(digit, n);
			number = number /10;
		}
		return sum == original;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if(armstrong(number)
			System.out.println(number + " is a valid palindrome");
		else
			System.out.println(number + "is not a valid palindrome");
		sc.close();
	}
}
		
		
		
		