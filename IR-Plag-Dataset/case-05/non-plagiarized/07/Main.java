

import java.util.Scanner;

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        reverse(number);
    }

    public static void reverse(int number)
    {
        int tempDigit = 0;

        while (number > 0){

            tempDigit = number % 10;
            System.out.print(tempDigit);
            number = number / 10;
        }
    }
}

    
    
