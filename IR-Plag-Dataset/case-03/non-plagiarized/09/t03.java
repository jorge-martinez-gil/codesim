/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 51BE04B11C5F2F5AD96A396632DC3F76
 */
import java.util.Scanner;

public class t03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double weight = sc.nextDouble();

        System.out.print("Enter feet : ");
        double feet = sc.nextDouble();

        System.out.print("Enter inches : ");
        double inches = sc.nextDouble();

        double height = feet * 12 + inches;
        double bmi = weight * 0.45359237 / ((height * 0.0254)
                * (height * 0.0254));
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("normal");
        } else if (bmi >= 25 && bmi < 35) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }

    }
}
