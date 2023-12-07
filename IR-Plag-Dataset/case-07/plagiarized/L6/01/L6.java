
import java.util.*;

public class L6 {

    public static double jumlahDiagonal(double[][] m) {
        double sum = 0;
        int hit = m.length-1;

        while (hit >= 0) {
            sum += m[hit][hit];
            hit--;
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

        for (int i = 3; i >= 0 ; i--) {
            for (int j = 3; j >= 0; j--) {
                m[i][j] = sc.nextDouble();
            }
        }
        print(m);
    }

}
