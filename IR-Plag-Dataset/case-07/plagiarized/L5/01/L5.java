
import java.util.*;

public class L5 {

    public static double jumlahDiagonal(double[][] m) {
        double sum = 0;
        int hit = 0;

        while (hit != m.length) {
            sum += m[hit][hit];
            hit++;
        }
        return sum;
    }

    public static void print(double[][] m) {
        System.out.print("Sum of the elements in the major diagonal is " + jumlahDiagonal(m));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4 by 4 matrix row by row: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        print(m);
    }

}
