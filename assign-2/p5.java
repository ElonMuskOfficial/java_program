//5. WAP to perform swap two values using class, object and method.

import java.util.*;

class p5
{
		int a,b,c;
		
		void get()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter value of a: ");
			a=sc.nextInt();
			System.out.print("Enter value of b: ");
			b=sc.nextInt();
			System.out.println("Before swapping");
			System.out.println("a="+a+" "+"b="+b);			
		}
		void p5()
		{
			c=a;
			a=b;
			b=c;
			System.out.println("After swapping");
			System.out.println("a="+a+" "+"b="+b);			
		}
		
		public static void main(String args[])
		{
			
			p5 obj=new p5();
			obj.get();
			obj.p5();
		}
}