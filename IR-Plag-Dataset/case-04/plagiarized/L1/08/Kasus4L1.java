/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus4L1 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        // Use while loop
        int miles = 1;
        while (miles <= 10) {
            //Menampilkan hasil
            System.out.println(miles + "\t\t" + miles * 1.609);
            miles++;
        }
    }
}
