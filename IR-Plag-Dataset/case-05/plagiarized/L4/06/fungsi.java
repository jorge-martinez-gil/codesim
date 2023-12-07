
import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {
         System.out.print("Enter an integer: ");
        
        Scanner sc = new Scanner(System.in);
        int   input;
        input =    sc.nextInt();//input integer
        while (input != 0) {//looping sampai angka habis
               int sisa ;
               sisa= input % 10;//membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
               System.out.print(sisa);
               input = input / 10;
        }

    }
}
