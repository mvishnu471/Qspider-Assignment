import java.util.*;
class Arm 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int num=s.nextInt();
		int a=0,rem=0;
		int n=num;
		while (num !=0)
		{
			rem=num%10;
			a=a+rem*rem*rem;
			num=num/10;
		}
		if (n==a)
			System.out.println(n+" is a Armstrong num");
		else
			System.out.println(n+" is not Armstrong num");

	}
}
