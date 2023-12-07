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
        Scanner in = new Scanner(System.in);
        double radius, tinggi;

        //masukkan nilai
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = in.nextDouble(); tinggi = in.nextDouble();

        count(radius, tinggi);
    }

    private static void count(double rad, double height) {
        System.out.println("The area is " + Math.pow(rad, 2) * Math.PI);
        System.out.println("The volume of the cylinder is " + Math.pow(rad, 2) * Math.PI * height);
    }
}
