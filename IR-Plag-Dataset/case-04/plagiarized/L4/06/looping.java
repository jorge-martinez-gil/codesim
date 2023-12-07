   import java.util.Scanner;

public class looping {

   public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        int mil ;
        print(mil=1);
   }
   
   public static void print(int mil)
   {
       while (mil <= 10) {
            System.out.println(mil + "\t\t" + mil * 1.609);
            mil++;
        }//looping dari 1 sampai 10

   }
}