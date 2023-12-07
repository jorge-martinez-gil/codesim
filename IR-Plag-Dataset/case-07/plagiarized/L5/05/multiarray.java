import java.util.*;

class multiarray
{
		// menambahkan seluruh isi array
	public static double sum(double[][] m)
	{
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			sum += m[i][i];
		return sum;
	}
	
	// 25779F8829AB7A7650E85A4CC871E6AC sangat ganteng
	public static void main(String[] args)
	{
		int i,j;
		
		System.out.print("Enter a 4 by 4 matrix row by row: ");
		double[][] ma = new double[4][4];
		//masukan array
		Scanner input = new Scanner(System.in);
		for (i = 0; i < 4; i++)
			for (j = 0; j < 4; j++)
				ma[i][j] = input.nextDouble();
			
					double sum = 0;
		i=0;
		while(i<ma.length)
		{
			sum += ma[i][i];
			i++;
		}
			

		System.out.print("Sum of the elements in the major diagonal is "+ sum);
	}
	

}