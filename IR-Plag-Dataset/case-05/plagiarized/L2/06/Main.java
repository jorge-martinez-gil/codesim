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
        int angka = input.nextInt();
        // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
        reverse(angka);
    }

    public static void reverse(int angka) {
        // Di sini mengulang hingga number habis
        while (angka != 0) {
            int remainder = angka % 10;
            System.out.print(remainder);
            angka = angka / 10;
        }
        System.out.println();
    }
}
