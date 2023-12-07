
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
public class Kasus3 {
    
    public static double hitungTinggi(double feet, double inches) {
        return feet * 12 + inches;
    }
    
    public static double hitungBmi(double weight, double height) {
        return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        // Prompt the user to enter height 
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        double height = hitungTinggi(feet, inches);
        // Compute BMI
        double bmi = hitungBmi(weight, height);
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
