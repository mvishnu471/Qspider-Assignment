class  Fibanocci
{
	static int n1=0,n2=1,n3=0,count=8;
	public static void main(String[] args) 
	{ 
		System.out.print(n1+" "+n2+" ");
		fib(n1,n2);	
	}
	public static void fib(int a,int b)
	{
	if (count>=1)
	{
		n3=n1+n2;
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			count--;
			fib(n1,n2);
		}
		
	}
	else
			return;
	}
}
                                      