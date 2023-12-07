import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //input 4*4 matrix data
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        double[][] mtx = new double[4][4];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                mtx[i][j] = s.nextDouble();


        System.out.print("Sum of the elements in the major diagonal is "+ sumMajorDiagonal(mtx));
    }
    //function for Summary
    public static double sumMajorDiagonal(double[][] mtx) {
        double sum = 0;

        for (int i = 0; i < mtx.length; i++)
            sum += mtx[i][i];
        return sum;
    }
}
