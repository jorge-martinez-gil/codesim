
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Nomor7_2451041557A22145B3701B0184109CAB013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int [4][4];
        int sum =0;
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for(int i =0 ;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]= sc.nextInt();
                if(i==j){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "+sum);
    }
    
}
