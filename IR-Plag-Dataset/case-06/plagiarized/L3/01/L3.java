import java.util.*;
public class L3 {

    public static void main(String[] args) {
        int[] angka = new int[10];
        Scanner sc = new java.util.Scanner(System.in);
        
        for (int i = 0; i < 10; i++) 
        {

            System.out.print("Read a number: ");
            angka[i] = sc.nextInt();
        }

        for (int i = 9; i >= 0; i--)
        {
            
            System.out.println(angka[i]);
        }
    }
}
