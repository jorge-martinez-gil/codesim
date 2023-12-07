import java.util.*;

class inputoutput{
	public static void main(String[] args) 
	{
		// print seusatu
	System.out.println("Miles\t\tKilometers");
	System.out.println("-------------------------------");
	// pake pengulangan while
		int miles = 1;
		while (miles <= 10) {
		System.out.println(miles + "\t\t" + miles * 1.609);
		miles++;
		//ditambahin iteratornya
		}
	}
}