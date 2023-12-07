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
public class Level4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //masukkan nilai
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double tinggi = input.nextDouble();
        
        System.out.println("The area is " + hitungLuasAlas(radius));
        System.out.println("The volume of the cylinder is " + hitungVolume(hitungLuasAlas(radius), tinggi));
    }

    //fungsi luas alas
    public static double hitungLuasAlas(double rad) {
        double luasAlas = rad * rad * 3.14159;
        return luasAlas;
    }

    //fungsi volume
    public static double hitungVolume(double luasAlas, double tinggi) {
        double volume = luasAlas * tinggi;
        return volume;
    }
}
