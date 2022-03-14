// sorting string into reverseOrder

import java.util.Arrays;
import java.util.Collections;

public class sortString
{
	public static void main(String args[])
	{
		String[] array={"mango","apple","pinapple","grapes","papaya"};
		Arrays.sort(array,Collections.reverseOrder());
		
		System.out.println("After sorting string: "+Arrays.toString(array));
		
	}
}