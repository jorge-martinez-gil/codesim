public class Main {

    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] num = new int[10];


        for (int i = 0; i < 10; i++) {

            // Input the number

              System.out.print("Read a number: ");
            num[i] = input.nextInt();
        }

        // Output the number
          for (int i = 9; i >= 0; i--) {
              System.out.println(num[i]);
          }
    }
}
