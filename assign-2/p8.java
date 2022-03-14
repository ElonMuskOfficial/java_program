// 8. WAP to demonstrate this keyword.

class p8
{
	int rno=0;
	String name="rakesh";
	
	p8(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	void display()
	{
		System.out.println(rno+" "+name);
	}
	public static void main(String args[])
	{
		p8 obj1=new p8(1,"jaydip");
		obj1.display();
	}
}


/*
class p8
{
	int no1,no2;
	
	void get(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
		
	}
	void dis()
	{
		System.out.println("no1: "+no1+" "+"no2: "+no2);
	}
	public static void main(String args[])
	{
		p8 obj1=new p8();
		obj1.get(10,20);
		obj1.dis();
	}
}
*/