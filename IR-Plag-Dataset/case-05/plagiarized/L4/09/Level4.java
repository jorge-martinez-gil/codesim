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
        java.util.Scanner masukkan = new java.util.Scanner(System.in);
        int number;
        int sisaBagi;
        
        System.out.print("Enter an integer: ");
        number = masukkan.nextInt();
        
        while (number != 0) {
            sisaBagi = number % 10;
            System.out.print(sisaBagi);
            number = number / 10;
        }
        System.out.println();
    }
}
