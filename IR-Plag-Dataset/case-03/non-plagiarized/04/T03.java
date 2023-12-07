
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
public class T03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = s.nextDouble();
        System.out.print("Enter feet: ");
        double feet = s.nextDouble();
        System.out.print("Enter inches: ");
        double inches = s.nextDouble();

        double height = feet * 12 + inches;
        double bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
        System.out.println("BMI Is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<35){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
