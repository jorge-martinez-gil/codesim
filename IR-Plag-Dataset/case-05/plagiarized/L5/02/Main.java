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
        int get=0;
        do {
            get = nmb % 10;
            //output
            System.out.print(get);
            nmb = nmb / 10;
        } while (nmb != 0);
        System.out.println();
    }


}
