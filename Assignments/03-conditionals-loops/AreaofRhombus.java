import java.util.Scanner();
public class AreaofRhombus
{	
	//Using Base and Height:
	public static int area (int base, int height)
	{
		return base * height;
	}
	//Using diagnols :
	public static int area1 (int d1, int d2)
	{
		return 0.5 * d1 * d2;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height :");
		int base = sc.nextInt();
		int height = sc.nextInt();
		System.out.println("Area of Rhombus:" + area(base,height));
		sc.close();
	}
}

		