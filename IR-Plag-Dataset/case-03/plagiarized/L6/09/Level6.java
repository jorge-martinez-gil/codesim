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
        double berat, feet,inches, tinggi;

        System.out.print("Enter weight in pounds: ");
        berat = in.nextDouble();
        System.out.print("Enter feet: ");
        feet = in.nextDouble();
        System.out.print("Enter inches: ");
        inches = in.nextDouble();
        
        result(fungsiBmi(berat, feet, inches));
    }

    private static double fungsiBmi(double berat, double feet, double inches) {
        double tinggi = feet * 12 + inches;
        return berat * 0.45359237 / Math.pow((tinggi * 0.0254), 2);
    }
    
    private static void result(double res) {
        System.out.println("BMI is " + res);
        if (res < 18.5)
            System.out.println("Underweight");
        else if (res >= 18.5 && res < 25)
            System.out.println("Normal");
        else if (res >= 25 && res < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
