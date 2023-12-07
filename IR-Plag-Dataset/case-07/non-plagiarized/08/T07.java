
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
public class T07 {
    static Scanner sc = new Scanner(System.in);
    public static double sumMajorDiagonal(double[][] m) {
        double hasil = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextDouble();
                if(i==j){
                    hasil += m[i][j];
                }
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
    }
}
