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
public class Level4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double berat;
        double kaki;
        double inchi;
        double tinggi;

        System.out.print("Enter weight in pounds: ");
        berat = in.nextDouble();
        System.out.print("Enter feet: ");
        kaki = in.nextDouble();
        System.out.print("Enter inches: ");
        inchi = in.nextDouble();
        tinggi = kaki * 12 + inchi;

        hitungBmi(berat, tinggi);
    }

    //calculate BMI and output message
    private static void hitungBmi(double weight, double height) {
        double bmi;
        bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        else if (bmi < 25)
        {
            System.out.println("Normal");
        }
        else if (bmi < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
    }
}
