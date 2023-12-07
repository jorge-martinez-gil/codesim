

import java.util.Scanner;

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        
        for (int i=0;i<10;i++)
        {
            System.out.print("Read a number: ");
            int number = sc.nextInt();
            a[i]=number;
        }
        
        for (int i=9;i>=0;i--)
        {
            System.out.println(a[i]);
        }


    }
    
}
