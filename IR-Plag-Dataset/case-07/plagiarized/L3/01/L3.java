
import java.util.*;

public class L3 {

    public static double jumlahDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.print("Enter a 4 by 4 matrix row by row: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Sum of the elements in the major diagonal is " + jumlahDiagonal(m));
    }

}
