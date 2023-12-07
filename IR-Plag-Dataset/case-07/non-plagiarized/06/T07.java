
import java.util.Scanner;

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
public class T07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row to row : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        double result = sumMajorDiagonal(matrix);
        System.out.println("Sum of the element in the major diagonal is " + result);
    }

    public static double sumMajorDiagonal(double[][] m) {
        double result = 0;
        for (int i = 0; i < 4; i++) {
            result+=m[i][i];
        }
        return result;
    }
}
