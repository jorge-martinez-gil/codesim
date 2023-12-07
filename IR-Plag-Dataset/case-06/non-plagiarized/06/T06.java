
import java.util.Scanner;

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
public class T06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Read a number : ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(numbers[i]);
        }
    }
}
