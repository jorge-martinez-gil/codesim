
import java.util.Scanner;

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
public class T02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        float r = s.nextFloat();
        float l = s.nextFloat();
        System.out.println("The area is " + r * r * 3.14159);
        System.out.println("The volume is " + (r * r * 3.14159) * l);
    }
}
