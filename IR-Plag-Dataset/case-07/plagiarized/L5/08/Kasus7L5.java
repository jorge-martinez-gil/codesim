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
public class Kasus7L5 {

    public static void main(String[] args) {
        //minta input
        Scanner inp = new Scanner(System.in);
        double[][] matrix = new double[4][4];
        int i = 0;
        double sum = 0;
        System.out.print("Enter a 4 by 4 matrix row by row: ");

        //input the matrix
        while (i < 4) {
            int j = 0;
            while (j < 4) {
                matrix[i][j] = inp.nextDouble();
                j++;
            }
            i++;
        }

        i = 0;
        while (i < matrix.length) {
            sum += matrix[i][i];
            i++;
        }

        System.out.print("Sum of the elements in the major diagonal is " + sum);
    }
}
