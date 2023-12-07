import java.util.*;

class singlearray
{
	static int[] n = new int[10];

	public static void main (String[] args)
	{
				
		java.util.Scanner inp = new java.util.Scanner(System.in);

		int i=9;
		int a=0;
		while (i >=0) 
		{
			System.out.print("Read a number: ");
			n[a] = inp.nextInt();
			a++;
			i--;
		}
	print();
	}
		static void print()
	{
				for (int a = 0; a <=9; a++) 
		{
			System.out.println(n[9-a]);
		}
	}
}