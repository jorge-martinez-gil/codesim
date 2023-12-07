
import java.util.Scanner;

public class L1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * 3.14159;
		double volume = area * length;
		System.out.println("The area is " + area + ", ");
		System.out.print("The volume of the cylinder is " + volume);
    }

}
