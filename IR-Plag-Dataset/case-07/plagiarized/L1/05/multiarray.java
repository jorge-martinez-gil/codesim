
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] m = new double[4][4];//inisialisai array 2 dimensi
                                      
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = input.nextDouble();//menginput angka ke dalam array 2d
            }
                          
        }
                                 
        System.out.print("Sum of the elements in the major  diagonal is  "+ sumMajorDiagonal(m));//menampilkan fungsi hasil perhitungan diagonal
    }

    public static double sumMajorDiagonal(double[][] m) {//fungsi untuk mengitung diagonal
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
