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
        Scanner sc = new Scanner(System.in); //panggil dari package
        int arrAngka[] = new int[10];

        for (int x = 0; x < 10; x++) {
            System.out.print("Read a number: ");
            arrAngka[x] = sc.nextInt();
        }

        for (int x = 9; x >= 0; x--)
            System.out.println(arrAngka[x]);
    }
}
