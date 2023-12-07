

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class T02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, length, area, volume;
        
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = sc.nextDouble();
        length = sc.nextDouble();
        
        area = radius * radius * 3.14159;
        volume = area * length ;
        
        DecimalFormat a = new DecimalFormat("0.0000");
        DecimalFormat v = new DecimalFormat("0.0");
        
        System.out.println("The area is " + a.format(area));
        System.out.println("The volume is " + v.format(volume));
    }
}
