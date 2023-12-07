import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void inputData(double[][] mtx){

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                mtx[i][j] = s.nextDouble();

    }
    //function for Summary
    public static double sumMajorDiagonal(double[][] mtx) {
        double sum = 0;

        for (int i = 0; i < mtx.length; i++)
            sum += mtx[i][i];
        return sum;
    }

    public static void main(String[] args) {

        double[][] mtx = new double[4][4];

        //input 4*4 matrix data
        System.out.print("Enter a 4 by 4 matrix row by row: ");
        inputData(mtx);



        System.out.print("Sum of the elements in the major diagonal is "+ sumMajorDiagonal(mtx));
    }

}
