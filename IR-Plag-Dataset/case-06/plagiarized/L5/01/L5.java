
import java.util.*;

public class L5 {

    public static void print(int[] arr) {
        int i = 9;
        while (i >= 0) {

            System.out.println(arr[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        int[] angka = new int[10];
        Scanner sc = new java.util.Scanner(System.in);
        int i = 0;
        while (i != 10) {

            System.out.print("Read a number: ");
            angka[i] = sc.nextInt();
            i++;
        }

        print(angka);
    }
}
