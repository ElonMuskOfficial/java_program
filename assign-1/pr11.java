/*	11. WAP that find factorial of N no.   */

import java.util.*;

class pr11
{
	public static void main(String args[])
	{
		int i,fact=1,num;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+" is: "+fact);
	}
}