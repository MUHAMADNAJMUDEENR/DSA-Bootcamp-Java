import java.util.Scanner;
public class Palindrome
{
	//Using Two Pointers :
	public static boolean isPalindrome(String name)
	{
		int left = 0;
		int right = name.length() - 1;
		
		while(left < right)
		{
			if(name.charAt(left) != name.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true ;
	}
	
	// Using StringBuilder and Built-in method :
	public static boolean ispalindrome(String str)
	{
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String name = sc.next();
		if(isPalindrome(name))
		{
			System.out.println("\"" + name + "\" is a valid palindrome");
		}
		else
		{
			System.out.println("\"" + name + "\" is not a valid palindrome");
		}
		sc.close();
	}
}
	