// cube=a*a*a;
// rectangle=h*w*h;
// cylinder=pi*r2*h;

import shape.*;
import java.util.*;

class p8
{
	static double a,h,w,r,pi=3.14;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		a=sc.nextDouble();
		System.out.print("Enter value of h: ");
		h=sc.nextDouble();
		System.out.print("Enter value of w: ");
		w=sc.nextDouble();
		System.out.print("Enter value of r: ");
		r=sc.nextDouble();
		
		figure obj=new figure();
		obj.compute(a);
		obj.compute(h,w);
		obj.compute(pi,h,r);
		
	}
}