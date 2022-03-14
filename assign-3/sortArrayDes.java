// sorting in descending order

import java.util.Arrays;
import java.util.Collections;

public class sortArrayDes
{
	public static void main(String args[])
	{
		Integer [] array={90,23,25,10,1,5,4,99,-2};
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("After sorting elements: ");

		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}