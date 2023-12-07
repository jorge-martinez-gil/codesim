

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a[][] =new double[4][4];
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                 a[i][j]=sc.nextDouble();
            }
          }
        
        
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {   if(a[i][j]%1==0){
                    DecimalFormat decimalFormat = new DecimalFormat("#");
                    String numberAsString = decimalFormat.format(a[i][j]);
                    System.out.print(numberAsString);
                }
                else{
                        System.out.print(a[i][j]);
                }
                System.out.print(" ");
            }
              System.out.println("");
        }
        
        
         
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(a));
    }
    
public static double sumMajorDiagonal(double[][] array)
{
    double total = 0;

    for (int index = 0; index < array.length; index++)
    {
            total += array[index][index];
    }

    return total;
}
}
