/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus4L5 {

    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        // Use for loop
        for (int i = 1; i <= 10; i++) {
            //Menampilkan hasil
            //i = miles
            System.out.println(i + "\t\t" + ConvertMilesToKilo(i));
        }
    }

    private static double ConvertMilesToKilo(int miles) {
        return miles * 1.609;
    }
}
