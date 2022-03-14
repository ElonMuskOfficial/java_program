//WAP to perform simple interest using class and object.

import java.util.*;

class p1
{
	int p,n;
	double r,ans;
	
	void get()
	{
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Enter Principal: ");
		p=sc.nextInt();
		System.out.print("Enter Rate of interest: ");
		r=sc.nextDouble();
		System.out.print("Enter Year: ");
		n=sc.nextInt();
		
		ans=(p*r*n)/100;
		
		System.out.println("Simple interest is: "+ans);
			
	}		
		public static void main(String args[])
		{
			p1 obj=new p1();
			
			obj.get();
			
		}
	
}