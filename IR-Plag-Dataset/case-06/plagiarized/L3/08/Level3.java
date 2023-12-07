/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
public class Level3 {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int[] arrAngka;
        arrAngka = new int[10];
        
        for (int x = 0; x < 10; x++) {
            System.out.print(
                    "Read a number: ");
            arrAngka[x] = in.nextInt();
        }

        for (int x = 9; x >= 0; x--) {
            System.out.println(arrAngka[x]);
        }
    }
}
