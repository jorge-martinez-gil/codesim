

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for(int i = 0; i < 10; i++) {
            System.out.print("Read a number: ");
            arr[i] = sc.nextInt();
        }
        
        for(int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
