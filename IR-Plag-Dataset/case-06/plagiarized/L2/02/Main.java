public class Main {

    public static void main (String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int[] number = new int[10];


        for (int i = 0; i < 10; i++) {

            // Input the number

            System.out.print("Read a number: ");
            number[i] = s.nextInt();
        }

        // Output the number
        for (int i = 9; i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}
