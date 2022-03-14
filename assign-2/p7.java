// 7. WAP check no is Armstrong or not using approproate class,object and method name.

import java.util.*;

class p7
{
	int num,temp=0,sum=0 ,r;
	
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		num=sc.nextInt();
	}
	void arm()
	{
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
	public static void main(String args[])
	{
		p7 obj=new p7();
		
		obj.get();
		obj.arm();
	}
}