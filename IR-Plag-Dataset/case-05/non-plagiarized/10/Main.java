
import java.util.Scanner;

public class Main {

    public  static void reverse(int number){
        String angka=number+"";
        for(int i=angka.length()-1;i>=0;i--){
            System.out.print(angka.charAt(i));
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter an integer: ");
    	int number=sc.nextInt();
    	reverse(number);
    }
}
