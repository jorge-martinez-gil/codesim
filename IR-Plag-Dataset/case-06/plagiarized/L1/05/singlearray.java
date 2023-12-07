
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class singlearray {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] num = new int[10];//inisialisasi array
        for (int i = 0; i < 10; i++) {//looping untuk input array
            System.out.print( "Read a number: ");
            num[i] = input.nextInt();//input ke array
        }
        for (int i = 9; i >= 0; i--) {//looping untuk menampilkan array
            System.out.println(num[i]);//menampilkan array
        }
    }
}
