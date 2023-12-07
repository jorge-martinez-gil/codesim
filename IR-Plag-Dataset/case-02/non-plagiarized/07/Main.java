
import java.util.Scanner;

/**
 *
 * @author 672CAF27F5363DC833BDA5099775E891
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the radius and length of a cylinder:");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        int length = sc.nextInt();
        double area = radius*radius*3.14159;
        double volume = length*radius;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
        
    }
    
}
