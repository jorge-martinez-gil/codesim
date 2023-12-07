

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dfArea = new DecimalFormat("#.####");
        DecimalFormat dfVolume = new DecimalFormat("#.#");

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = sc.nextDouble();
        double panjang = sc.nextDouble();
        System.out.println("The area is " + dfArea.format((radius*radius*3.14159)));
        System.out.println("The volume is "+ dfVolume.format(((radius*radius*3.14159)*panjang)));
    }
    
}
