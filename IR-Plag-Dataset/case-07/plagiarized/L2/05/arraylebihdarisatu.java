
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylebihdarisatu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] matrix = new double[4][4];//inisialisai array 2 dimensi
                                      
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y< 4; y++) {
                matrix[x][y] = sc.nextDouble();//menginput angka ke dalam array 2d
            }
                          
        }
                                 
        System.out.print("Sum of the elements in the major  diagonal is  "+ HitungDiagonal(matrix));//menampilkan fungsi hasil perhitungan diagonal
    }

    public static double HitungDiagonal(double[][] matriks) {//fungsi untuk mengitung diagonal
        double total = 0;
        for (int i = 0; i < matriks.length; i++) {
            total += matriks[i][i];
        }
        return total;
    }
}
