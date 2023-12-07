
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
public class T06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Read a number");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[9-i]);
        }
    }
}
