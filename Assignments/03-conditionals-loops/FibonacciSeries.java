import java.util.Scanner;
public class FibonacciSeries
{
	public static int series(int n)
	{
		if (n==0) return 0;
		if (n==1) return 1;
		
		int sum = 0;
		int first = 0;
		int second = 1;
		for(int i = 2; i<=n; i++)
		{
			sum = first + second;
			first = second;
			second = sum;
		}
		return second;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++){
			System.out.print(series(i) + " ");
		}
		sc.close();
		
	}
}