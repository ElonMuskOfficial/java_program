// input string using buffer reader

import java.io.*;

class  bufferreader
{
	public static void main(String args[]) throws IOException
	{
		String nm;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		nm=br.readLine();
		System.out.println("Welcome...."+nm);
	}
}