
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
        Scanner in = new Scanner(System.in);
        double berat = 0;
        double feet, inches, tinggi = 0;

        System.out.print("Enter weight in pounds: "); berat = in.nextDouble();
        System.out.print("Enter feet: "); feet = in.nextDouble();
        System.out.print("Enter inches: "); inches = in.nextDouble();
        
        tinggi = feet * 12 + inches;
        
        bmi(berat, tinggi);
    }
    
    private static void bmi(double weight, double height) {
        double bmi = weight * 0.45359237 / Math.pow((height * 0.0254), 2);
        
        System.out.println("BMI is " + bmi);
        
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
