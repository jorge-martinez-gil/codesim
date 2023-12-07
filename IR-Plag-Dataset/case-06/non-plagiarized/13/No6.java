

import java.util.Scanner;

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
public class No6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
