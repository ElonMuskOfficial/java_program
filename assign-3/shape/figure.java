package shape;

public class figure
{
	public double area;
	
	public void compute(double a)
	{
		area=a*a*a;
		System.out.println("area of cube is: "+area);
	}
	public void compute(double h,double w)
	{
		area=h*w*h;
		System.out.println("area of rectangle is: "+area);
	}
	public void compute(double pi,double h,double r)
	{
		area=pi*r*r*h;
		System.out.println("area of cylinder is: "+area);
	}
}