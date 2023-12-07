
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylebihdarisatu {
   
    public static void main(String[] args) {
        
        
        
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        
                
       
        
                  
        System.out.print("Sum of the elements in the major  diagonal is  "+ HitungDiagonal());//menampilkan fungsi hasil perhitungan diagonal
    }

    public static double HitungDiagonal() {//fungsi untuk mengitung diagonal
        Scanner sc = new Scanner(System.in);
        double hasil=0;
        double[][] matrix = new double[4][4];//inisialisai array 2 dimensi
         for (int x = 0; x < 4; x++) {
            for (int y = 0; y< 4; y++) {
               matrix[x][y] = sc.nextDouble();//menginput angka ke dalam array 2d
               if(x==y)
               {
                  hasil+=matrix[x][y];
               }
            }
                          
        }
        return hasil;
    }
}
