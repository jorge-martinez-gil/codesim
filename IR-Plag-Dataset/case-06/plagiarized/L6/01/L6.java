
import java.util.*;

public class L6 {

    public static void print(int[] arr) {
        int i = 9;
        int j = 0;
        while (j < 10) {

            System.out.println(arr[i]);
            i--;
            j++;
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
