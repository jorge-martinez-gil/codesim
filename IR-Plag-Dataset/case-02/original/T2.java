import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Enter radius of the cylinder
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * 3.14159;
		double volume = area * length;

		System.out.println("The area is " + area);
		System.out.println("The volume of the cylinder is " + volume);
	}

}
