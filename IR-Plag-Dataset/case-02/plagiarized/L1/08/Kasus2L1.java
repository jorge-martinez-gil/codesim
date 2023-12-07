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
public class Kasus2L1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter radius of the cylinder
        System.out.print("Enter the radius and length of a cylinder: ");
        
        double radius = input.nextDouble();
        double length = input.nextDouble();
        // Hitung Area
        double area = radius * radius * 3.14159;
        //Hitung Volume
        double volume = area * length;
        // Print area cylinder
        System.out.println("The area is " + area);
        // Print volume cylinder
        System.out.println("The volume of the cylinder is " + volume);
    }
    
}
