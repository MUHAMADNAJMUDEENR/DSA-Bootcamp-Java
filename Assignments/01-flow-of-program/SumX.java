import java.util.Scanner;
public class SumX {
	public static String sum(){
		Scanner sc = new Scanner(System.in);
		int Sum = 0;
		while(true){
			String A = sc.next();
			if ( A.equalsIgnoreCase ("x") || A.equalsIgnoreCase("X"))
				break;
			int num = Integer.parseInt(A);
			Sum += num;
		}
		sc.close();
		return Integer.toString(Sum);
	}
	public static void main(String args[]){
		System.out.println("The sum all inputs: " + sum());
	}
}

	
		