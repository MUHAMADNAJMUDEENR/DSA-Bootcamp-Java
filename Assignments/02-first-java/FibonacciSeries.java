import java.util.Scanner;
public class FibonacciSeries
{
	public static int fibonacci(int n)
	{
		int result = 0;
		int first = 0;
		int second = 1;
		for(int i = 0; i < n; i++)
		{
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int number = sc.nextInt();
		
		System.out.println("Fibonacci sereis:");
		for(int i = 0; i<number;i++)
		{
			System.out.print(fibonacci(i) + " ");
		}
		sc.close();
	}
}
			
		
		