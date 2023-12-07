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
public class Level2 {
    
    //program menghitung luas alas dan volume
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the radius and length of a cylinder: ");
        double rad = in.nextDouble();
        double panjang = in.nextDouble();
        
        double luas = rad * rad * 3.14159;
        double vol = luas * panjang;
        System.out.println("The area is " + luas);
        System.out.println("The volume of the cylinder is " + vol);
    }
}
