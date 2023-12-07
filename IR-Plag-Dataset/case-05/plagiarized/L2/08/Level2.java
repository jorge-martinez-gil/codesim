/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level2 {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int angka = in.nextInt();
        balik(angka);
    }

    //fungsi membalik
    public static void balik(int angka) {
        while (angka != 0) {
            int sisa = angka % 10;
            System.out.print(sisa);
            angka = angka / 10;
        }
        System.out.println();
    }
}
