
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
public class Level2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for (int x = 0; x < 4; x++) 
        {
            for (int y = 0; y < 4; y++) 
            {
                matrix[x][y] = sc.nextDouble();
            }
        }
        System.out.print("Sum of the elements in the major diagonal is "
                + hitungDiagonal(matrix));
    }

    public static double hitungDiagonal(double[][] matrix) 
    {
        double jumlah = 0;
        for (int i = 0; i < matrix.length; i++) 
        {
            jumlah += matrix[i][i];
        }
        return jumlah;
    }
}
