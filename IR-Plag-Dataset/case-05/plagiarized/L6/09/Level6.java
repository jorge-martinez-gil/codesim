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
public class Level6 {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int bil = input.nextInt();

        rekursif(bil);
        System.out.println("");
    }

    //rekursif ah...
    public static int rekursif(int bil){
        if(bil!=0){
            int sisaMod = bil % 10;
            System.out.print(sisaMod);
            bil = bil / 10;
            rekursif(bil);
        }
        return bil;
    }
}
