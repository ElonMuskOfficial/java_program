/*
   program to reverse the number
*/

import java.util.*;

class pr05
{
	public static void main(String args[])
	{
		int num,temp,sum=0,rev=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=sc.nextInt();
		
		temp=num;
		
		while(num!=0)
		{
			sum=num%10;
			rev=(rev*10)+sum;
			num=num/10;
		}
		System.out.println("Reverse number is: "+rev);
					

}
}