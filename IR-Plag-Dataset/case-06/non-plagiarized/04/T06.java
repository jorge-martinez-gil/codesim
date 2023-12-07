
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
public class T06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Read a number: ");
            a[i] = s.nextInt();
        }
        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.println(a[i]);
        }
        
    }
}
