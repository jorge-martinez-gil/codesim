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
public class Kasus5L4 {

    public static void main(String[] args) {
        //input data
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int angka = inp.nextInt();

        //proses membalikkan angka
        while (angka != 0) {
            //mengambil angka terakhir
            int temp = angka % 10;
            //membuang angka terakhir
            angka = angka / 10;
            //tampilkan angka yang diambil
            System.out.print(temp);
        }
        System.out.println();
    }
}
