//WAP of constructor overloading which is used default and parameterized.

class p4
{
	p4()
	{
		int n1=5;
		int n2=5;
		System.out.println("Addition of 2 number: "+(n1+n2));
	}
	p4(int n1,int n2,int n3)
	{
		int sum;
		sum=n1+n2+n3;
		System.out.println("Addition of 3 number: "+sum);
	}
	public static void main(String args[])
	{
		p4 obj1=new p4();
		p4 obj2=new p4(5,5,5);
	}
}