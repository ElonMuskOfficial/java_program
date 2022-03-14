import java.util.*;

class pr16
{
	public static void main(String args[])
	{
		int s1,s2,s3,total;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter s1 marks: ");
		s1=sc.nextInt();
		System.out.print("enter s2 marks: ");
		s2=sc.nextInt();
		System.out.print("enter s3 marks: ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		avg=(s1+s2+s3)/3;
		System.out.println("Total is: "+total);
		System.out.println("Average is: "+avg);
		
		if(avg>=70 && avg<=100)
		{
			System.out.println("Distinction");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("Second class");
		}
		else if(avg>=50 && avg<60)
		{
			System.out.println("Third class");
		}
		else if(avg>=40 && avg<50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}