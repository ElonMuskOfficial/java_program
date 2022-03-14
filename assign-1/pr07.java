// fibonacci series

import java.util.*;

class pr07
{
	public static void main(String args[])
	{
			int num1,pre=1,sum=0;
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter any number: ");
			num1=sc.nextInt();
			System.out.print("0 ");
		
			
			while(sum<=num1)
			{
				sum=sum+pre;
				if(sum<num1)
				{
					System.out.print(sum+" ");
				}
				pre=sum-pre;
			}
			
	}
}