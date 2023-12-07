public class Main {

    public static void main(String[] args) {
        //enter the number
        System.out.print("Enter an integer: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int nmb = sc.nextInt();
        //reverse number
        reverse(nmb);

    }
    public static void reverse(int nmb) {
        while (nmb != 0) {
            int get = nmb % 10;
            //output
            System.out.print(get);
            nmb = nmb / 10;
        }
        System.out.println();
    }


}
