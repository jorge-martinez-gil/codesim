
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Masukan beban dalam satuan pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        // Masukan tinggi dalam satuan kaki dan inci
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        double height = feet * 12 + inches;
        // Hitung bmi di sini
        double bmi = weight * 0.45359237
                / ((height * 0.0254) * (height * 0.0254));
        // Print hasil di sini
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
