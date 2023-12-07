
import java.util.Scanner;

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
public class T05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = sc.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        String numberString = String.valueOf(number);        
        for (int i = numberString.length(); i > 0; i--) {
            System.out.print(numberString.charAt(i-1));
        }
        System.out.println("");
    }
}
