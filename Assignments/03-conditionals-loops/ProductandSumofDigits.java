import java.util.Scanner;
public class ProductandSumofDigits  //Subtract the Product and sum of digits an integer
{
	public static int product_sum(int number)
	{
		int product = 1;
		int sum = 0;
		
		while(number > 0)
		{
			int temp = number % 10;
			product *= temp;
			sum += temp;
			number = number/10;
		}
		return product - sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		System.out.println("Output: " + product_sum(number));
		sc.close();
	}
}
			
		