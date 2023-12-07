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
       for(int i=mil;i<=10;i++) {
            System.out.println(i + "\t\t" + i * 1.609);         
        }//looping dari 1 sampai 10

   }
}