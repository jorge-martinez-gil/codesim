/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus5L2 {
    public static void main(String[] args) {
        //input data
        System.out.print("Enter an integer: ");
        Scanner inp = new Scanner(System.in);
        int angka = inp.nextInt();
        reverseNumber(angka);
    }

    public static void reverseNumber(int angka) {
        //proses membalikkan angka
        while (angka != 0) {
            //mengambil angka terakhir
            int temp = angka % 10;
            //tampilkan angka yang diambil
            System.out.print(temp);
            //membuang angka terakhir
            angka = angka / 10;
        }
        System.out.println();
    }
}
