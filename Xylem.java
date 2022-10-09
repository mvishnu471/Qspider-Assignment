import java.util.*;
class  Xylem
{
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter any Number:");
		int n=s.nextInt();
		int num=n,first =0,last=0;
		while(n!=0)
		{
			if (num==n || n<10)
			{
				first=first+n%10;
			}
			else
				last=last+n%10;
			n=n/10;
		}
		System.out.println("the sum of digits:"+first);
		System.out.println("the sum of digits:"+last);
		if (first==last)
		{
			System.out.println(num+" is a Xylem:");
		}
		else
			System.out.println(num+" is a phloem:");
	}
	
}
