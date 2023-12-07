
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double berat = in.nextDouble();
        System.out.print("Enter feet: ");
        double feet = in.nextDouble();
        System.out.print("Enter inches: ");
        double inches = in.nextDouble();
        double tinggi = feet * 12 + inches;

        double bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254));

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
