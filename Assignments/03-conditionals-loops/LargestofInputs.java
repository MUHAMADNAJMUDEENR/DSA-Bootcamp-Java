import java.util.Scanner;
public class LargestofInputs //take inputs until the user enters 0 and print the largest number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int largest = 0;
		while(true)
		{
			int numbers = sc.nextInt();
			System.out.println("Input :");
			if (numbers == 0) break;
			if(numbers > largest )
				numbers = largest;
		}
		System.out.println(largest);
		sc.close();
	}
}
