import java.util.Scanner;
public class HcfLcm{
	public static int Hcf(int a, int b){
		while( b!=0){
			int temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A :");
		int A = sc.nextInt();
		System.ot.println("Enter number B :");
		int B = sc.nextInt();
		
		System.out.println( "lcm = " + ((A*B)/Hcf(A,B));
		System.out.println( "hcf = " + Hcf(A,B));
		sc.close();
	}
}
