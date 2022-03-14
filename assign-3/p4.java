// write a java code to demonstrate super keyword

class parent
{
	int speed=10;
}
class p4 extends parent
{
	int speed=20;
	
	void display()
	{
		System.out.println(super.speed);
	}
	
	public static void main(String args[])
	{
		p4 obj=new p4();
		obj.display();

	}
}