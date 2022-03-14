//write a java program for hierarchical inheritance
import java.util.*;

abstract class shap
{
		double radius,area;
		Scanner sc=new Scanner(System.in);
		
	abstract void draw();

}

class circle extends shap
{
	void draw()
	{
		final double pi=3.14;
		double ans;
		
		System.out.print("Enter radius: ");
		radius=sc.nextDouble();
		
		area=radius*radius*pi;
		
		System.out.println("Area of circle is: "+area);
	}
}

class rectangle extends shap
{
	void draw()
	{
		double h,w;
		System.out.print("Enter height: ");
		h=sc.nextDouble();
		System.out.print("Enter width: ");
		w=sc.nextDouble();
		area=h*w;
		System.out.println("Area of rectangle is: "+area);
	}
}

class triangle extends shap
{
	void draw()
	{
		double a,b;
		System.out.print("Enter value of a: ");
		a=sc.nextDouble();
		System.out.print("Enter value of b: ");
		b=sc.nextDouble();
		
		area=0.5*a*b;
		System.out.println("Area of rectangle is: "+area);
	}
}

class p3
{
	public static void main(String args[])
	{
		
		circle c=new circle();
		rectangle r=new rectangle();
		triangle t=new triangle();
		c.draw();
		r.draw();
		t.draw();
	}
}

