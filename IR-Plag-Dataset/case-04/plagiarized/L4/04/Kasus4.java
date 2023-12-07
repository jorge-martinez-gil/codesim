/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
public class Kasus4 {

    public static void Konversi(int miles) {
            System.out.println(miles + "\t\t" + miles * 1.609);
    }
    
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        // Use while loop
        for(int miles=1 ; miles<=10 ; miles++)
            Konversi(miles);
    }
}
