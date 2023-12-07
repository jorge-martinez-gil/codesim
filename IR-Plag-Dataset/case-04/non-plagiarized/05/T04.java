import java.util.Scanner;
public class T04
{
   public static void main(String[] args)
   {
      System.out.println("Miles       Kilometers");

      for(int i=1;i < 11;i++)
      {
         if(i < 10)
         {
            System.out.println(i+"           "+i*1609);
         }
         else
         {
            System.out.println(i+"          "+i*1609);
         }
      }

   }
}