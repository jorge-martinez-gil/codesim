

import java.util.Scanner;

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius, length, area, volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = sc.nextDouble();
        length = sc.nextDouble();
        area = radius * radius * 3.14159;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
        
    }
    
}
