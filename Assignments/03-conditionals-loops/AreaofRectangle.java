import java.util.Scanner();
public class AreaofRectangle
{
	public static int area(int length, int breadth)
	{
		//int area = length * breadth;
		return length * breadth;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth:");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		System.out.println("Area of rectangle :"+ area(length,breadth));
		sc.close();
	}
}
