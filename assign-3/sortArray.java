import java.util.Arrays;

public class sortArray
{
	public static void main(String args[])
	{
		int[] array=new int[] {90,23,25,10,1,5,4,99};
		Arrays.sort(array);
		System.out.println("After sorting elements: ");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}