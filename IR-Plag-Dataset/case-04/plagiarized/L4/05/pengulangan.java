import java.util.*;

class inputoutput{
	static void hitHasil(int m)
	{
		while (m <= 10) 
		{
		System.out.println(m + "\t\t" + m * 1.609);
		m++;
		//ditambahin iteratornya
		}
	}
	public static void main(String[] args) 
	{
		int m = 1;
		// print seusatu
	System.out.println("Miles\t\tKilometers");
	System.out.println("-------------------------------");
	// pake pengulangan while
		hitHasil(m);
		
	}
}