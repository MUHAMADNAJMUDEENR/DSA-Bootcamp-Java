import java.util.Scanner;
public class AreaofParellelogram
{
	public static int area(int a, int b)
	{
		return a * b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A and B:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Area of parellelogram is:" + area(a,b));
		sc.close();
	}
}
