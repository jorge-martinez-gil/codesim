

import java.util.Scanner;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] m = new double[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        
        for (int i = 0; i < m.length; i++)
            sum += m[i][i];
        
        return sum;
    }
}
