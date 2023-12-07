public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int nmb=0;
        //enter the number
        System.out.print("Enter an integer: ");

        nmb = sc.nextInt();
        //reverse number
        reverse(nmb);

    }
    public static void reverse(int nmb) {
        int get=0;
        while (nmb != 0) {
            get = nmb % 10;
            //output
            System.out.print(get);
            nmb = nmb / 10;
        }
        System.out.println();
    }


}
