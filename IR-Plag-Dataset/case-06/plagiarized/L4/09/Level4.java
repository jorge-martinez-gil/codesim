/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level4 {

    public static void main(String[] args) {
        proses();
    }
    
    public static void proses(){
        java.util.Scanner in;
        in = new java.util.Scanner(System.in);
        int[] angka;
        angka = new int[10];
        for (int a = 0; a < 10; a++) {
            System.out.print("Read a number: ");
            angka[a] = in.nextInt();
        }

        for (int b = 9; b >= 0; b--) {
            System.out.println(angka[b]);
        }
    }
}
