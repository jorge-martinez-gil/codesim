

import java.util.Scanner;

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
public class No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String inp= sc.next();
        reverse(inp);
    }
    
    public static void reverse(String a){
        for(int i=a.length()-1; i>=0; i--) {
            System.out.print(a.charAt(i));
        }
    }
    
}
