interface abc
{
	final int a=10;
	void get();
}
interface xyz extends abc
{
	final int b=20;
	void get1();
}

class demo1 implements xyz
{
	public void get()
	{
		System.out.println("Abc interface");
		System.out.println("a...."+a);
	}
	public void get1()
	{
		System.out.println("xyz interface");
		System.out.println("b...."+b);
	}
	public static void main(String args[])
	{
		demo1 d=new demo1();
		d.get();
		d.get1();
	}
}