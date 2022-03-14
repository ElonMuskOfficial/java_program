// check number is prime or not

import java.util.*;

class pr06
{
	public static void main(String args[])
	{
		int num,temp=0,no,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=sc.nextInt();
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				temp=1;
			}
		}
		if(temp==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
	
}