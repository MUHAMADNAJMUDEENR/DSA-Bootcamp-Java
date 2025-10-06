import java.util.Scanner;
public class LeapYearChecker{
	public static boolean isleapyear(int year){
		if(year % 4 == 0){
			if(year % 100 != 0){
				return true;
			}
			else {
				if(year % 400 == 0){
					return true;
				}
				else {return false;}
			}
		else {return false;}
		}
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if (isleapyear(year)){
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		scanner.close();
	}
}