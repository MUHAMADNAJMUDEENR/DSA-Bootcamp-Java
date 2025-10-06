import java.util.Scanner;
public class SumofTwo{
	public static int Sum (int a,int b){
		return a+b;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		System.out.print("Enter the number:");
		int b = sc.nextInt();
		System.out.println(Sum(a,b));
		sc.close();
	}
}

