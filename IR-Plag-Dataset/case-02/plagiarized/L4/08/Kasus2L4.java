/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
public class Kasus2L4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        float length = in.nextFloat();
        // Hitung Area
        double luas = hitungLuas(radius);
        // Print area cylinder
        System.out.println("The area is " + luas);
        //Hitung Volume
        double volume = hitungVolume(luas, length);
        // Print volume cylinder
        System.out.println("The volume of the cylinder is " + volume);
    }
    
    private static double hitungLuas(float radius){
        return radius * radius * 3.14159;
    }
    
    private static double hitungVolume(double luas, float length){
        return luas * length;
    }
}
