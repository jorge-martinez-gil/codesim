
import java.util.Scanner;


/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
public class T07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] m=new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m[i][j]=s.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
    }
    public static double sumMajorDiagonal(double[][] m){
        double temp=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j){
                    temp=temp+m[i][j];
                }
            }
        }
        return temp;
    }
}
