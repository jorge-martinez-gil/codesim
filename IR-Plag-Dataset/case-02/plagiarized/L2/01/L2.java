
import java.util.*;


public class L2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double jari2 = input.nextDouble();
        double panjang = input.nextDouble();
        double luas = jari2 * jari2 * 3.14159;
        double total = luas * panjang;
        System.out.println("The area is " + luas);
        System.out.println("The volume of the cylinder is " + total);
    }
}
