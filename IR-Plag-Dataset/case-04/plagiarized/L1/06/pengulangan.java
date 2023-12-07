import java.util.Scanner;

public class pengulangan {

   public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        int miles = 1;//inisialisasi while pertama kali
        while (miles <= 10) {
            System.out.println(miles + "\t\t" + miles * 1.609);
            miles++;
        }//looping dari 1 sampai 10
   }
}