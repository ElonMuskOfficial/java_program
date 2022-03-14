import java.util.*;

class pr01
{
	public static void main(String args[])
	{
		int no;
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter any number: ");
		no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}