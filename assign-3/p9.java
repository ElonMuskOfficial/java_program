// write a code to demonstrate protected access modifier
import abc.*;

class p9
{
	public static void main(String args[])
	{
		int n1,n2,ans;
		n1=10;
		n2=20;
		abc obj=new abc();
		ans=obj.add(n1,n2);
		System.out.println(ans);   // it will give error because a is protected.it can't 	
								 // access out of class
	}
}