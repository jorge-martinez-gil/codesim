
import java.util.Scanner;
/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
public class T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Read a number: ");
            arr[i] = sc.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    
}
