
import java.util.*;

public class L5 {

    public static double hitLuas(double jari2) {
        return jari2 * jari2 * 3.14159;
    }

    public static double total(double luas, double panjang) {
        return luas * panjang;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari2, panjang;
        double luas, total;
        System.out.print("Enter the radius and length of a cylinder: ");
        jari2 = input.nextDouble();
        panjang = input.nextDouble();
        luas = hitLuas(jari2);
        total = total(luas, panjang);

        System.out.print("The area is " + luas + " , ");
        System.out.println("The volume of the cylinder is " + total);
    }
}
