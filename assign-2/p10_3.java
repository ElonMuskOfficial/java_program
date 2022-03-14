// print following pattern
/*
        A
      A B
    A B C
  A B C D
A B C D E
*/

class p10_3
{
	public static void main(String args[])
	{
		int a=64;
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(a+j));
			}
			System.out.println();
		}
	}
}