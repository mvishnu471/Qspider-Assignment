import java.util.*;
class Calculator 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Select The number :");
		System.out.println("1.Addition\n2.Substraction");
		switch (s.nextInt())
		{
		case 1 :
			{
			System.out.println("Enter the first Number");
			int a = s.nextInt();
			System.out.println("Enter the Second Number");
			int b = s.nextInt();
			double res =add(a,b);
			System.out.println("The ADDITION is "+res);
			break;
			}
			case 2:
			{
				System.out.println("Enter the first Number");
			int a = s.nextInt();
			System.out.println("Enter the Second Number");
			int b = s.nextInt();
			double res1 =sub(a,b);
			System.out.println("The Sub is "+res1);
			break;
			}
		
		}

	}
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double sub(double a,double b)
	{
		return a-b;
	}
}
