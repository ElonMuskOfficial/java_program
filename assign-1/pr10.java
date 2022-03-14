// print prime number 1 to 100

import java.util.*;

class pr10
{
	public static void main(String args[])
	{
		int no,c=1,i;
		
	for(no=3;no<100;no++)
	{
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				c=0;
			}
		}
		if(c!=0)
		{
			System.out.println(no);
		}
		c=1;
	}
	}
		
}