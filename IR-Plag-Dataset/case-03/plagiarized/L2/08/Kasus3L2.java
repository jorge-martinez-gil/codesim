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
public class Kasus3L2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double berat = inp.nextDouble();

        System.out.print("Enter feet: ");
        double kaki = inp.nextDouble();
        System.out.print("Enter inches: ");
        double inch = inp.nextDouble();
        double tinggi = kaki * 12 + inch;

        double rata = berat * 0.45359237 /((tinggi * 0.0254) * (tinggi * 0.0254));

        System.out.println("BMI is " + rata);
        if (rata < 18.5)
            System.out.println("Underweight");
        else if (rata < 25)
            System.out.println("Normal");
        else if (rata < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
