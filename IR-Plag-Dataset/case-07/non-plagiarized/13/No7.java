

import java.util.Scanner;

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
public class No7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i=0;i<4;i++){
            sum += m[i][i];
        }
        return sum;
    }
    
}
