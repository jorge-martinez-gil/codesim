/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level5 {

    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println("-------------------------------");

        convert();
    }

    //pakai for
    private static void convert() {
        for(int mill = 1; mill <=10; mill++)
            System.out.println(mill + "\t\t" + mill * 1.609);
    }
}
