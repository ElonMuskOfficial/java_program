// write a java code to find out even number from 1 to 100 using command line argument.

class p10
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);	
		int even;
		System.out.println("Even numbers: ");
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				even=i;
				System.out.println(even);
			}
		}
	}
}