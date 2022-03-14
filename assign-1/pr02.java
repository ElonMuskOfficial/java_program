import java.util.*;

class pr02
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1: ");
		a=sc.nextInt();
		System.out.print("Enter n2: ");
		b=sc.nextInt();
		
		System.out.println("---------------");
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(a/b));
		
	}
}