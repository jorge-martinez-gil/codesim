
import java.util.Scanner;

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
        Scanner masukkan = new Scanner(System.in);
        int angka, sisaBagi;

        System.out.print("Enter an integer: ");
        angka = masukkan.nextInt();

        while (angka != 0) { //ulang sampai tidak bisa dibagi integer dengan 10
            sisaBagi = angka % 10;
            System.out.print(sisaBagi);
            angka = angka / 10;
        }
        System.out.println();
    }
}
