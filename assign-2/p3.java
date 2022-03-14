// WAP to display sum using method overloading.

class p3
{
	int sum;
	void demo(int n1,int n2)
	{
	
		sum=n1+n2;
		System.out.println("Addition of 2 numbers: "+sum);
	}
	
	void demo(int n1,int n2,int n3)
	{
		
		sum=n1+n2+n3;
		System.out.println("Addition of 3 numbers: "+sum);
	}
	
	public static void main(String args[])
	{
		p3 obj=new p3();
		
		obj.demo(5,5);
		obj.demo(5,5,5);
	}
}