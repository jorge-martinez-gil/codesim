

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {
    private static int number;
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        while (number != 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
        }

        System.out.println();
    }
}
