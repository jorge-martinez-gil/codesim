
import java.util.Scanner;
/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
public class T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inp = sc.nextInt();
        reverse(inp);
    }
    
    public static void reverse(int number){
        int a = 0;
        int i = (int)(Math.log10(number));
        while(number!=0){
            int b = number%10;
            a += b * Math.pow(10, i--);
            number/=10;
        }
        System.out.println(a);
    }
}
