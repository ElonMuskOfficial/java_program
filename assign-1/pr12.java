/*	12. WAP which find palindrome no between 1 to 100   */

import java.util.*;

class pr12
{
	public static void main(String args[])
	{
		int temp,rev,sum=0;
		
		for(int i=1;i<=100;i++)
		{
			temp=i;
			
			while(temp>0)
			{
				rev=temp%10;
				sum=(sum*10)+rev;
				temp=temp/10;
			}
			
			if(sum==temp)
			{
				System.out.println(temp);
			}
			rev=0;
			sum=0;
		}
	}
}