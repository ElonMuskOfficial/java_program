// write a java program to perform the following classes
// class student{rno,name}
// class mark{mark1,mark2,mark3}
// class result{total,percentage}

import java.util.*;

class student
{
	int rno;
	String name;
	void get()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter student rno: ");
			rno=sc.nextInt();
			System.out.println("Enter student name: ");
			name=sc.next();
			
		}
}
class mark extends student
{
	int mark1,mark2,mark3;
	
	void mark()
	{		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter mark1: ");
			mark1=sc.nextInt();
			System.out.println("Enter mark2: ");
			mark2=sc.nextInt();
			System.out.println("Enter mark3: ");
			mark3=sc.nextInt();
	}
}
class result extends mark
{
	int total;
	double per;
	 
	 void result()
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
		System.out.println("Student total: "+total);
		System.out.println("Student percentage}: "+per);
	}
}
class p2
{
	public static void main(String args[])
	{
		result r=new result();
		r.get();
		r.mark();
		r.result();
		r.display();
		
	}
}