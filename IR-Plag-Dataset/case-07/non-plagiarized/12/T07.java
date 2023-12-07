
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D Afiany 2451041557A22145B3701B0184109CAB035
 */
public class T07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "
                + sumMajorDiagonal(m));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double tambah = m[0][0] + m[1][1] + m[2][2] + m[3][3];
        return tambah;
    }
}
