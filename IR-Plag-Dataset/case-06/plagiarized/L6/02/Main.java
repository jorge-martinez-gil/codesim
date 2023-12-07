public class Main {
    public static void printNumber(int[] number){
        for (int i = 0; i < 10; i++) {
            System.out.println(number[i]);
        }

    }

    public static void main (String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int[] number = new int[10];
        int i=9;
        while(i>=0){

            // Input the number

            System.out.print("Read a number: ");
            number[i] = s.nextInt();
            i--;
        }

        // Output the number
        printNumber(number);
    }
}
