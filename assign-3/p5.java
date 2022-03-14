// write a java code to calculate simple interest using abstract class

import java.util.*;

abstract class simple
{
	abstract void si();
}

class p5 extends simple
{
	void si()
	{
		double p,r,n,si;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principle: ");
		p=sc.nextDouble();
		System.out.print("Enter rate of interest: ");
		r=sc.nextDouble();
		System.out.print("Enter year: ");
		n=sc.nextDouble();
		
		si=(p*r*n)/100;
		System.out.println("Simple interest is: "+si);
		
	}
	public static void main(String args[])
	{
		p5 obj=new p5();
		obj.si();
	}
}