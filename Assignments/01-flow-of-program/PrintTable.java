import java.util.Scanner;
public class PrintTable{
	public static void int mul(int a){
		for (int i = 1; i <=10; i++){
			System.out.println( a + " X " + i + " = " + (a*i));
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		mul(a);
		sc.close();
	}
}
