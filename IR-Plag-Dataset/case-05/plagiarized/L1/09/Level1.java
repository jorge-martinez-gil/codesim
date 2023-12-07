/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level1 {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }

    //fungsi membalik
    public static void reverse(int number) {
        while (number != 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
        }
        System.out.println();
    }
}
