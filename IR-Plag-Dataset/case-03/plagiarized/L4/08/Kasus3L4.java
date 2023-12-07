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
public class Kasus3L4 {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Scanner inp = new Scanner(System.in);
        double berat = inp.nextDouble();

        System.out.print("Enter feet: ");
        double kaki = inp.nextDouble();
        System.out.print("Enter inches: ");
        double inch = inp.nextDouble();
        double tinggi = kaki * 12 + inch;

        double rata = hitungBMI(berat, tinggi);

        BMIKategori(rata);
    }
    
    private static double hitungBMI(double weight, double height){
        return weight * 0.45359237 /((height * 0.0254) * (height * 0.0254));
    }
    
    private static void BMIKategori(double BMI){
        System.out.println("BMI is " + BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
