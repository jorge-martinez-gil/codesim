import java.util.*;

class inputoutput{
	static void hitHasil(int a)
	{
		for(;a<=10;a++)
		{
			System.out.println(a + "\t\t" + a * 1.609);
		}
	}
	public static void main(String[] args) 
	{
		// print seusatu
	System.out.print("Miles\t\tKilometers\n");
	System.out.print("-------------------------------\n");
	// pake pengulangan while
		hitHasil(1);
		
	}
}