import java.util.Scanner;
public class inputoutput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// masukan silinder
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		//perhitungan
		double area = radius * radius * 3.14159;
		double volume = area * length;
		
		// cetak hasil
		System.out.println("The area is " + area);
		System.out.println("The volume of the cylinder is " + volume);		
	}
}