/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus5L1 {
    public static void main(String[] args) {
        //input data
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number) {
        //proses membalikkan angka
        while (number != 0) {
            //mengambil angka terakhir
            int remainder = number % 10;
            //tampilkan angka yang diambil
            System.out.print(remainder);
            //membuang angka terakhir
            number = number / 10;
        }
        System.out.println();
    }
}
