/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 51BE04B11C5F2F5AD96A396632DC3F76
 */
import java.util.Scanner;

public class t05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        reverse(num);
    }

    public static void reverse(int number) {
        String tmpNumber = String.valueOf(number);
        for (int i = tmpNumber.length() - 1; i > -1; i--) {
            System.out.print(tmpNumber.charAt(i));
        }
        System.out.println("");
    }
}
