
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
public class Kasus2 {
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
