/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus7L1 {

    public static void main(String[] args) {
        //minta input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] m = new double[4][4];
        //input the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
