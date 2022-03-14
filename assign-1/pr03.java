/*
program to check number is palindrome or not
*/
import java.util.*;

class pr03
{
	public static void main(String args[])
	{
		int num,temp=0,rev,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=sc.nextInt();
		
		temp=num;
		
		while(num>0)
		{
			rev=num%10;
			sum=rev+(sum*10);
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}