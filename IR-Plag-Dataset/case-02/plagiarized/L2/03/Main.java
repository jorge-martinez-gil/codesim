

import java.util.Scanner;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            //Enter radius of the cylinder
            System.out.print("Enter the radius and length of a cylinder: "); 
            double radius = input.nextDouble();
            double length = input.nextDouble();
            
            double areas = radius * radius * 3.14159;
            double volumes = areas * length;
            
            System.out.println("The area is " + areas);
            System.out.println("The volume of the cylinder is " + volumes); }
}
