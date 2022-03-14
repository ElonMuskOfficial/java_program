import java.util.*;

interface AddSubtract
{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface MultiplyDivide extends AddSubtract
{
	void multiply(int a,int b);
	void divide(int a,int b);
}

class p1 implements MultiplyDivide
{	
	
	public void addition(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	
	public void subtraction(int a,int b)
	{
		System.out.println("Subtraction : "+(a-b));
	}
	
	public void multiply(int a,int b)
	{
		System.out.println("Multiplication : "+(a*b));
	}
	
	public void divide(int a,int b)
	{
		System.out.println("Division : "+(a/b));
	}
		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		System.out.println("-----------------------");
		
		p1 obj=new p1();
		obj.addition(a,b);
		obj.subtraction(a,b);
		obj.multiply(a,b);
		obj.divide(a,b);
	}
}