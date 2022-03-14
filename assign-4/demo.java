interface abc
{
	final int a=10;
	void get();
}
class demo implements abc
{
	public void get()
	{
		System.out.println("Welcome to java");
		System.out.println("a...."+a);
	}
	public static void main(String args[])
	{
		demo d=new demo();
		d.get();
	}
}