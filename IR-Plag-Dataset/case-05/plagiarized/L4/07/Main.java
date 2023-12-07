/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int angka;
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        angka = input.nextInt();
        // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
        while (angka != 0) {
            int remainder = angka % 10;
            System.out.print(remainder);
            angka = angka / 10;
        }
        System.out.println();
    }

}
