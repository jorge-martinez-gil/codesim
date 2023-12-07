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
public class Kasus5L6 {

    public static void main(String[] args) {
        //input data
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String angka = inp.next();
        for (int i = angka.length() - 1; i >= 0; i--) {
            System.out.print(angka.charAt(i));
        }
        System.out.println();
    }
}
