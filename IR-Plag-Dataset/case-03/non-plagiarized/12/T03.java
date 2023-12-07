
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 95F548D9E3DDDD7F63A8FCEF1E4957F4 F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
public class T03 {

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
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 35) {
            System.out.println("Overweight");
        } else {
            System.out.println("obese");
        }
    }
}
