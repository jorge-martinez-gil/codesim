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
        java.util.Scanner masukkan = new java.util.Scanner(System.in);
        int[] number = new int[10];
        
        //masukkan data
        for (int a = 0; a < 10; a++) {
            System.out.print(
                    "Read a number: ");
            number[a] = masukkan.nextInt();
        }

        //tampilkan ke layar
        for (int a = 9; a >= 0; a--) {
            System.out.println(number[a]);
        }
    }
}
