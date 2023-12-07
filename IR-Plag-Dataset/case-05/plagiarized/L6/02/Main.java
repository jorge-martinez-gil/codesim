import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int input(){
        System.out.print("Enter an integer: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int nmb=input();
        //reverse number
        reverse(nmb);

    }
    public static void reverse(int nmb) {
        int x=1;
        String rev=String.valueOf(nmb);
        do {

            System.out.print(rev.charAt(rev.length()-x));
            x++;
            nmb = nmb / 10;
        } while (nmb != 0);
        System.out.println();
    }
}
