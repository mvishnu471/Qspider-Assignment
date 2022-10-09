import java.util.*;
class Tomato 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("    \n Welcome to TOMATO..........Are you Hungerr.....!");
		Thread.sleep(1000);
		System.out.println("Select the Hotel...");
		System.out.println("\n 1.Copper Kitchen\n 2.Thalapakkati \n 3.A2B \n 4.Buhari \n 5.Emirates\n");
		int num =  s.nextInt();
		switch(num)
		{
			case(1):
				{
				System.out.println("You Selected Hotel Name - Copper Kitchen\n");
				break;
				}
			case (2):
				{
				System.out.println("You Selected Hotel Name - Thalapakkati\n");
				break;
				
				}
			case (3):
				{
				System.out.println("You Selected Hotel Name - A2B\n");
				break;
				
				}
			case (4):
				{
				System.out.println("You Selected Hotel Name - Buhari\n");
				break;
				
				}
			case (5):
				{
				System.out.println("You Selected Hotel Name - Emirates\n");
				break;
				
				}
		}
		System.out.println("Thank you for Selecting the Hotel..!\n");
		Thread.sleep(1000);
		System.out.println("Food Available : \n");
		switch(num)
		{
			case(1):
				{
				System.out.println(" 1.Chicken Soup\n 2.Mutton Soup\n 3.Chicken Tika\n 4.Chciken Rice\n");
				break;
				}
			case (2):
				{
				System.out.println(" 1.Chicken Briyani\n 2.Mutton Briyani\n 3.Honey Chicken\n");
				break;
				}
			case (3):
				{
				System.out.println(" 1.Idly(2nos) \n 2.Dosai \n 3.Pongal \n 4.Masal Dosai\n");
				break;
				
				}
			case (4):
				{
				System.out.println(" 1.Schezwan Chicken  \n 2.Chicken Manjurian \n 3.Chicken Fried rice\n 4.Panner Butter Masala \n");
				break;
				
				}
			case (5):
				{
				System.out.println(" 1.Rosemilk  \n 2.Badam Milk \n 3.Bread Omlete  \n 4.Papaya Shake \n");
				break;
				
				}
		}

			System.out.println("Please Select Your food ");
			int quantity = s.nextInt();
			System.out.println("Total Quantity : \n Maximum Quantity Upto 4 ");

			int num2 = s.nextInt();
			Thread.sleep(2000);
			switch(num2)
		{
			case(1):
			{
				double c=num2*120;
				System.out.println("Your total bill : "+c+"\n");
				break;
			}
			case(2):
			{
				double c=num2*100;
				System.out.println("Your total bill : "+c+"\n");
				break;
			}
			case(3):
			{
				double c=num2*150;
				System.out.println("Your total bill : "+c+"\n");
				break;
			}
			case(4):
			{
				double c=num2*80;
				System.out.println("Your total bill : "+c+"\n");
				break;
			}
		}
		System.out.println("Select Payment Method : ");
		System.out.println(" 1.Gpay\n 2.Phonepe\n 3.Bharathpe\n ");
		int p = s.nextInt();
		System.out.println("Enter Mobile Number : ");
		long q = s.nextLong();
		System.out.println("Enter The Otp\n");
		Thread.sleep(2000);
		double o = (Math.random()*9999)+9999;
		int j= (int)o;
		System.out.println(j);
		int u = s.nextInt();
		System.out.println(j==u);
				System.out.println("Please Wait");
				Thread.sleep(2000);

		if (j==u)
		{
			System.out.println("Orderd Succesfully");
		}
		else {
			System.out.println("Not Orderd Succesfully");
		}
	}
}
