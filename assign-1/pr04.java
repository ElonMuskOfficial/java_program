/*
       program to check number is armstrong or not
*/

import java.util.*;

class pr04
{
	public static void main(String args[])
	{
		int num,temp=0,sum=0 ,r;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num=sc.nextInt();
		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}
