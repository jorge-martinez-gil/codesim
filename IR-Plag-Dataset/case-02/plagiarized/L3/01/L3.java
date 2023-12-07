
import java.util.*;

public class L3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari2 = 0;
        double panjang = 0;
        System.out.print("Enter the radius and length of a cylinder: ");
        jari2 = input.nextDouble();
        panjang = input.nextDouble();
        double luas = jari2 * jari2 * 3.14159;
        double total = luas * panjang;
        System.out.print("The area is " + luas + " , ");
        System.out.println("The volume of the cylinder is " + total);
    }
}
