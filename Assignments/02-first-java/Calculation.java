import java.util.Scanner;
public class Calculation
{
	public static double ArithmeticOperators(double num1, double num2, char operator)
	{
		double result = 0;
		if (operator == '+')
		{
			result = num1 + num2;
		}
		else if (operator == '-')
		{
			result = num1-num2;
		}
		else if ( operator == '*')
		{
			result = num1 * num2;
		}
		else if(operator == '/')
		{
			if(num2 !=0)
			{
				result = num1/num2;
			}
			else
			{
				System.out.println("Zero Division Error :(")
				result = Double.NaN;
			}
		}
		else
		{
			System.out.println("Operator not found");
			result = Double.NaN;
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		char operator = sc.next().charAt(0);
		System.out.println(ArithmeticOperators(number1, number2, operator));
		sc.close();
	}
}
		
		
			