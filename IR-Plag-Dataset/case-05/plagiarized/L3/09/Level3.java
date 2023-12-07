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
        //cara lain memanggil scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        int angka;
        
        System.out.print("Enter an integer: ");
        angka = input.nextInt();
        reverse(angka);
    }

    //fungsi membalik
    public static void reverse(int number) {
        int sisa;
        while (number != 0) {
            sisa = number % 10;
            System.out.print(sisa);
            number = number / 10;
        }
        System.out.println();
    }
}
