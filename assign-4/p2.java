import java.util.*;

interface division
{
	float compute_area(float a,float b);
	float compute_perimeter(float a,float b);
}

class rectangle implements division
{
	public float compute_area(float a,float b)
	{
		float area=a*b;
		System.out.println("area of circle: "+area);
		return area;
	}
	public float compute_perimeter(float a,float b)
	{
		float area=a*a*b*b;
		System.out.println("perimeter of circle: "+area);
		return area;
	}
}

class circle extends rectangle
{
	public float compute_area(float a,float b)
	{
		float area=a*a*b*b;
		System.out.println("area of rectangle: "+area);
		return area;
	}
	public float compute_perimeter(float a,float b)
	{
		float area=a*b;
		System.out.println("perimeter of rectangle: "+area);
		return area;	
	}
}

class p2 extends circle
{
	public static void main(String args[])
	{	
		float a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();	
		
		rectangle obj=new rectangle();
		obj.compute_area(a,b);
		obj.compute_perimeter(a,b);
		System.out.println("-------------------");
		circle obj1=new circle();
		obj1.compute_area(a,b);
		obj1.compute_perimeter(a,b);
		
	}
}
		