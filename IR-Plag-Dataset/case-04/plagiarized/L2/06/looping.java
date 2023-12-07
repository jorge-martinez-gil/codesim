import java.util.Scanner;

public class looping {

   public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        int mil = 1;//inisialisasi while pertama kali
        while (mil <= 10) {
            System.out.println(mil + "\t\t" + mil * 1.609);
            mil++;
        }//looping dari 1 sampai 10
   }
}