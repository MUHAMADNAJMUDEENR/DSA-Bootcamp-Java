import java.util.Scanner;
public class SimpleInterest
{
	public static int interest(int p, int t, int r)
	{
		int simpleinterest = ( p * t * r)/100;
		return simpleinterest;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the P,T,R :");
		int p = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(interest(p,t,r));
		sc.close();
		
	}
}

		
		