import java.util.Scanner;
class  otp
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the otp ; ");
		Thread.sleep(2000);
		double d = (Math.random()*9999)+9999;
		int e = (int)d;
		System.out.println(e);
		int  user= s.nextInt();
		String res= (e==user)?"Verified":"Not Verified";
		System.out.println("Processing Please Wait some time.......");
		Thread.sleep(3000);
		System.out.println(res);
	}
}
