
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
public class T07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row");
        double[][] a = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = s.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(a));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==j)
                    sum += m[i][j];
            }
        }

        return sum;
    }

}
