
import java.util.Scanner;

/**
 *
 * @author Shiroinu
 */
public class T02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and the length of the cilinder : ");
        double rad = sc.nextDouble();
        double length = sc.nextDouble();
        double area = Math.PI * rad * rad;
        double volume = Math.PI * rad * rad* length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
