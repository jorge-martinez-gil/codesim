
import java.util.Scanner;

public class method {

    public static void main(String[] args) {
         System.out.print("Enter an integer: ");
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        int    number =    input.nextInt();//input integer
          reverse(number);//memanggil fungsi reverse
    }

    public static void reverse(int number)  {
        while (number != 0) {//looping sampai angka habis
             int   remainder = number % 10;//membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
            System.out.print(remainder);
            number = number / 10;
        }
        
        System.out.println();
    }
}
