

import java.util.Scanner;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {
    private static double radius,length,areas,volumes;
    
    public static void main(String[] args) {
        //Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        length = input.nextDouble();
        areas = radius * radius * 3.14159;
        volumes = areas * length;
        System.out.println("The area is " + areas);
        System.out.println("The volume of the cylinder is " + volumes);
    }
}
