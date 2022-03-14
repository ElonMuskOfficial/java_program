//  WAP which find armstrong no from 1 to 1000

class pr09
{
	public static void main(String args[])
	{
		int temp,num=1000,total=0;
		
		
		for(int i=1;i<num;i++)
		{
			temp=i;
			total=total+(temp+temp+temp);
			num=num/10;
			System.out.println(total);
		}

		for(int i=1;i<num;i++)
		{
			System.out.println(total);

		}		
	}
}