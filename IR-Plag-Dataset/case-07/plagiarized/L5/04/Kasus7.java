
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
public class Kasus7 {
    
    public static void sumMajorDiagonal(double[][] matrix, int n) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            int j=0;
            while(j<n) {
                 matrix[i][j] = sc.nextDouble();
                j++;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }
    
    public static void main(String[] args) {
        
        int n=4;
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] matrix = new double[n][n];
        
        sumMajorDiagonal(matrix , n);
    }
}
