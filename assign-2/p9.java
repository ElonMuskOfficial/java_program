//WAP to display multiplication of two integer number using final variable.

class p9
{
	final int n1=10,n2=20;
	int ans;
	
	void get()
	{
		n1=5;
		n2=15;
	}
	void mul()
	{
		ans=n1*n2;
		System.out.println("Multiplication is : "+ans);
	}
	public static void main(String args[])
	{
		p9 obj1=new p9();
		obj1.mul();
		
	}
	
}