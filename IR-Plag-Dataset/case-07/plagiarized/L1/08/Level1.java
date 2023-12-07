import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //harus import dulu
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] m = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        System.out.print("Sum of the elements in the major diagonal is "
                + sumMajorDiagonal(m));
    }

    //fungsi untuk menjumlahkan diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
