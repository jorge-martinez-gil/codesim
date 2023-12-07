import java.util.Scanner;
public class T05
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int number= sc.nextInt();

      reverse(number);
   }
   public static void reverse (int number)
   {
      String balik ="";
      while(number > 0)
      {
         balik = balik + (number%10);
         number = number/ 10;
      }
      System.out.println(balik);
   }
}