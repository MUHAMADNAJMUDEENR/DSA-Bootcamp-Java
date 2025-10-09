import java.util.Scanner;
public class SumofInputs //inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true)
		{
			int numbers = sc.nextInt();
			if (numbers == 0) break;
			sum += numbers;
		}
		System.out.println(sum);
	}
}
		