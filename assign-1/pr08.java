// find largest number from 3 numbers using ternary operator

import java.util.*;

class pr08
{
	public static void main(String args[])
	{
		int n1,n2,n3,max;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1: ");
		n1=sc.nextInt();
		System.out.print("Enter n2: ");
		n2=sc.nextInt();
		System.out.print("Enter n3: ");
		n3=sc.nextInt();
		
		max=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println("Largest number is : "+max);
	}
}