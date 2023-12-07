

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner;

public class T07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[4][4];
        
        System.out.println("Enter a 4-by-4 row by row: ");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextDouble();
            }
            System.out.print("");
        }
        sumMajorDiagonal(arr);
    }
    
    public static double sumMajorDiagonal(double[][] m) {
        double total = m[0][0] + m[1][1] + m[2][2] + m[3][3];
        System.out.println("Sum of the elements in the major diagonal is " + total);
        return total;
    }
}
