

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        System.out.print("Enter an integer: ");
        balik(number);
    }

        public static void balik(int number) {
            while (number != 0) {
                int remainder = number % 10;
                System.out.print(remainder);
                number = number / 10;
            }
            
            System.out.println();
        }
}
