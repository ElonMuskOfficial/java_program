//  WAP which initialize two 3*3 matrix and print addition of that matrix.

import java.util.*;

class pr13
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{5,2,9},{1,6,6},{3,2,0}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}