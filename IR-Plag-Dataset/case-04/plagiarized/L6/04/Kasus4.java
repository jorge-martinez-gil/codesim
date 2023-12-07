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

    public static double Konversi(int miles) {
        if(miles <=10) {
            System.out.println(miles + "\t\t" + miles * 1.609);
            return Konversi(++miles);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");
        // Use while loop
        Konversi(1);
    }
}
