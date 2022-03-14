// WAP that define class student with rno,name,mark1,mark2,mark3 and another class result with total and percentage and define a method to display this value.

import java.util.*;

class student
{
		int rno,mark1,mark2,mark3;
		String name;
		
		void get()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter student rno: ");
			rno=sc.nextInt();
			System.out.println("Enter student name: ");
			name=sc.next();
			System.out.println("Enter mark1: ");
			mark1=sc.nextInt();
			System.out.println("Enter mark2: ");
			mark2=sc.nextInt();
			System.out.println("Enter mark3: ");
			mark3=sc.nextInt();
		}
}

class result extends student
{
		int total;
		double per;
	void re()
	{	
		total=mark1+mark2+mark3;
		per=total/3;
		
	}
	void display()
	{
		System.out.println("Student rollno: "+rno);
		System.out.println("Student name: "+name);
		System.out.println("Student mark1: "+mark1);
		System.out.println("Student mark2: "+mark2);
		System.out.println("Student mark3: "+mark3);
		System.out.println("Student total marks: "+total);
		System.out.println("Student percentage: "+per);
	}
}

class p1 extends result
{
	
	public static void main(String args[])
	{
		result r=new result();
		r.get();
		r.re();
		r.display();
	}
}