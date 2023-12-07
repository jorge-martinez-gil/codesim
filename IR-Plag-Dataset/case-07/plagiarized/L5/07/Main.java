
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
public class Main {

    public static void main(String[] args) {
        double[][] arr;
        Scanner input = new Scanner(System.in);
        // Input angka ke dalam array n x n pada bagian ini
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        arr = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        // Menjumlahkan angka yang terdapat di dalam array
        double sum;
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        // Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
        System.out.print("Sum of the elements in the major diagonal is "
                + sum);
    }

}
