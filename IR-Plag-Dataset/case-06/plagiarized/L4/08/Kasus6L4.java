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
public class Kasus6L4 {
    public static void main (String[] args) {
        //Delarasi
        int[] arrNum = new int[10];
        Scanner inp = new Scanner(System.in);
        // for untuk 10 kali input
        for (int i = 0; i < 10; i++) {
            // Read a number
            System.out.print("Read a number: ");
            arrNum[i] = inp.nextInt();
        }
        // Display the array
        Reverse(arrNum);
    }
    
    private static void Reverse(int[] arr){
        for (int i = 9; i >= 0; i--) {
            //Print angka dalam array
            System.out.println(arr[i]);
        }
    }
}
