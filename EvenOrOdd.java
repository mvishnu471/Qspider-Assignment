import java.util.*;
class  EvenOrOdd
{
	static Scanner s = new Scanner(System.in);
	public static void main (String[] args) throws Exception
	{
		System.out.println("Enter the number");
		int num = s.nextInt();
		Thread.sleep(1000);
		if(num<=100)
		{
			if(num%2==0)
			System.out.println("Vishnu");	
			else
			{
			System.out.println("VJ");
			}
		}
		else
		{
			if(num%7==1)
			System.out.println("Java");	
			else
			{
			System.out.println("PYTHON");	
		     }
	     }
		 Thread.sleep(1000);
		 System.out.println("Have a Nice Day");
	}
}
