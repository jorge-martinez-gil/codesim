
import java.util.Scanner;
/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
public class T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, length, area, volume;
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = sc.nextDouble();
        length = sc.nextDouble();
        area = radius * radius * 3.14159;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
    
}
