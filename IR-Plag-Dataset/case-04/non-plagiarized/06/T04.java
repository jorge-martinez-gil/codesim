
import java.util.Scanner;

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
public class T04 {
    public static void main(String[] args) {
        double kilo;
        double milToKilo = 1.609;
        System.out.println("Miles\tKilometers");
        for (int i = 1; i < 11; i++) {
            kilo = i * milToKilo;
            System.out.println(i + "\t" + kilo);
        }
    }
}
