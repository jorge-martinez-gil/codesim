   import java.util.Scanner;

public class looping {

   public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        print(1);
   }
   
   public static void print(int mil)
   {
       int x;
       for(int i=mil;i<=10;i++) {
            x=(int)(i*1.609);
            System.out.println(i + "\t\t" + x);         
        }//looping dari 1 sampai 10

   }
}