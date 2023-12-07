import java.util.Scanner;
public class T07
{
   public static void main(String[] args)
   {
      
      Scanner sc = new Scanner(System.in);
      double[][] numbers = new double[4][4];
      System.out.println("Enter a 4-by4 matrix row by row:");

      for(int i=0;i < 4;i++)
      {
         String rows = sc.nextLine();
         String[] rowssplit = rows.split("\\s+");
         for (int j = 0; j < 4; j++)
         {
            numbers[i][j] = Double.parseDouble(rowssplit[j]);
         }
      }
     System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(numbers));

   }
   public static double sumMajorDiagonal (double[][] m)
   {
      double jumdiagonal = 0;
      for(int i=0;i < 4;i++)
      {
         for(int j = 0; j < 4; j++)
         {
            if(i == j)
            {
               jumdiagonal = jumdiagonal + m[i][j];
            }
         }
       }
       return jumdiagonal;
    }

}