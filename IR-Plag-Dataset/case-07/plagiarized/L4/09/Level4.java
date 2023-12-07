
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
public class Level4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] matriks;
        matriks = new double[4][4];
        double sum = 0;
        
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        for (int b = 0; b < 4; b++) {
            for (int k = 0; k < 4; k++) {
                matriks[b][k] = in.nextDouble();
            }
        }
        
        for (int x = 0; x < matriks.length; x++){
            sum += matriks[x][x];
        }
            
        System.out.print("Sum of the elements in the major diagonal is " + sum);
    }
}
