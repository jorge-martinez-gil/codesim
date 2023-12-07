/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus4L2 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        // Use while loop
        int counter = 1;
        while (counter <= 10) {
            //Menampilkan hasil
            //counter = miles
            System.out.println(counter + "\t\t" + counter * 1.609);
            counter++;
        }
    }
}
