/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
        reverse(number);
    }

    public static void reverse(int number) {
        // Di sini mengulang hingga number habis
        while (number != 0) {
            int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
        }
        System.out.println();
    }
}
