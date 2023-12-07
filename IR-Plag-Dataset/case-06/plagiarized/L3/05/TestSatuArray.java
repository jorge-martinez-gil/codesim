
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSatuArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];//inisialisasi array
        for (int x = 0; x < 10; x++) {//looping untuk input array
            System.out.print( "Read a number: ");
            arr[x] = sc.nextInt();//input ke array
        }
        for (int x = 9; x >= 0; x--) {//looping untuk menampilkan array
            System.out.println(arr[x]);//menampilkan array
        }
    }
}
