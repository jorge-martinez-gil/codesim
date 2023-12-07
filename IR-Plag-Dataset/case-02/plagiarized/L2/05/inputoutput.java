import java.util.*;
class inputoutput{
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);
		
		// masukan silinder
		System.out.print("Enter the radius and length of a cylinder: ");
		double rad = masukan.nextDouble();
		double panjang = masukan.nextDouble();
		
		//perhitungan
		double a = rad * rad * 3.14159;
		double vol = a * panjang;
		
		// cetak hasil
		System.out.println("The area is " + a);
		System.out.println("The volume of the cylinder is " + vol);		
	}
}