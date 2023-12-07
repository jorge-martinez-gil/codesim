
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {
         System.out.print("Enter an integer: ");
        
        Scanner sc = new Scanner(System.in);
        int   input;
        input =    sc.nextInt();//input integer
        terbalik(input);//memanggil fungsi reverse
    }

    public static void terbalik(int angka)  {
        List arr =new ArrayList();
        for(int i=0;i<=angka;i++) {//looping sampai angka habis
             int   sisa ;
             sisa= angka % 10;//membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
             arr.add(sisa);
             angka = angka / 10;
             i=0;
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i));
        }
        
        System.out.println();
    }
}
